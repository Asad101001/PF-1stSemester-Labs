public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {6,2,11,3,7,99,100,21,46};
        boolean b = false;
        while (!b){
            for (int i = 0; i< arr.length; i++)
            {
                if (arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    b = false;
                }
            }
        }
        for (int a : arr) System.out.println(a);
    }
}
