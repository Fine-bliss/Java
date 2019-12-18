public class StringFormatDemo {
    public static void main(String[] args) {
        // linux \n
        // windows \r\n
        System.out.printf("Hello %s%n", "world");
        String s = String.format("Hello %s%n", "world");
        System.out.print(s);
    }
}
