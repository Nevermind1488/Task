import java.util.Arrays;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите A:");
        int a = scanner.nextInt();
        System.out.print("Введите B:");
        int b = scanner.nextInt();
        System.out.print("Введите C:");
        int c = scanner.nextInt();
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);
        getArithmeticProgression(arr);
        getGeometricProgression(arr);
    }

    public static void getArithmeticProgression(int[] arr){
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

