package controller;

import java.time.LocalDate;
import java.time.Period;

public class DateTimeController {
    public int getAgeFromStringDate(String date){
        LocalDate birthdate = LocalDate.parse(date);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthdate,today);
        System.out.println(age);
        return age.getYears();
    }

    public static void main(String[] args) {
        DateTimeController dtc = new DateTimeController();
        System.out.println("Twój wiek dokładny to: " + dtc.getAgeFromStringDate("2000-10-01") + " lat");
    }
}
