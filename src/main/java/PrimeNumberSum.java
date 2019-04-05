public class PrimeNumberSum {
    public static void main(String[] args) {

       /* for (int n = 2; n < 10; n++) {
            int  pNumber = (int) Math.pow(2, n) - 1;
            System.out.println(pNumber);
        }*


      /* for (int i = 2; i <= 120
                ; i++) {
            if (!((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0))) {
                System.out.println(i);
            }
        }*/




        int sum = 0;
        for (int prime = 1; prime <= 100; prime++) {
            int i = 1;
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
