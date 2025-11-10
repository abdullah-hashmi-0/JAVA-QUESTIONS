public class StringMethodsDemo {
    public static void main(String[] args) {
 
        String s = "Java Programming";
        System.out.println("Original String: " + s);
        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Substring (0,4): " + s.substring(0, 4));
        System.out.println("Character at index 5: " + s.charAt(5));
        System.out.println("Contains 'Java'? " + s.contains("Java"));
        System.out.println("Replaced: " + s.replace("Java", "Advanced Java"));

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");
        sb.reverse();
        System.out.println("\nStringBuilder Result: " + sb);

        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Rocks");
        sbf.delete(4, 9);
        sbf.insert(4, " is Powerful");
        System.out.println("StringBuffer Result: " + sbf);
    }
}
