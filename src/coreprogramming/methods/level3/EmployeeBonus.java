package CoreProgramming.Methods.Level3;
public class EmployeeBonus {

    static double[][] generateEmployeeData(int n) {
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

    static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    static void displayReport(double[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("Emp\tOldSal\tYears\tBonus\tNewSal");
        for (int i = 0; i < oldData.length; i++) {
            totalOld += oldData[i][0];
            totalBonus += newData[i][1];
            totalNew += newData[i][0];

            System.out.println((i + 1) + "\t" +
                    oldData[i][0] + "\t" +
                    oldData[i][1] + "\t" +
                    newData[i][1] + "\t" +
                    newData[i][0]);
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(10);
        double[][] updatedData = calculateBonus(employeeData);
        displayReport(employeeData, updatedData);
    }
}
