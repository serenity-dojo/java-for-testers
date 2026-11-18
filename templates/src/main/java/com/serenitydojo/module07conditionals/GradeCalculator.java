package com.serenitydojo.module07conditionals;

/**
 * Exercise 7.1a: Simple conditional logic.
 */
public class GradeCalculator {

    /**
     * Converts a score into a grade:
     * 90-100 is an "A", 80-89 is a "B", 70-79 is a "C", 60-69 is a "D" and anything lower is an "F".
     * Scores below 0 or above 100 are "Invalid".
     */
    public String gradeFor(int score) {
//@@ solution
        if (score < 0 || score > 100) {
            return "Invalid";
        }
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        }
        return "F";
//@@ starter
        // TODO: use if / else if / else to work out the grade
        return "";
//@@ end
    }
}
