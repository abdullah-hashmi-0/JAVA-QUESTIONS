import java.util.*;

public class ArraytwoD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr no. of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter no. of coloumns: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        //input and //rows
        for(int i=0; i<rows; i++) {
            //coloumns
            for(int j=0; j<cols; j++) {
                matrix[i][j] = sc.nextInt();
                
            }
        }

        int x = sc.nextInt();

        //output

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(matrix[i][j] == x) {
                    System.out.println("x found at location (" + i +", " + j + ")");
                }
            }
        }



        sc.close();
    }
    
}
