/*
 * The MIT License
 *
 * Copyright 2019 Teste.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package model;

/**
 *
 * @author WillAiemi
 * @since 17/05/2019 - 15:50
 * @version 1.0
 */
public class Date {
    private byte day;
    private byte month;

    /**
     * Clean constructor
     */
    public Date() {
    }

    /**
     *
     * @param day of the month
     * @param month of the year
     */
    public Date(byte day, byte month) {
        this.day = day;
        this.month = month;
    }

    public byte getDay() {
        return day;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public byte getMonth() {
        return month;
    }

    public void setMonth(byte month) {
        this.month = month;
    }
    
    /**
     * Use the month attribute to return the month name
     * @return The month's name
     */
    public String getNameOfTheMonth() {
        switch (this.month) {
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
            default:
                return "Invalid";
        }
    }
    
    /**
     * Verify if the Date actually exists in the Gregorian Calendar.
     * @return True, if the date exists.
     */
    public boolean validateDate() {
        int day = this.day;
        int month = this.month;
        if (day > 0 && day < 32 && month > 0 && month < 13
                &&
                (month == 2 && (day < 30)
                ||
                ((month == 4) || month == 6 || month == 9 || month == 11) && (day < 31)
                ||
                (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12))) {
            return true;
        }
        return false;
    }
    
    /**
     * Returns the class information pretty formatted.
     * @return 
     */
    @Override
    public String toString() {
        String dayComplementation = null;
        switch (this.day) {
            case 1:
                dayComplementation = "st";
                break;
            case 2:
                dayComplementation = "nd";
                break;
            case 3:
                dayComplementation = "rd";
                break;
            default:
                dayComplementation = "th";
        }
        return this.getNameOfTheMonth() + " " + this.day + dayComplementation + "\n"
                + "Is valid: " + this.validateDate();
    }
}