package com.serenitydojo.module07conditionals;

/**
 * Exercise 7.2b: Nested conditionals.
 */
public class TicketPricer {

    /**
     * Calculates the price of a cinema ticket.
     * <ul>
     *   <li>Children under 5 get in free (even at the weekend)</li>
     *   <li>Children from 5 to 15 pay 6.00</li>
     *   <li>Seniors aged 65 and over pay 7.00</li>
     *   <li>Everyone else pays 12.00, or 8.00 if they are a student</li>
     *   <li>At the weekend, everyone who is not free pays an extra 2.00</li>
     * </ul>
     *
     * @throws IllegalArgumentException if the age is negative
     */
    public double priceFor(int age, boolean student, boolean weekend) {
//@@ solution
        if (age < 0) {
            throw new IllegalArgumentException("The age cannot be negative");
        }
        if (age < 5) {
            return 0.00;
        }

        double price;
        if (age < 16) {
            price = 6.00;
        } else if (age >= 65) {
            price = 7.00;
        } else {
            if (student) {
                price = 8.00;
            } else {
                price = 12.00;
            }
        }

        if (weekend) {
            price += 2.00;
        }
        return price;
//@@ starter
        // TODO: use nested conditions to apply the rules above
        return 0;
//@@ end
    }
}
