import java.util.Arrays;
import java.util.Scanner;
public class lAB5 {
    public static void main(String[] args) {
        int c = -50;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in.nextInt();
        System.out.println("Enter the number of columns");
        int m = in.nextInt();
        int[][] array = new int[n][m];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                array[i][j] = c + (int) (Math.random() * 100);

            }
        }
        for(int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("_______________________________");
        for(int i = 0; i < n; i++){
            Arrays.sort(array[i]);
            System.out.println(Arrays.toString(array[i]));
        }
    }
}