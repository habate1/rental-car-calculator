package com.pluralsight;

import java.util.Locale;
import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        // declare variables
        // a. pickup date (store as a string)
        //b. number of days for the rental
        //c. whether they want an electronic toll tag at $3.95/day (yes/no)
        //d. whether they want a GPS at $2.95/day (yes/no)
        //e. whether they want roadside assistance at $3.95/day (yes/no)
        //f. their current age

        String pickupDate;
        int rentalDays, currentAge;
        String tollTag, GPS, roadsideHelp;

        Scanner myscanner = new Scanner(System.in);

        System.out.println("Please enter the pickup date for your rental. In the format mm/dd/yyyy: ");
        pickupDate = myscanner.next();
        System.out.println("Please enter the number of days you are renting the car: ");
        rentalDays = myscanner.nextInt();
        System.out.println("Would you like to have an electronic toll tag at $3.95/day? Please enter Yes or No: ");
        // line to break that up put below
        // consuming  a line seperator
        myscanner.nextLine();

        tollTag = myscanner.nextLine();
        System.out.println("Would you like to have GPS at $2.95/day? Please enter Yes or No: ");
        GPS = myscanner.nextLine();
        System.out.println("Would you like to have roadside assistance at $3.95/day? Please enter Yes or No: ");
        roadsideHelp = myscanner.nextLine();
        System.out.println("Please enter your curent age: ");
        currentAge = myscanner.nextInt();

        // if/else statements to calculate total cost
        double basicRental = 29.99; // starting base cost
        // surcharge for drivers under 25
        if (currentAge < 25) {
            basicRental += basicRental * .25;
            System.out.println("You will receive a surcharge of 25% for drivers under 25.");
        }
        if (tollTag.equalsIgnoreCase("yes")) {
            basicRental = basicRental + (3.95 * rentalDays);
        }
        if(GPS.equalsIgnoreCase("yes")) {
            basicRental = basicRental + (2.95 * rentalDays);
        }
        if (roadsideHelp.equalsIgnoreCase("yes")) {
            basicRental = basicRental + (3.95 * rentalDays);
        }
        System.out.printf("Your final cost is: $%.2f", basicRental);
    }
}
