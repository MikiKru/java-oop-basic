package controller;

import model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserController {
    User users [] = new User[100];
    int index;

    public void addUser(String name, String lastname, String login, String password, String email, String phone, LocalDate birth_date, LocalDateTime registration_date_time){
        User u = new User(name, lastname, login, password, email, phone, birth_date, registration_date_time);
        u.setRegistration_date_time(u.getRegistration_date_time().plusHours(1));
        users[index] = u;
        index++;
    }
    public void getAllUsers(){
        for (int i = 0; i < index; i++){
            System.out.println(users[i]);
        }
    }


}
