import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReqExpMain {
    public static void main(String[] args) {
        String name = "alex@com.pl";
        String name1 = "al@com.pl";
        String name2 = "a@com.pl";
        String name3 = "kkk@com.pl";
        // --------------------------
        // wzór wyrażenia regularnego na podstawie którego walidujemy name
        String template = "^a.*[@]{1}.*[lm]$";
        // sprawdzenie dopasowania -> true - spełnia regexp -> false - nie spełnia regexp
        boolean isMatched = Pattern.matches(template, name);
        // zwrócenie wartości boolowskiej
        System.out.println(isMatched);

//        // skompilowanie wyrażenie do obiektu pattern
//        Pattern pattern = Pattern.compile(template);
//        // testowanie dopasowania
//        Matcher matcher = pattern.matcher(name);
//        pattern.matcher(name1);
//        System.out.println(matcher.matches());
//        pattern.matcher(name2);
//        System.out.println(matcher.matches());
//        pattern.matcher(name3);
//        System.out.println(matcher.matches());
    }
}
