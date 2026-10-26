package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
       //Create the Array that contains 10 quotes
        //USe /"" to insert quotes in a string
       //Adding a scanner
        Scanner user = new Scanner(System.in);
        String[] favQuotes = new String[10];

       favQuotes[0] = "\"An Apple a day keeps the doctor away\"";
       favQuotes[1] = "\"Fall seven times, standvup 8\"";
       favQuotes[2] = "\"No pressure, No diamonds\"";
       favQuotes[3] = "\"Whether you think you can or you think you can't, you're right\"";
       favQuotes[4] = "\"Thinking will not overcome fear, but action will.\"";
       favQuotes[5] = "\"Once you choose hope, anything's possible\"";
       favQuotes[6] = "\"Life is a journey, not a destination.\"";
       favQuotes[7] = "\"Try to be a rainbow in someone else's cloud\"";
       favQuotes[8] = "\"You miss 100% of the shots you font take.\"";
       favQuotes[9] = "\"No one can make you feel inferior without your consent\"";

        System.out.println("Pick a quote (1-10): ");
        System.out.println(favQuotes[user.nextInt()-1]);



}
}
