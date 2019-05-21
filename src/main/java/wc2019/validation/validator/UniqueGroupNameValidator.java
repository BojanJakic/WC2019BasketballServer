package wc2019.validation.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import wc2019.models.enums.GroupName;
import wc2019.services.TeamGroupService;
import wc2019.validation.annotation.UniqueGroupName;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class UniqueGroupNameValidator implements ConstraintValidator<UniqueGroupName, GroupName> {

    private TeamGroupService teamGroupService;

    @Autowired
    public UniqueGroupNameValidator(TeamGroupService teamGroupService) {
        this.teamGroupService = teamGroupService;
    }

    @Override
    public void initialize(UniqueGroupName constraintAnnotation) { }

    @Override
    public boolean isValid(GroupName value, ConstraintValidatorContext context) {
        return teamGroupService.findByName(value) == null;
    }
}
