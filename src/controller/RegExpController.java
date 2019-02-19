package controller;

import java.util.regex.Pattern;

public class RegExpController {
    // dd-ddd
    public boolean checkPostalCode(String postalCode){
        String template = "^\\d{2}-\\d{3}$";
        return Pattern.matches(template, postalCode);
    }
    // ddddddddddd
    public boolean checkPesel(String pesel){
        String template = "\\d{11}";
        return Pattern.matches(template, pesel);
    }
    // +[dd][ddd]-ddd-ddd-ddd lub
    public boolean checkPhoneNo(String phone_no){
        String template = "^[+]{1}\\d{2,3}-\\d{3}-\\d{3}-\\d{3}";
        return Pattern.matches(template, phone_no);
    }
    public static void main(String[] args) {
        RegExpController rec = new RegExpController();
        System.out.println("kod pocztowy");
        System.out.println(rec.checkPostalCode("03-032"));
        System.out.println(rec.checkPostalCode("0X-032"));
        System.out.println(rec.checkPostalCode("03032"));
        System.out.println(rec.checkPostalCode(" 03-032"));
        System.out.println("pesel");
        System.out.println(rec.checkPesel("12321234543"));
        System.out.println(rec.checkPesel("1232123454"));
        System.out.println(rec.checkPesel("123232123454"));
        System.out.println(rec.checkPesel("123d2123454"));
        System.out.println(rec.checkPesel("k02332123453"));
        System.out.println("phone");
        System.out.println(rec.checkPhoneNo("+43-543-654-234"));
        System.out.println(rec.checkPhoneNo("+43-5436-54-234"));
    }

}
