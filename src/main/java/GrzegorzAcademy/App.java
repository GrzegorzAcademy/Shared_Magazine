package GrzegorzAcademy;

import GrzegorzAcademy.sharedMagazine.company.people.Clients;
import GrzegorzAcademy.sharedMagazine.company.people.Person;
import GrzegorzAcademy.sharedMagazine.company.people.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person person = new Person();
        person.setName("Adam");
        person.setLast_name("Kowalski");
        person.setAge(18);
        Clients clients1 = new Clients();
        clients1.personality = person;
        boolean premium = clients1.isPremium();
        Employee employee = new Employee();
        employee.Employees = person;
    }
}
