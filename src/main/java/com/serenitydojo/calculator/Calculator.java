package com.serenitydojo.calculator;

import com.google.common.base.Splitter;
import com.serenitydojo.exceptions.IllegalMathsOperatorException;

import java.util.List;

import static org.apache.commons.lang3.StringUtils.isEmpty;

public class Calculator {
    public int evaluate(String expression) {
        int result = 0;

        if(expression.length() == 1){
            return Integer.parseInt(expression);
        }

        if(isEmpty(expression)){
            return 0;
        }

        List<String> listExpression = Splitter.on(" ").splitToList(expression);
        int loops = 0;
        for(int i = 0; i<listExpression.size()-2; i++){
            if(loops!=0){
                loops+=1;
                result = doTheMath(String.valueOf(result), listExpression.get(loops+1), listExpression.get(loops+2));
            }else {
                result = doTheMath(listExpression.get(loops), listExpression.get(loops + 1), listExpression.get(loops + 2));
            }
            loops+=1;
            i++;
        }
        return result;
    }

    private int doTheMath(String operand1, String operator, String operand2) {
        if (operator.contains("+")) {
           return(Integer.parseInt(operand1) + Integer.parseInt(operand2));
        } else if (operator.contains("-")) {
            return(Integer.parseInt(operand1) - Integer.parseInt(operand2));
        } else if (operator.contains("*")) {
            return(Integer.parseInt(operand1) * Integer.parseInt(operand2));
        } else if (operator.contains("/")) {
            return(Integer.parseInt(operand1) / Integer.parseInt(operand2));
        } else {
            throw new IllegalMathsOperatorException("This is not supported");
        }
    }
}
