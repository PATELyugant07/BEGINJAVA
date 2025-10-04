import java.util.Scanner;

// Base Class
class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public void calcsal() {
        salary = 0;
    }

    public void display() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Temporary Employee
class TemporaryEmployee extends Employee {
    int hours, overtime;
    double rate, overrate;

    TemporaryEmployee(int empId, String name, int hours, int overtime, double rate, double overrate) {
        super(empId, name);
        this.hours = hours;
        this.overtime = overtime;
        this.rate = rate;
        this.overrate = overrate;
    }

    @Override
    public void calcsal() {
        salary = (hours * rate) + (overtime * overrate);
    }
}

// Permanent Employee
class PermanentEmployee extends Employee {
    int days;
    double dailyWage;

    PermanentEmployee(int empId, String name, int days, double dailyWage) {
        super(empId, name);
        this.days = days;
        this.dailyWage = dailyWage;
    }

    @Override
    public void calcsal() {
        salary = days * dailyWage;
    }
}

// Main Class
public class FirstMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Temporary Employee
        System.out.println("Enter Temporary Employee Details:");
        System.out.print("ID: "); int tid = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: "); String tname = sc.nextLine();
        System.out.print("Hours Worked: "); int hours = sc.nextInt();
        System.out.print("Overtime Hours: "); int over = sc.nextInt();
        System.out.print("Rate per Hour: "); double rate = sc.nextDouble();
        System.out.print("Overtime Rate: "); double overrate = sc.nextDouble();

        TemporaryEmployee temp = new TemporaryEmployee(tid, tname, hours, over, rate, overrate);
        temp.calcsal();
        System.out.println("\n--- Temporary Employee ---");
        temp.display();

        // Permanent Employee
        System.out.println("\nEnter Permanent Employee Details:");
        System.out.print("ID: "); int pid = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: "); String pname = sc.nextLine();
        System.out.print("Days Worked: "); int days = sc.nextInt();
        System.out.print("Daily Wage: "); double daily = sc.nextDouble();

        PermanentEmployee perm = new PermanentEmployee(pid, pname, days, daily);
        perm.calcsal();
        System.out.println("\n--- Permanent Employee ---");
        perm.display();

        sc.close();
    }
}
