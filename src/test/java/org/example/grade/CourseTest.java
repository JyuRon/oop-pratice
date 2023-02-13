package org.example.grade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @DisplayName("과목(코스)를 생성한다")
    @Test
    void createTest(){
        assertThatCode(() -> new Course("OOP",3,"A+"))
                .doesNotThrowAnyException();
    }
}