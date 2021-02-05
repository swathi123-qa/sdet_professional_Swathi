package com.devlabs.lab8;

public class StringComparision {

    public static void main(String[] args) {
        String str1="SDET Professional";
        String str2="SDet Professional";
        /*if (str1.equals(str2))
        {
            System.out.println("String1 is equal to String2");
        }
        else 
        {
            System.out.println("String1 is not equal to String2");
        }*/
        
        if (str1.equalsIgnoreCase(str2))
        {
            System.out.println("String1 is equal to String2");
        }
        else 
        {
            System.out.println("String1 is not equal to String2");
        }
    }
    }