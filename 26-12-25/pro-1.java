import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basic, hra, da, gross;

    void calculateSalary() {
        hra = basic * 0.20;
        da = basic * 0.10;
        gross = basic + hra + da;
    }

    void display() {
        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Gross Salary: " + gross);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Enter ID: ");
        e.empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        e.name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        e.basic = sc.nextDouble();

        e.calculateSalary();
        e.display();
    }
}
