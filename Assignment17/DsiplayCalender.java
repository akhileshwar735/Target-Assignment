package com.akhil.training.oops.Assignment17;


import java.util.Scanner;

import com.akhil.training.oops.Assignment17.InvalidDateException;
import com.akhil.training.oops.Assignment17.InvalidInputException;

class DisplayCalendar{

    public static void main(String[] args) throws InvalidDateException, InvalidInputException {

        int Y = 2016;    // year
        int startDayOfMonth = 5;
        int spaces = startDayOfMonth;
        Scanner sc = new Scanner(System.in);
        String ins = sc.nextLine();


        try{
            String[] date = ins.split("-");
            int month = Integer.parseInt(date[1]);
            int year = Integer.parseInt(date[0]);
            if (!(month>=1 && month<=12)) {
                throw new InvalidDateException();
            }
            else if (!(ins.contains("-"))){
                throw new InvalidInputException();
            }


            // startDayOfMonth

            // months[i] = name of month i
            String[] months = {
                    "",                               // leave empty so that we start with months[1] = "January"
                    "January", "February", "March",
                    "April", "May", "June",
                    "July", "August", "September",
                    "October", "November", "December"
            };

            // days[i] = number of days in month i
            int[] days = {
                    0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
            };

            for (int M = 1; M <= 12; M++) {

                // check for leap year
                if  ((((Y % 4 == 0) && (Y % 100 != 0)) ||  (Y % 400 == 0)) && M == 2) {
                    days[M] = 29;
                }

                // print calendar header
                // Display the month and year
                System.out.println("          "+ months[M] + " " + Y);

                // Display the lines
                System.out.println("_____________________________________");
                System.out.println("   Sun  Mon Tue   Wed Thu   Fri  Sat");

                // spaces required
                spaces = (days[M-1] + spaces)%7;

                // print the calendar
                for (int i = 0; i < spaces; i++){
                    System.out.print("     ");}
                for (int i = 1; i <= days[M]; i++) {
                    System.out.printf(" %3d ", i);
                    if (((i + spaces) % 7 == 0) || (i == days[M])) {
                        System.out.println();
                    }
                }

                System.out.println();
            }

        }
        catch (InvalidDateException e){
            System.out.println("Invalid date supplied");
        }
        catch (InvalidInputException | ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid input format");
        }

    }
}