package org.example;

public class WrongFixedPasswordGenerator implements PasswordGeneratePolicy{
    @Override
    public String generatePassword() {
        return "ab"; // 8글자
    }
}
