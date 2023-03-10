
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        int[] array = {2,3,1,7,11};

        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] < array[j]){
                   int k;
                   k = array[i];
                   array[i] = array[j];
                   array[j] = k;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("-------------------------");
        System.out.println("Task2");

        int sum = 0;
        int[] arr = {-1,-3,12,34,-1};
        for (int i = 0; i < arr.length; i++){
                if (arr[i] > 0){
                   sum += arr[i];
                }
        }

        System.out.println(sum);

        System.out.println("-------------------------");
        System.out.println("Task3");

        double[] ar = {2,1,4,6,4,3};
        double s = 0;
        double result = 0;
        for (int i = 0; i < ar.length; i++){
            s +=ar[i];
        }
        result = s/ar.length;
        System.out.println(result);

        System.out.println("-------------------------");
        System.out.println("Task4");

        int[] a = {3,2,3,1,4,2,8,3};

        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[i] == a[j]){
                    a[j] = 0;
                }
            }
        }

        for (int  i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }


}