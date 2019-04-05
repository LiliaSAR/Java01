public class WorkingWithArray {
    public int sumOfArray(int[] numbers){
        int sum = 0;
        for(int i :numbers){
            sum += i;
        }
        return sum;
    }

    public int minOfArray(int[] numbers){
        int min = numbers[0];
        for (int i : numbers){
            if (min > i){
                min = i;
            }
        }
        return min;
    }
}
