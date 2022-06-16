package com.company;

public class Main {

        public static String reverse(String str) {
            return new StringBuilder(str).reverse().toString();
        }

        public static void main(String[] args)
        {
            String str = "The Internet";

            // Note that string is immutable in Java
            str = reverse(str);

            System.out.println("The reverse of the given string is: " + str);
            System.out.println("Hey there, im here");
            System.out.println("Nice to meet you");
        }
    }


