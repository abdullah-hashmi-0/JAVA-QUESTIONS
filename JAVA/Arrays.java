import java.util.*;

public class Arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // // int[] marks = new int[3];

        // // int //marks[] = new int[3];

        // int marks[] = {97, 85, 89};

        // // marks[0] = 97;
        // // marks[1] = 85;
        // // marks[2] = 89;
        
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);

        // for(int i = 0; i < 3; i++) {
        //     System.out.println(marks[i]);
        // }

        //Array by user input//

        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println();

        for(int i = 0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int x = sc.nextInt();

        System.out.println("\n");

        for(int i = 0; i < numbers.length; i++) {            //i<size == i<numbers.length

            if(numbers[i] == x) {

                System.out.println("x ofund at index: "+i);

            } else {
                System.out.println("x not found, enetr valid number");
            }
        }

// This is a random comment

        sc.close();

    }

}