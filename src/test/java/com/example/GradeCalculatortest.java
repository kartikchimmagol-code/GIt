package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class GradeCalculatortest {
	@Test
    void testGrade() {
        assertEquals("Grade:A+", GradeCalculator.Grade(80));
        assertEquals("Grade:A", GradeCalculator.Grade(75));
    }
	@Test
    void testGrades() {
        assertEquals("Grade:A+", GradeCalculator.Grade(80));
        assertEquals("Grade:A", GradeCalculator.Grade(75));
    }
}