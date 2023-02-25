package com.driver;

public class Email {

    private String emailId;
    private String password;


    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public boolean check(String password)
    {
        if(password.length()<8) return false;
        boolean upper=false;
        boolean lower=false;
        boolean digit=false;
        boolean special=false;
        for (int i=0;i<password.length();i++) {
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') upper = true;
            else if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') lower = true;
            else if (password.charAt(i) >= '1' && password.charAt(i) <= '9') digit = true;
            else special = true;
        }
        return upper && lower && digit && special;
    }
    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(oldPassword.equals(password))
        {
            if (check(newPassword))
            {
                password=newPassword;
            }
        }
    }
}
