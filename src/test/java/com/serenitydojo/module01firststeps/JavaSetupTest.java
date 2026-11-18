package com.serenitydojo.module01firststeps;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 1.2: check that Java is installed correctly.
 * <p>
 * This test needs no changes. If it passes, your Java setup is ready for the rest of the course.
 */
class JavaSetupTest {

    @Test
    void javaShouldBeInstalledAndRecentEnough() {
        int javaVersion = Runtime.version().feature();

        System.out.println("Running on Java " + javaVersion);

        assertThat(javaVersion).isGreaterThanOrEqualTo(21);
    }
}
