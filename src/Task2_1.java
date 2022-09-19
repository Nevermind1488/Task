import java.util.Locale;
import java.util.Random;
import java.util.Arrays;
public class Task2_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Random rand = new Random();
        int[] arr = new int[3];
        arr[0] = rand.nextInt(11);
        arr[1] = rand.nextInt(11);
        arr[2] = rand.nextInt(11);
        Arrays.sort(arr);
        getArithmeticProgression(arr);
        getGeometricProgression(arr);
    }
    public static void getArithmeticProgression(int[] arr) {
           if(arr[1] - arr[0] == arr[2] - arr[1] && arr[2] != arr[1] && arr[0] != arr[1]){
               System.out.printf("Можно составить арифметическую прогрессию:\n%d\n%d\n%d\n",arr[0], arr[1], arr[2]);
           }
           else{
               System.out.printf("Арифметическую прогрессию составить невозможно:\n%d\n%d\n%d\n", arr[0], arr[1], arr[2]);
           }
    }
    public static void getGeometricProgression(int[] arr) {
        if(arr[0] != 0 && arr[1] != 0 && Math.abs(((double) arr[1] / arr[0]) - ((double) arr[2] / arr[1])) < 1e-3){
            System.out.printf("Можно составить геометрическую прогрессию:\n%d\n%d\n%d",arr[0], arr[1], arr[2]);
        }
        else{
            System.out.printf("Геометрическую прогрессию составить невозможно:\n%d\n%d\n%d", arr[0], arr[1], arr[2]);
        }
    }
}
