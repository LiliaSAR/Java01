import java.util.Scanner;

public class PrimeNumbers {
    // private static Scanner sc; /* for second function*/
    public static void main(String[] args) {

     /* Scanner s = new Scanner(System.in);
        System.out.print("Input number? ");
        int n = s.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n / i * i == n) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        } */



     /*  int i, number,count = 0;
        sc = new Scanner(System.in);
        System.out.print("Please enter any number : ");
        number = sc.nextInt();
        for (i=2; i <= number/2; i++){
             if(number % i == 0)
            {
               count++;
               break;
            }
        }
        if(count == 0 && number != 1){
         System.out.println (number + " is a Prime number");
        }
        else {
         System.out.println(number + " is not a Prime Number");
        } */


      /* int i, number = 1, count;
        System.out.println("Prime number from 1 to 100 are : ");
        while (number <= 10) {
            count = 0;
            i = 2;
            while(i <= number/2){
                if(number % i == 0){
                    count++;
                    break;
                }
                i++;
            }
            if(count == 0 && number !=1){
                System.out.print(number + "");
            }
            number++;
        } */

       /* private static boolean isPrimeNumber(int number){
           System.out.println("Prime check started for number:" + number );
           for (int i = 2; i < number / 2; i++){
               if(number % i ==0){
                   return false;
               }
           }
           return true;
        } */

       /*  int num = 33, i = 2;
       boolean flag = false;
       while(i< num/2){
           if(num % i == 0){
               flag = true;
               break;
           }
           ++i;
       }
       if (!flag)
           System.out.println(num +"is a prime number.");
       else
           System.out.println(num + "is not a prime number.");*/


     /*  for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i) {
                    System.out.println(i);
                }
                if (i % j == 0) {
                    break;
                }
            }
        }*/


        /*for (int n = 2; n < 10; n++) {
            int  pNumber = (int) Math.pow(2, n) - 1;
            System.out.println(pNumber);
        }*/


       /* for (int i = 2; i <= 120
                ; i++) {
            if (!((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0))) {
                System.out.println(i);
            }
        } */


      /* for (int prime = 1; prime <= 100; prime++) {
            int i = 1;
            while (i <= prime) {
                i++;
                if (i == prime) {
                    System.out.println(prime);
                }
                if (prime % i == 0) {
                    break;
                }
            }
        }
        */
        int count, sum = 0;
        for (int prime = 1; prime <= 100; prime++) {
            int i = 1;
            count = 0;
            while (i <= prime && prime <= 97) {
                i++;
                if (i == prime) {
                    System.out.println(prime);
                    sum = sum + prime;
                    System.out.println(sum);
                }
                if (prime % i == 0) {
                    break;
                }
            }
        }
    }
}







