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
//@@ solution
        Class<? extends Throwable> expected = ArithmeticException.class;
//@@ starter
        Class<? extends Throwable> expected = RuntimeException.class;
//@@ end

        assertThatThrownBy(() -> System.out.println(10 / zero())).isExactlyInstanceOf(expected);
    }

    @Test
    void convertingTextThatIsNotANumber() {
        // TODO: which exception does Integer.parseInt("abc") throw?
//@@ solution
        Class<? extends Throwable> expected = NumberFormatException.class;
//@@ starter
        Class<? extends Throwable> expected = RuntimeException.class;
//@@ end

        assertThatThrownBy(() -> Integer.parseInt("abc")).isExactlyInstanceOf(expected);
    }

    @Test
    void readingOutsideTheBoundsOfAnArray() {
        int[] numbers = {1, 2, 3};

        // TODO: which exception is thrown when you read numbers[3]?
//@@ solution
        Class<? extends Throwable> expected = ArrayIndexOutOfBoundsException.class;
//@@ starter
        Class<? extends Throwable> expected = RuntimeException.class;
//@@ end

        assertThatThrownBy(() -> System.out.println(numbers[3])).isExactlyInstanceOf(expected);
    }

    @Test
    void usingANullReference() {
        String name = null;

        // TODO: which exception is thrown when you call a method on null?
//@@ solution
        Class<? extends Throwable> expected = NullPointerException.class;
//@@ starter
        Class<? extends Throwable> expected = RuntimeException.class;
//@@ end

        assertThatThrownBy(() -> name.length()).isExactlyInstanceOf(expected);
    }

    @Test
    void changingAnImmutableList() {
        List<String> colors = List.of("red", "green");

        // TODO: which exception is thrown when you try to add to a list created with List.of()?
//@@ solution
        Class<? extends Throwable> expected = UnsupportedOperationException.class;
//@@ starter
        Class<? extends Throwable> expected = RuntimeException.class;
//@@ end

        assertThatThrownBy(() -> colors.add("blue")).isExactlyInstanceOf(expected);
    }

    @Test
    void readingAFileThatDoesNotExist() {
        // TODO: which (checked) exception is thrown when the file does not exist? It lives in java.nio.file
//@@ solution
        Class<? extends Throwable> expected = java.nio.file.NoSuchFileException.class;
//@@ starter
        Class<? extends Throwable> expected = RuntimeException.class;
//@@ end

        assertThatThrownBy(() -> Files.readString(Path.of("no-such-file.txt"))).isExactlyInstanceOf(expected);
    }

    @Test
    void checkedExceptionsMustBeHandledByTheCompiler() {
        // TODO: for each exception class, say whether it is a checked exception (true) or unchecked (false).
        //       Checked exceptions extend Exception but not RuntimeException.
//@@ solution
        boolean ioExceptionIsChecked = true;
        boolean illegalArgumentExceptionIsChecked = false;
        boolean insufficientFundsExceptionIsChecked = true;
        boolean missingWelcomeFileExceptionIsChecked = false;
//@@ starter
        boolean ioExceptionIsChecked = false;
        boolean illegalArgumentExceptionIsChecked = true;
        boolean insufficientFundsExceptionIsChecked = false;
        boolean missingWelcomeFileExceptionIsChecked = true;
//@@ end

        assertThat(isChecked(IOException.class)).isEqualTo(ioExceptionIsChecked);
        assertThat(isChecked(IllegalArgumentException.class)).isEqualTo(illegalArgumentExceptionIsChecked);
        assertThat(isChecked(InsufficientFundsException.class)).isEqualTo(insufficientFundsExceptionIsChecked);
        assertThat(isChecked(MissingWelcomeFileException.class)).isEqualTo(missingWelcomeFileExceptionIsChecked);
    }

    @Test
    void exceptionsHaveMessagesAndCauses() {
        IllegalStateException exception = new IllegalStateException("Something went wrong", new IOException("disk full"));

        // TODO: check the message of the exception, and the type of its cause
//@@ solution
        assertThat(exception).hasMessage("Something went wrong").hasCauseInstanceOf(IOException.class);
//@@ starter
        org.junit.jupiter.api.Assertions.fail("TODO: assert the message is 'Something went wrong' and the cause is an IOException");
//@@ end
    }

    private static int zero() {
        return 0;
    }

    private static boolean isChecked(Class<? extends Throwable> type) {
        return Exception.class.isAssignableFrom(type) && !RuntimeException.class.isAssignableFrom(type);
    }
}
