public class DataLossConversion {
    public static void main(String[] args) {
        long largeLong = 40000L;
        System.out.println("Original long value: " + largeLong);

        short myShort = (short) largeLong;
        System.out.println("Converted short value: " + myShort);

        long safeLong = 10000L;
        short safeShort = (short) safeLong;
        System.out.println("\nOriginal safe long value: " + safeLong);
        System.out.println("Converted safe short value: " + safeShort);
    }
}