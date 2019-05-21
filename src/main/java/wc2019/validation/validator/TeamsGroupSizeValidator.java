package wc2019.validation.validator;

import org.springframework.stereotype.Component;
import wc2019.models.RealTeam;
import wc2019.validation.annotation.TeamsGroupSize;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

@Component
public class TeamsGroupSizeValidator implements ConstraintValidator<TeamsGroupSize, List<RealTeam>> {

    @Override
    public void initialize(TeamsGroupSize constraintAnnotation) {}

    @Override
    public boolean isValid(List<RealTeam> teams, ConstraintValidatorContext context) {
        return teams.size() == 4;
    }
}
