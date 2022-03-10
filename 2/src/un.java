import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        double salary = 0.0, bonus = 0.0, taxAmount, netSalary, designation;
        String destination;
        int yearsServed;

        Scanner input = new Scanner(System.in);

        System.out.println("1. Manager \n2. System Analyst \n3. Developer \n4. Accountant");
        System.out.println("Enter the Employee's designation");
        designation = input.nextLine();

        switch (destination) {
            case "Manager":
                salary = 21346.876;
                break;
            case "System Analyst":
                salary = 16729.564;
                break;
            case "Deveploper":
                salary = 14525.345;
                break;
        }
        System.out.println("\t Emloyee Salary Details");
        System.out.println("------------------------------------------");
        System.out.printf("Employee Destignation: \t%s%n", designation);
        System.out.printf("Employee Salary: \t$%.2f%n", salary);
        System.out.println("------------------------------------------");
    }
}
