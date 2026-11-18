package com.serenitydojo.module15junit;

/**
 * Checks whether a password is strong enough. This class is complete - you do not need to change it.
 * <p>
 * A strong password has at least 8 characters, and contains an upper case letter,
 * a lower case letter, a digit and a special character (anything that is not a letter or digit).
 */
public class PasswordValidator {

    public boolean isStrong(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}
