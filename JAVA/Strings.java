import java.util.*;

public class Strings {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter first name: ");
        // String firstName = sc.next();
        
        // System.out.print("Enter last name: ");
        // String lastName = sc.next();
        

        // String fullName = firstName + " " + lastName; 
        // System.out.println("Your Name: " + fullName);
        // System.out.println("Length: " + fullName.length());

        // //for printing characters using charAt method

        // for(int i = 0; i<fullName.length(); i++) {
        //     System.out.println(fullName.charAt(i));
        // }

        // String name1 = "Tony";
        // String name2 = "Tony2";

        //if str 1 > str 2 : +ve value
        //if str 1 == str 2 : 0
        //if str 1 < str 2 : -ve value 

        //for example [ hello > wello ] as h is happening at 8th pos in alphabets while w comes at 23rd pos//

        // if(name1.compareTo(name2) == 0) {
        //     System.out.println("String are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        String sentence = "TonyStark";

        // substring(beg index, end index)

        String name = sentence.substring(0, 4);

        System.out.println(name); 
        
        //Strings are immutable
        
        sc.close();
    }
}