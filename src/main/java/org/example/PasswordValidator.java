package org.example;

/**
 * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 * 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생 시킨다.
 * 경계조건에 대해 테스트 코드를 작성해야 한다
 */
public class PasswordValidator {

    public static final String WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE = "패스워드는 8자 이상 12자 이하여야 합니다.";

    public static void validate(String password) {

        int length = password.length();

        if(length < 8 || length > 12){
            throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
        }
    }
}
