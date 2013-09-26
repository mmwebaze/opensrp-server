package org.ei.drishti.common.domain;

import static org.apache.commons.lang.StringUtils.equalsIgnoreCase;

public enum Indicator {
    //FP Indicators
    FP_OCP("OCP"), FP_IUD("IUD"), FP_MALE_STERILIZATION("MALE_STERILIZATION"), FP_FEMALE_STERILIZATION("FEMALE_STERILIZATION"),
    FP_CONDOM("CONDOM"), FP_DMPA("DMPA"), FP_OCP_ST("OCP_ST"), FP_OCP_SC("OCP_SC"), FP_OCP_CASTE_OTHERS("OCP_C_OTHERS"),
    FP_TRADITIONAL_METHOD("FP_TRADITIONAL"), FP_LAM("LAM"), FP_FEMALE_STERILIZATION_APL("FS_APL"), FP_FEMALE_STERILIZATION_BPL("FS_BPL"),

    //ANC Indicators
    ANC("ANC"), ANC_BEFORE_12_WEEKS("ANC<12"), ANC4("ANC4"),
    TT1("TT1"), TT2("TT2"), TTB("TTB"), SUB_TT("SUB_TT"),

    MTP_LESS_THAN_12_WEEKS("MTP<12"), MTP_GREATER_THAN_12_WEEKS("MTP>12"), SPONTANEOUS_ABORTION("SPONTANEOUS_ABORTION"),

    MOTHER_MORTALITY("MM"), MMA("MMA"), MMD("MMD"), MMP("MMP"),

    //Delivery Outcome Indicators
    LIVE_BIRTH("LIVE_BIRTH"), STILL_BIRTH("STILL_BIRTH"), DELIVERY("DELIVERY"), INSTITUTIONAL_DELIVERY("INSTITUTIONAL_DELIVERY"),
    D_HOM("D_HOM"), D_SC("D_SC"), D_PHC("D_PHC"), D_CHC("D_CHC"), D_SDH("D_SDH"), D_DH("D_DH"), D_PRI("D_PRI"),
    CESAREAN("CESAREAN"), CESAREAN_PRIVATE_FACILITY("CESAREAN_PRI"), CESAREAN_GOVERNMENT_FACILITY("CESAREAN_GOV"),

    //PNC Indicators
    PNC3("PNC3"),

    //Child Birth Indicators
    LBW("LBW"), BF_POST_BIRTH("BF_POST_BIRTH"), WEIGHED_AT_BIRTH("WEIGHED_AT_BIRTH"), INFANT_REGISTRATION("INFANT_REG"),

    CHILD_DIARRHEA("CHILD_DIARRHEA"),

    //Child Immunization Indicators
    DPT("DPT"), PENTAVALENT3_OR_OPV3("PENTAVALENT3_OPV3"), DPT_BOOSTER_OR_OPV_BOOSTER("DPTB_OPVB"),
    DPT_BOOSTER2("DPT_BOOSTER_2"), HEP("HEP"), OPV("OPV"), MEASLES("MEASLES"),
    BCG("BCG"), PENT1("PENT1"), PENT2("PENT2"), PENT3("PENT3"), MMR("MMR"), JE("JE"),

    //Vitamin A Indicators
    VIT_A_1("VIT_A_1"), VIT_A_1_FOR_FEMALE_CHILD("F_VIT_A_1"), VIT_A_1_FOR_MALE_CHILD("M_VIT_A_1"),
    VIT_A_2("VIT_A_2"), VIT_A_2_FOR_FEMALE_CHILD("F_VIT_A_2"), VIT_A_2_FOR_MALE_CHILD("M_VIT_A_2"),
    VIT_A_5_FOR_FEMALE_CHILD("F_VIT_A_5"), VIT_A_5_FOR_MALE_CHILD("M_VIT_A_5"),
    VIT_A_9_FOR_FEMALE_CHILD("F_VIT_A_9"), VIT_A_9_FOR_MALE_CHILD("M_VIT_A_9"),
    VIT_A_FOR_FEMALE("F_VIT_A"), VIT_A_FOR_MALE("M_VIT_A"),

    //Child Mortality Indicators
    NM("NM"), LNM("LNM"), ENM("ENM"), INFANT_MORTALITY("IM"), CHILD_MORTALITY_DUE_TO_DIARRHEA("CMD"),
    CHILD_MORTALITY("UFM"), INFANT_BALANCE_TOTAL("IBT"), INFANT_BALANCE_ON_HAND("IB_OH"), INFANT_LEFT("INFANT_LEFT"),
    CONDOM_QTY("CONDOM_QTY"),

    //NRHM Indicators
    NRHM_JSY_REG("NRHM_JSY_REG"), NRHM_ANC3("NRHM_ANC3"), NRHM_SBA("NRHM_SBA"), NRHM_NON_SBA("NRHM_NON_SBA"),
    NRHM_HB_LEVEL("NRHM_HB_LEVEL"), NRHM_PNC24("NRHM_PNC24"), NRHM_SC_DEL("NRHM_SC_DEL"), NRHM_48HRS("NRHM_48HRS"),
    NRHM_PNC_V_2D("NRHM_PNC_V_2D"), NRHM_PNC_V_14D("NRHM_PNC_V_14D"), NRHM_IUDREM("NRHM_IUDREM"), NRHM_OCP_STRIPS("NRHM_OCP_STRIPS");

    private String value;

    Indicator(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public static Indicator from(String name) {
        Indicator[] indicators = values();
        for (Indicator indicator : indicators) {
            if (equalsIgnoreCase(indicator.value(), name)) {
                return indicator;
            }
        }
        return null;
    }
}
