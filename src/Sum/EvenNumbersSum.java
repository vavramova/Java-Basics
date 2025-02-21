package Sum;

import java.util.Scanner;

public class EvenNumbersSum {
    public static void main(String[] args){
        final int MAX_VALUE = 1000;
        Scanner scanner = new Scanner(System.in);
        int N;

        do{
            System.out.println("Enter a number between 2 and " + MAX_VALUE +" : ");
            N = scanner.nextInt();

            if(N < 2 || N > MAX_VALUE){
                System.out.println("Error!");
            }
        }while(N < 2 || N > MAX_VALUE);

        if(N % 2 != 0){  //if th entered number is odd we take the closest even number
            N--;
        }

        int sum = 0;
        int count = 0;

        for(int i = 2; i <= N; i += 2){
            sum += i;
            count++;
        }

        double average = (double) sum / count;

        System.out.println("The sum of all even numbers is: " + sum);
        System.out.println("The average is: " + average);
    }

}
