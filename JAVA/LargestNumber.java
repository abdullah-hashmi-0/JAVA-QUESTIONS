public class LargestNumber {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; 

        //for smallest use Integer.MAX_VALUE
        for(int i = 0; i < numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }

            // if(smallest > numbers[i]) {
            // smallest = numbers[i]; 
            // }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 8, 4, 10, 2};
        System.out.println("Largest value is: " + getLargest(numbers));
        // System.out.println("Smallest value is: " + smallest); 
    }
    
}
