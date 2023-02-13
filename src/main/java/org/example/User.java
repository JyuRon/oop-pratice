package org.example;

public class User {
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public void initPassword(PasswordGeneratePolicy passwordGenerator){
        // as-is
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

        // to-be
        String randomPassword = passwordGenerator.generatePassword();

        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다
         */
        if(randomPassword.length() >= 8 && randomPassword.length() <= 12 ){
            this.password = randomPassword;
        }

    }
}
