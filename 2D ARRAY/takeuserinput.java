import java.util.Scanner;
import java.io.*;

public class takeuserinput{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows :");
        int row = sc.nextInt();
        System.out.println("Enter number of columns :");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        int total = row * col;


        System.out.println("Please enter the total " + total + "elements.");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }

            
        }
        sc.close();

        System.out.println("The Input array is :");


        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + "\t");
                
            }
            System.out.println();
        }


        
    }
}