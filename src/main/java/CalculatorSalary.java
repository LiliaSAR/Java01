public class CalculatorSalary {

    public int CleanIncome(int baseIncome){

        int taxableIncome;
        int mandatorytax;
        int taxArmy = 1000;
        int cleanIncome;

        if (baseIncome <= 0){
            System.out.println("Animasta, chi ogni");
            return baseIncome;
        }
        if ((baseIncome > 0) && (baseIncome <= 150000)) {
            taxableIncome = (baseIncome * 23/100);
            mandatorytax = (baseIncome * 25/1000);
        }
        else if((baseIncome>150000) && (baseIncome<=2000000)){
            taxableIncome =((baseIncome - 150000) * 28 /100) + 34500;
            if (baseIncome<=500000){
                mandatorytax = (baseIncome * 25/1000);
            }else {
                mandatorytax = 12500;
            }
        }
        else {
            taxableIncome =((baseIncome - 2000000) * 36/100) + 552500;
            mandatorytax = 12500;
        }
        cleanIncome = baseIncome - (taxableIncome + mandatorytax + taxArmy);
        return cleanIncome;

    }
   /* public int balanceSalary(int currentSalary ){
        int armyTax = 1000;
        int socTax;
        int profitTax;
        if (currentSalary <= 0 ){
            System.out.println("salaru is incorect");
            return currentSalary;
        }
        if(currentSalary > 0) && (currentSalary <= 150000){
            profitTax = 150000*23/100;

        }
    }*/

   /* public int balanceSalary(int currentSalary ) {
     int armyTax = 1000;
     int socTax;
     int profitTax;
     if (currentSalary <= 0 ){
    return currentSalary;
        }
        if(currentSalary <= 150000){
           profitTax = 150000*23/100;
        } else if(currentSalary <= 2000000){
            profitTax = 34500+(currentSalary - 150000)*28/100;
        } else {
            profitTax = 552500+(currentSalary - 2000000)*36/100;
        }
        if(currentSalary < 500000){
            socTax = currentSalary*25/1000;
        } else {
           socTax = 12500;
        }
        return currentSalary - armyTax - socTax - profitTax;
    }* /

    /*int socTax;
    int profitTax;
    int armyTax = 1000;
    int balanceSalary;

    public int balanceSalary(int currentSalary ) {

        if ((currentSalary >= 0) && (currentSalary <= 150000)) {
            profitTax = (int)((0.23) * currentSalary);
            socTax = (int)((0.025) * currentSalary);
        } else
        if ((currentSalary > 150000) && (currentSalary <= 2000000)) {
            profitTax = (int)((0.28) * (currentSalary - 150000)) + 34500;
            if (currentSalary < 500000){
                socTax = (int)((0.025) * currentSalary);
            }else
                if (currentSalary >= 500000){
                    socTax = 12500;
            }

        } else
        if (currentSalary > 2000000) {
            profitTax =  (int)((0.36) * (currentSalary - 2000000) ) + 552500;
            socTax = 12500;

        }
        else {
            System.out.println("You entered money is incorrect");
        }

        balanceSalary = currentSalary - (profitTax + socTax + armyTax);

        return balanceSalary;

    } */

}
