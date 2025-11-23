import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fullName;

        fullName = sc.nextLine();

        System.out.println(fullName + "\n" + fullName.length());
        
        sc.close();
    }
}