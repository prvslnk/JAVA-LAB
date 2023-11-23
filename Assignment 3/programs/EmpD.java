/*  Develop a java program that will deal with employee information of an organization.
    Define aclass Employee. Minimum number of data member and member function are as follows:
        Data members: empName, empNo, basicSal, da, hra, grossSal
        Methods: calGrosssal(), showEmpDetails()
    You are free to add more number of relevent data member and member function. Define prameterized constructor to initialize empName, empNo, and basicSal. create any twoobjects of Employee class and initialize their data members while object creation. Use the method calGrosssal() to calculate the gross salary and method showEmpDetails() to display the detail information of the employees in a tabular manner. Note the da is 20% of basiSal and hra is 10% of basicSal. grossSal is the sum of basic Sal. da and hra.

 */

import java.util.Scanner;

class Employee {
    int empNo;
    String empName;
    int basicSal, hra;
    double da, daA, grossSal;

    int daAI, grossSalI;

    double calcDa() {
        return daA = basicSal * da;
    }

    double calGrossSal() {
        return basicSal + daA + hra;
    }

    void showEmpDetails() {
        System.out
                .println(empNo + "\t\t" + empName + "\t" + basicSal + "\t\t" + daAI + "\t\t" + hra + "\t" + grossSalI);

    }

    Employee(int x, String y, int z, double a, int b) {
        empNo = x;
        empName = y;
        basicSal = z;
        da = a;
        daA = 0;
        hra = b;
        grossSal = 0;
        daAI = 0;
        grossSalI = 0;

    }

}

class EmpD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employee: ");
        int empNos = sc.nextInt();
        Employee[] empNo = new Employee[empNos];
        for (int i = 0; i < empNos; i++) {

            System.out.println("Enter Employee Id");
            int empNoV = sc.nextInt();
            System.out.println("Enter Employee Name:");
            String empNameV = sc.nextLine();
            empNameV = sc.nextLine();
            System.out.println("Enter Employee Basic Sal:");
            int basicSalV = sc.nextInt();
            System.out.println("Enter Employee DA %age in Decimal:");
            float daV = sc.nextFloat();
            System.out.println("Enter Employee HRA:");
            int hraV = sc.nextInt();

            empNo[i] = new Employee(empNoV, empNameV, basicSalV, daV, hraV);
            empNo[i].daA = empNo[i].calcDa();
            empNo[i].grossSal = empNo[i].calGrossSal();

            empNo[i].grossSalI = (int) empNo[i].grossSal;
            empNo[i].daAI = (int) empNo[i].daA;
        }
        System.out.println("Employee ID" + "\t" + "Employee Name" + "\t" + "Basic Salary" + "\t" + "Actual DA" + "\t"
                + "HRA" + "\t" + "Gross Salary");
        for (int i = 0; i < empNos; i++) {
            empNo[i].showEmpDetails();
        }
    }
}