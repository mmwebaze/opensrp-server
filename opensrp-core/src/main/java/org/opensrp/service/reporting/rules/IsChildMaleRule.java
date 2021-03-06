package org.opensrp.service.reporting.rules;

import org.opensrp.util.SafeMap;
import org.springframework.stereotype.Component;

import static org.opensrp.common.AllConstants.CommonChildFormFields.GENDER;
import static org.opensrp.common.AllConstants.CommonChildFormFields.MALE_VALUE;

@Component
public class IsChildMaleRule implements IRule {

    @Override
    public boolean apply(SafeMap reportFields) {
        return MALE_VALUE.equalsIgnoreCase(reportFields.get(GENDER));
    }
}
