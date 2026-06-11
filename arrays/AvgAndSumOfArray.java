public class AvgAndSumOfArray {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int sum = 0;
        for (int i = 0; i < array.length ; i++)
                   sum += array[i];
        int avg = sum/array.length;
        System.out.println("SUM OF ARRAY : " + sum);
        System.out.println("AVERAGE OF ARRAY : " + avg);
    }
}
