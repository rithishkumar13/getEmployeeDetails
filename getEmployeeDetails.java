import java.util.Scanner;
class Employee {
    private int empId;
    private String empName;
    private long empMobileNo;
    private String empJobRole;
    private String empEmailId;
    private long empSal;

    public Employee(int empId, String empName,long empMobileNo,String empEmailId,String empJobRole,long empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empMobileNo=empMobileNo;
        this.empEmailId=empEmailId;
        this.empJobRole=empJobRole;
        this.empSal = empSal;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee MobileNo: " + empMobileNo);
        System.out.println("Employee EmailId: " + empEmailId);
        System.out.println("Employee jobRole"+empJobRole);
        System.out.println("Employee Salary: " + empSal);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numOfEmployees = scanner.nextInt();

        Employee[] employees = new Employee[numOfEmployees];

        for (int i = 0; i < numOfEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Employee Id: ");
            int empId = scanner.nextInt();
            System.out.print("Employee Name: ");
            String empName = scanner.next();
            System.out.print("Employee Mobile No:");
            Long empMobileNo=scanner.nextLong();
            System.out.print("Employee EmailId:");
            String empEmailId=scanner.next();
            System.out.print("Employee Job Role:");
            String empJobRole=scanner.next();
            System.out.print("Employee Salary: ");
            long empSal = scanner.nextLong();

            employees[i] = new Employee(empId, empName, empMobileNo, empEmailId, empJobRole, empSal);
        }
        scanner.close();
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < numOfEmployees; i++) {
            System.out.println("\nEmployee " + (i + 1) + " details:");
            employees[i].getEmployeeDetails();
        }
    }
}