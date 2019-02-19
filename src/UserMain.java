import controller.UserController;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserMain {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addUser(
                "M",
                "K",
                "m",
                "k",
                "mk@mk.pl",
                "123321234",
                LocalDate.of(2000,01,01),
                LocalDateTime.now()
        );
        uc.addUser(
                "X",
                "Y",
                "x",
                "y",
                "xy@xy.pl",
                "333333222",
                LocalDate.of(2003,02,18),
                LocalDateTime.now()
        );
        uc.getAllUsers();
    }
}
