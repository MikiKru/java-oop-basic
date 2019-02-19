import controller.UserController;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserMain {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addUser("M", "K", "m", "k", "mk@mk.pl", "123321234", LocalDate.of(2000,01,01), LocalDateTime.now());
        uc.addUser("X", "Y", "x", "y", "xy@xy.pl", "333333222", LocalDate.of(2003,02,05), LocalDateTime.now());
        uc.addUser("A", "A", "a", "a", "aa@aa.pl", "333333222", LocalDate.of(1987,06,10), LocalDateTime.now());
        uc.addUser("B", "B", "b", "b", "bb@bb.pl", "333333222", LocalDate.of(1999,12,22), LocalDateTime.now());
        uc.addUser("C", "C", "c", "c", "cc@cc.pl", "333333222", LocalDate.of(1967,03,13), LocalDateTime.now());
        uc.getAllUsers();
    }
}
