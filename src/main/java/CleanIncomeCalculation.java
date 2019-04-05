public class CleanIncomeCalculation {

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
}
