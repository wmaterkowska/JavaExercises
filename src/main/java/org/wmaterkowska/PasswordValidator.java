package org.wmaterkowska;

public class PasswordValidator {


    public static Boolean validatePassword( String S) {
        Boolean secure = false;

        if (S.length() > 6 && S.matches(".*[0-9].*") == true && S.matches(".*\\ .*") == false
                && S.matches(".*[\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\_].*") == true && S.matches((".*[A-Z].*")) ) {
            secure = true;
        }

        // System.out.println(secure +  " secure");
        // System.out.println( S.matches("[!@]+"));
//        System.out.println( S.matches("[0-9]+"));
//        System.out.println(Pattern.matches("[0-9]", S));

        return secure;
    }
}
