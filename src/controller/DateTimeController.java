package controller;

import java.time.DayOfWeek;
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
    public LocalDate dateCompatator(String d1, String d2){
        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);
        return date1.isBefore(date2) ? date1 : date2;
    }
    // Ile poniedziałków występuje między dwiema datami
    public int getMondaysBetweenDates(String d1, String d2){
        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);
        // sprawdzam, która data jest mniejsza, a która większa
        LocalDate lessDate = date1.isBefore(date2) ? date1 : date2;
        LocalDate greatherDate = date1.isAfter(date2) ? date1 : date2;
        // licznik poniedziałków
        int mondayCounter = 0;
        // 1. inicjalizujemy pętlę datą mniejszą
        // 2. warnykiem wykonania pętli jest sprawdzenie czy data mniejsza nie przekroczyła daty większej
        // 3. w ktoku dodaje jeden dzień
        for (LocalDate ld = lessDate; ld.isBefore(greatherDate); ld = ld.plusDays(1)){
            if(ld.getDayOfWeek() == DayOfWeek.MONDAY){
                mondayCounter++;
            }
        }
        return mondayCounter;
    }
    public static void main(String[] args) {
        DateTimeController dtc = new DateTimeController();
        System.out.println("Twój wiek dokładny to: " + dtc.getAgeFromStringDate("2000-10-01") + " lat");
        System.out.println("Wcześniejsza data: " + dtc.dateCompatator("2000-02-20", "2001-05-05"));
        System.out.println("Wcześniejsza data: " + dtc.dateCompatator("2010-02-20", "2001-05-05"));
        System.out.println("Liczba poniedziałków między datami:" + dtc.getMondaysBetweenDates("2019-02-19", "2019-03-05"));
    }

}
