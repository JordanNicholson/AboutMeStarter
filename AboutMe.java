/*
 * Programmer: Jordan Nicholson
 * Date: September 22, 2020
 * Purpose: To learn about me.
 */

public class AboutMe {
    public static void main (String [] args) {
        // Declaring the variables
    	
        int myAge= 16;
        String myName= "Jordan.";
        double myHeightInMetres= 1.73;
    	

        // Print the values
        System.out.println("Hi, my name is " + myName);
        System.out.println("I am " + myAge + " years old.");
        System.out.println("My height is " + myHeightInMetres + " m.");

        // Change the variables
        myAge=17;
        myHeightInMetres= 1.76;
    		   

        // Print the new values
        System.out.println("Some time passes...");
        System.out.println("I am now " + myAge + " years old.");
        System.out.println("I have grown and am " + myHeightInMetres + " m tall.");
    }
}
