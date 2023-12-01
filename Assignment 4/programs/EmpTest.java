/*  Define a class Employee with the following members: 
Data members: 
private String empName
private String empNo
private int dependentCnt
Methods:Employee(String name, String eno, int depcnt): 
constructor void showEmpDetails():displaysempNoandempName 
intdepCount(): returns dependentCnt
Write a separate class called EmpTest with a main method thatdefine an array of n
employees where the value of n will be inputted from the user. Read and store the 
information of all n employees. Display the details of the employees with more than two 
dependents 
*/

import java.util.Scanner;

class Employee {
    private String empName;
    private String empNo;
    private int dependentCnt;

    Employee(String name, String eno, int depcnt) {
        this.empName = name;
        this.empNo = eno;
        this.dependentCnt = depcnt;
    }

    void showEmpDetails() {
        System.out.println("Employee Number: " + this.empNo);
        System.out.println("Employee Name: " + this.empName);
    }

    int depCount() {
        return this.dependentCnt;
    }
}

class EmpTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1));
            System.out.println("Enter name:");
            String name = sc.next();
            System.out.println("Enter employee number:");
            String eno = sc.next();
            System.out.println("Enter dependent count:");
            int depcnt = sc.nextInt();
            employees[i] = new Employee(name, eno, depcnt);
        }

        System.out.println("Employees with more than two dependents:");
        for (Employee emp : employees) {
            if (emp.depCount() > 2) {
                emp.showEmpDetails();
            }
        }
    }
}