package Day8EmpWage_UC6;

public class UC6TotalWorkingHour {
    public static void main(String args []) {
        monthlySalary();

    }

    private static void monthlySalary() {
        int empWagePerHour = 20;
        int empHours = 100;
        int workingDays = 20;
        int monthlySalary = 0;
        while (workingDays < 101) {
            monthlySalary = empHours * empWagePerHour * workingDays;
        }
        System.out.println("Monthly Salary of Employee if present is "+monthlySalary);

    }

}
