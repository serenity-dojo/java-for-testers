package com.serenitydojo.module14advanced;

import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Exercise 14.6: Advanced enums. Complete the Operation enum.
 */
class WhenUsingAdvancedEnumsTest {

    @Test
    void eachOperationHasASymbol() {
        assertThat(Operation.ADD.getSymbol()).isEqualTo("+");
        assertThat(Operation.SUBTRACT.getSymbol()).isEqualTo("-");
        assertThat(Operation.MULTIPLY.getSymbol()).isEqualTo("*");
        assertThat(Operation.DIVIDE.getSymbol()).isEqualTo("/");
    }

    @Test
    void eachOperationKnowsHowToCalculate() {
        assertThat(Operation.ADD.apply(6, 3)).isEqualTo(9.0);
        assertThat(Operation.SUBTRACT.apply(6, 3)).isEqualTo(3.0);
        assertThat(Operation.MULTIPLY.apply(6, 3)).isEqualTo(18.0);
        assertThat(Operation.DIVIDE.apply(6, 3)).isEqualTo(2.0);
    }

    @Test
    void dividingByZeroIsNotAllowed() {
        assertThatThrownBy(() -> Operation.DIVIDE.apply(6, 0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Cannot divide by zero");
    }

    @Test
    void anOperationCanBeFoundFromItsSymbol() {
        assertThat(Operation.fromSymbol("+")).isEqualTo(Operation.ADD);
        assertThat(Operation.fromSymbol("/")).isEqualTo(Operation.DIVIDE);
    }

    @Test
    void anUnknownSymbolIsRejected() {
        assertThatThrownBy(() -> Operation.fromSymbol("%"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("%");
    }

    @Test
    void anEnumMapIsAFastMapWithEnumKeys() {
        Map<Operation, Integer> timesUsed = new EnumMap<>(Operation.class);
        timesUsed.put(Operation.MULTIPLY, 2);
        timesUsed.put(Operation.ADD, 5);

        assertThat(timesUsed.keySet()).containsExactly(Operation.ADD, Operation.MULTIPLY);
    }

    @Test
    void enumsCanBeUsedWithAStringSwitch() {
        Operation operation = Operation.valueOf("SUBTRACT");

        String description = switch (operation) {
            case ADD, SUBTRACT -> "additive";
            case MULTIPLY, DIVIDE -> "multiplicative";
        };

        assertThat(description).isEqualTo("additive");
    }
}
