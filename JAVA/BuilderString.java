import java.util.*;

public class BuilderString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // //printing character at index 0

        // // System.out.println(sb.charAt(0));

        // //set char at index 
        // // sb.setCharAt(0, 'P');

        // //insert character at index

        // sb.insert(2, 'n');
        // System.out.println(sb);

        // //delete the extra n

        // sb.delete(2, 4);
        // System.out.println(sb);

        StringBuilder sb = new StringBuilder("hello");

        for(int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;  //5 - 1 - 0 = 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
        System.out.println(sb.length());

        sc.close();
    }
}