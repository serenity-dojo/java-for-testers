package com.serenitydojo.module13exceptions;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Exercises 13.1 and 13.2: Introduction to exceptions, and checked and unchecked exceptions.
 * <p>
 * Each test does something that throws an exception. Replace the placeholder with the exception that is thrown.
 */
class WhenWorkingWithExceptionsTest {

    @Test
    void dividingByZero() {
        // TODO: which exception does this throw? (hint: the name begins with Arithmetic)
        Class<? extends Throwable> expected = RuntimeException.class;

        assertThatThrownBy(() -> System.out.println(10 / zero())).isExactlyInstanceOf(expected);
    }

    @Test
    void convertingTextThatIsNotANumber() {
        // TODO: which exception does Integer.parseInt("abc") throw?
        Class<? extends Throwable> expected = RuntimeException.class;

        assertThatThrownBy(() -> Integer.parseInt("abc")).isExactlyInstanceOf(expected);
    }

    @Test
    void readingOutsideTheBoundsOfAnArray() {
        int[] numbers = {1, 2, 3};

        // TODO: which exception is thrown when you read numbers[3]?
        Class<? extends Throwable> expected = RuntimeException.class;

        assertThatThrownBy(() -> System.out.println(numbers[3])).isExactlyInstanceOf(expected);
    }

    @Test
    void usingANullReference() {
        String name = null;

        // TODO: which exception is thrown when you call a method on null?
        Class<? extends Throwable> expected = RuntimeException.class;

        assertThatThrownBy(() -> name.length()).isExactlyInstanceOf(expected);
    }

    @Test
    void changingAnImmutableList() {
        List<String> colors = List.of("red", "green");

        // TODO: which exception is thrown when you try to add to a list created with List.of()?
        Class<? extends Throwable> expected = RuntimeException.class;

        assertThatThrownBy(() -> colors.add("blue")).isExactlyInstanceOf(expected);
    }

    @Test
    void readingAFileThatDoesNotExist() {
        // TODO: which (checked) exception is thrown when the file does not exist? It lives in java.nio.file
        Class<? extends Throwable> expected = RuntimeException.class;

        assertThatThrownBy(() -> Files.readString(Path.of("no-such-file.txt"))).isExactlyInstanceOf(expected);
    }

    @Test
    void checkedExceptionsMustBeHandledByTheCompiler() {
        // TODO: for each exception class, say whether it is a checked exception (true) or unchecked (false).
        //       Checked exceptions extend Exception but not RuntimeException.
        boolean ioExceptionIsChecked = false;
        boolean illegalArgumentExceptionIsChecked = true;
        boolean insufficientFundsExceptionIsChecked = false;
        boolean missingWelcomeFileExceptionIsChecked = true;

        assertThat(isChecked(IOException.class)).isEqualTo(ioExceptionIsChecked);
        assertThat(isChecked(IllegalArgumentException.class)).isEqualTo(illegalArgumentExceptionIsChecked);
        assertThat(isChecked(InsufficientFundsException.class)).isEqualTo(insufficientFundsExceptionIsChecked);
        assertThat(isChecked(MissingWelcomeFileException.class)).isEqualTo(missingWelcomeFileExceptionIsChecked);
    }

    @Test
    void exceptionsHaveMessagesAndCauses() {
        IllegalStateException exception = new IllegalStateException("Something went wrong", new IOException("disk full"));

        // TODO: check the message of the exception, and the type of its cause
        org.junit.jupiter.api.Assertions.fail("TODO: assert the message is 'Something went wrong' and the cause is an IOException");
    }

    private static int zero() {
        return 0;
    }

    private static boolean isChecked(Class<? extends Throwable> type) {
        return Exception.class.isAssignableFrom(type) && !RuntimeException.class.isAssignableFrom(type);
    }
}
