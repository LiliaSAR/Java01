import java.awt.*;

public class Salary {
    public static void main(String[] args) {

        CleanIncomeCalculation calcSalary = new CleanIncomeCalculation();
        if (args.length == 0) {
            System.out.println("Please enter the gross salary");
        } else if (args.length == 1) {
            System.out.print("You entered money is ");
        }




       // CalculatorSalary calcSalary = new CalculatorSalary();

       // int grossSalary = Integer.parseInt(args[0]);
       // int net = calcSalary.balanceSalary(grossSalary);
       // System.out.println(net);


        // CalculatorSalary calcSalary = new CalculatorSalary();
        // System.out.println("My salary is " + calcSalary.balanceSalary(3000000) );
    }
}
