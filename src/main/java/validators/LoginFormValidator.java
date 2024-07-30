package validators;

import annotations.ValidLoginForm;
//import lombok.AllArgsConstructor;
import lombok.AllArgsConstructor;
import model.LoginForm;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Component
@AllArgsConstructor
public class LoginFormValidator
            implements ConstraintValidator< ValidLoginForm, LoginForm>
    {

    //Validate Email
    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }
    //Check password fields match
    public static boolean isPasswordsMatching (String password, String confirmPassword){
        return true;
    }
    //Check that password does not contain first or last name
    public static boolean isPasswordContainFirstOrLastName (String password){
        if(password.contains("") || password.contains("")){
            return false;
        }
        return true;
    }
    //Check that password is > 8 and < 255
    public static boolean isPasswordCorrectLength (String password){
        if(password.length() > 8 && password.length() < 256) {
            return true;
        }
        return false;
    }
    //Check at least one number
    public static boolean isPasswordContainNumber (String password){
        if(password.matches(".*\\d.*")) {
            return true;
        }
        return false;
    }
    //Check for one special character
    public static boolean isPasswordContainSpecialChar (String password){
        if(password.contains("[!@#$%&*()_+=|<>?{}\\[\\]~-]")) {
           return true;
        }
        return false;
    }
    //All fields are required
    public static boolean isAllFormFeildsPresent (String password){
        if(password.length() > 8 && password.length() < 256) {
            return true;
        }
        return false;
    }

    public static boolean Password_Validation(String password)
    {

        if(password.length()>=8 && password.length()<=255)
        {
            Pattern letter = Pattern.compile("[a-zA-z]");
            Pattern digit = Pattern.compile("[0-9]");
            Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

            Matcher hasLetter = letter.matcher(password);
            Matcher hasDigit = digit.matcher(password);
            Matcher hasSpecial = special.matcher(password);

            return hasLetter.find() && hasDigit.find() && hasSpecial.find();

        }
        else
            return false;

    }

        @Override
        public boolean isValid(LoginForm loginForm, ConstraintValidatorContext constraintValidatorContext) {
            return false;
        }
    }
