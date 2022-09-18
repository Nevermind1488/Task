import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {
        getArithmeticProgression(getRandom(),getRandom(), getRandom());
    }

    public static int getRandom() {
        int a = 0;
        int b = 10;
        int x =(int)(Math.random() * ((b - a) + 1));
        return x;
    }
    int a = getRandom();
    int b = getRandom();
    int c = getRandom();

    public static void getArithmeticProgression(int a, int b, int c) {
           int [] arr = new int[]{a, b, c};
           Arrays.sort(arr);
           if(arr[1] - arr[0] == arr[2] - arr[1] && arr[2] != arr[1] && arr[0] != arr[1]){
               System.out.printf("Можно составить арифметическую прогрессию:\n%d\n%d\n%d",a,b,c);
           }
           else{
               System.out.printf("Арифметическую прогрессию составить невозможно:\n%d\n%d\n%d",a,b,c);
           }
           return;
    }
}

