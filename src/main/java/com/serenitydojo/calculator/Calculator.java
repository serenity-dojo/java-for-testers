package com.serenitydojo.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public int evaluate(String expression)
    {
        if(!expression.isEmpty()) {
            String[] inputString = expression.split(" ");
            int i = 1;
            int total = Integer.parseInt(inputString[0]);
            while (i < inputString.length) {
                switch (inputString[i]) {
                    case "+":
                        total = total + Integer.parseInt(inputString[i + 1]);
                        i = i + 2;
                        break;
                    case "-":
                        total = total - Integer.parseInt(inputString[i + 1]);
                        i = i + 2;
                        break;
                    case "*":
                        total = total * Integer.parseInt(inputString[i + 1]);
                        i = i + 2;
                        break;
                    default:
                        throw new IllegalMathsOperatorException("Operator Not Found "+inputString[i]);
                }
            }
            return total;
        }
        else
        {
            return 0;
        }

    }
}
