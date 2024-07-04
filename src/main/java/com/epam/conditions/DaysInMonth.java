package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        // Validate inputs
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        int days;
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                days = 30;
                break;
            case 2: // February
                // Check for leap year
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = 0; // This case should never be reached due to earlier validation
                break;
        }

        System.out.println(days);
    }

    private boolean isLeapYear(int year) {
        // A leap year is divisible by 4, but not by 100 unless it is also divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
