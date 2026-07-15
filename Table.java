import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter array size (for P×P array):");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j]=(r.nextInt(8)+1)*2;
            }
        }
        System.out.println("Generated 2D array:");
        System.out.print("    ");
        for (int i=0;i<n;i++) {
            System.out.printf("%4d",i);
        }
        System.out.println();
        for (int i=0;i<n;i++) {
            System.out.printf("%2d ",i);
            for (int j=0;j<n;j++) {
                System.out.printf("%4d",arr[i][j]);
            }
            System.out.println();
        }
        System.out.print("Enter a number to highlight(even number 2-16):");
        int num = sc.nextInt();
        int count = 0;
        System.out.println("Array with " + num + " highlighted:");
        System.out.print("    ");
        for (int i=0;i<n;i++) {
            System.out.printf("%4d",i);
        }
        System.out.println();
        for (int i=0;i<n;i++) {
            System.out.printf("%2d ",i);
            for (int j=0;j<n;j++) {
                if (arr[i][j]==num) {
                    System.out.printf(" [%2d]",arr[i][j]);
                    count++;
                } else {
                    System.out.printf("%4d",arr[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("Number "+num+" appeared "+count+" time(s)");
    }
}
