package com.company;

import com.company.interfaces.Converter;

public class ConverterSwitch implements Converter {

    // Converter Month Switch
    public String convertMonth(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default: return "You have entered an invalid number. You must enter a number from 1 to 12. Goodbye.";
        }
    }

    //Converter Day Switch
    public String convertDay(int dayNumber) {

        switch (dayNumber) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "You have entered an invalid number. You must enter a number from 1 to 12. Goodbye.";
        }
    }

}