package com.serenitydojo;

import org.junit.Test;

public class NewExercise {
    @Test
    public void convertToLowerCase(){
  //Converting to lower case
        String bookTitle = "THE CAT IN THE HAT";

        String lowerCaseTitle = bookTitle.toLowerCase();

        System.out.println(lowerCaseTitle);

    }

    @Test
    public void convertToUpperCase(){
        //Converting to upper case
              String bookTitle = "the cat in the hat";

              String upperCaseTitle = bookTitle.toUpperCase();

              System.out.println(upperCaseTitle);
    }

    @Test
    public void trimExtraSpace(){
        //Trim extra space

            String bookTitle = "  The Cat In The Hat  ";

            String str = "  The Cat In The Hat  ";

            System.out.println(str);

            System.out.println(str.trim());

    }

       @Test
        public void findingTheLengthOfaString(){
            // Finding The Length Of A String

           String bookTitle = "The Cat In The Hat";

           int stringSize= bookTitle.length();

           System.out.println(bookTitle);

       }


    @Test
    public void replacingTextInAstring() {
        //Replacing text in a string

       String  bookTitle= "The Cat In The Hat";

       String updatedTitle = bookTitle.replace("Hat", "Basket");

       System.out.println(updatedTitle);

    }


     }
