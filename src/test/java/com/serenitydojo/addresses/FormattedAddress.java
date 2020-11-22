package com.serenitydojo.addresses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormattedAddress {

    private final static Pattern POSTFIX_WITH_NO = Pattern.compile("(.*) No (\\d.*)");
    private final static Pattern POSTFIX_WITH_COMMA = Pattern.compile("(\\D+), (\\d.*)");
    private final static Pattern POSTFIX_NUMBER = Pattern.compile("(\\D+) (\\d.*)");
    private final static Pattern PREFIX_NUMBER = Pattern.compile("(\\d+),? (.*)");

    public static String of(String externalAddress) {
        if (POSTFIX_WITH_NO.matcher(externalAddress).matches()) {
            return postfixNumberWithNo(externalAddress).asJson();
        } else if (POSTFIX_WITH_COMMA.matcher(externalAddress).matches()) {
            return postfixNumberWithComma(externalAddress).asJson();
        } else if (POSTFIX_NUMBER.matcher(externalAddress).matches()) {
            return postfixNumber(externalAddress).asJson();
        } else if (PREFIX_NUMBER.matcher(externalAddress).matches()) {
            return prefixNumber(externalAddress).asJson();
        }
        throw new IllegalArgumentException("Badly formed address: " + externalAddress);
    }

    private static AddressLine postfixNumberWithNo(String externalAddress) {
        Matcher matcher = POSTFIX_WITH_NO.matcher(externalAddress);
        matcher.find();
        return new AddressLine(matcher.group(1), "No " + matcher.group(2));
    }

    private static AddressLine postfixNumber(String externalAddress) {
        Matcher matcher = POSTFIX_NUMBER.matcher(externalAddress);
        matcher.find();
        return new AddressLine(matcher.group(1), matcher.group(2));
    }

    private static AddressLine postfixNumberWithComma(String externalAddress) {
        Matcher matcher = POSTFIX_WITH_COMMA.matcher(externalAddress);
        matcher.find();
        return new AddressLine(matcher.group(1), matcher.group(2));
    }

    private static AddressLine prefixNumber(String externalAddress) {
        Matcher matcher = PREFIX_NUMBER.matcher(externalAddress);
        matcher.find();
        return new AddressLine(matcher.group(2), matcher.group(1));
    }

}
