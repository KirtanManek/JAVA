/* 3. Create a class named 'Member' having the following members:
      1-Name
      2-Age
      3-Phone number
      4-Address
      5-Salary
      It also has a method named 'printSalary' which prints the salary of the members.
      Two classes 'Employee' and Manager' inherits the 'Member' class.
      The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
      Now assign name, age, phone number address and salary to an employee and a manager
      by making an object of both of these classes and print the same along with specialization and department respectively.*/

package java_classes;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    public Member() {
        this.name = "";
        this.age = 0;
        this.phoneNumber = "";
        this.address = "";
        this.salary = 0;
    }

    public void printSalary() {
        System.out.println("Salary = "+ salary);
    }
}

class Employee extends Member {
    String specialization;

    String getDetails(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        return name+" - "+age+" - "+phoneNumber+" - "+address+" - "+salary+" - "+specialization;
    }
}

class Manager extends Member {
    String department;

    String getDetails(String name, int age, String phoneNumber, String address, double salary, String department) {
        return name+" - "+age+" - "+phoneNumber+" - "+address+" - "+salary+" - "+department;
    }
}

public class MemberMain {
    public static void main(String[] args) {
        Employee e = new Employee();
        String employee_details = e.getDetails("abc", 30, "1234567890", "address", 30000.00, "python");

        Manager m = new Manager();
        String manager_details = m.getDetails("abc", 30, "1234567890", "address", 30000.00, "Services");

        System.out.println(employee_details);
        System.out.println(manager_details);
    }
}
