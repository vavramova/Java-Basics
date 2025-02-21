package ZigZag;

import java.util.Scanner;

public class ZigZagMatrix {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give count of rows: ");
        int n = scanner.nextInt();
        System.out.println("Give count of columns: ");
        int m  = scanner.nextInt();

        int[][] matrix = new int[n][m];
        int value = 1;

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){   //if the row is even we fill left -> right
                for(int j = 0; j < m; j++){
                    matrix[i][j] = value++;
                }
            }else{  //if row is off right -> left
                for(int j = m-1; j >= 0; j--){
                    matrix[i][j] = value++;
                }
            }
        }

        System.out.println("Matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("%4d", matrix[i][j]);  //d - the digit is 4 symbols wide
            }
            System.out.println();
        }
        scanner.close();
    }
}
