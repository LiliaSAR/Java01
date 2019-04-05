import java.util.ArrayList;
public class MathFunctions {

  /*  // This Java program performs a bubble sort
    public static void main(String[] args){
        int arr[] = {10,0,15,19,8,5,33};
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        for (int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        */


    //Program for Fibonacci series
   /* public static void main(String args[]) {
        int x1 = 0, x2 = 1, x3, i, cnt = 15;
        // To print 0 and 1
        System.out.print(x1 + " " + x2);

        // loop starts from 2 as 0 and 1 are already printed.
        for (i = 2; i < cnt; ++i) {
            x3 = x1 + x2;
            System.out.print(" " + x3);
            x1 = x2;
            x2 = x3;
        }
    }*/
    public static void main(String[] args) {

        ArrayList<Object> cars = new ArrayList<Object>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add(3,"abb");
        cars.add(5);
        System.out.println(cars);

}
}
