package controller;

import model.Employee;

public class Company {
    Employee employees [] = new Employee[10];
    int index = 0;

    public void addEmployee(
            String name,
            String lastname,
            String PESEL,
            String birth_date,
            String empl_date,
            double salary_net){
        // utworzenie obiektu pracownika
        Employee e = new Employee(name, lastname, PESEL, birth_date, empl_date, salary_net);
        // zapisanie pracownika do listy pracowników
        employees[index] = e;
        // inkrementacja index-u
        index++;
        // wyświetlenie danych zapisanego pracownika
        System.out.println("Dodano pracownika: " + e);
    }
    public void getAllEmployees(){
        System.out.println("Lista pracowników:");
        for (int i = 0; i < index; i++){
            System.out.println(employees[i]);
        }
    }
//    public Employee getEmployeeByPESEL(String PESEL){
//
//    }
//    public void setSalary(String PESEL, double newSalary){
//
//    }

    public static void main(String[] args) {
        Company c = new Company();
        // wywołania metod
        c.addEmployee("M","K", "1233221123", "2000-02-02","2019-01-01", 10000);
        c.addEmployee("A","A", "5553221123", "2001-02-02","2019-01-01", 14000);
        c.addEmployee("B","B", "6663221123", "2002-02-02","2019-01-01", 12000);
        c.getAllEmployees();
    }



}
