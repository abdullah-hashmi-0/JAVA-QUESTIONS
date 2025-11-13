public class ArrayPairs {
    public static void printPairs(int numbers[]) {

        //for total Pairs use 
        //int tp = 0;

        int tp = 0;
        for(int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];

            for(int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[i] + ")" );
                tp++; //Total Pairs
            }
            System.out.println();
        }
        System.out.println("Total Pairs are: " + tp);  //for printing total pairs
    }

    public static void main(String args[]) {
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
    
}
