import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            int count = 0;
            if (n >= 0 && n <= 100) {
                int b = n % 6;
                count = n / 6;
                if (b != 0) {
                    if (b % 8 == 0) {
                        int full = b / 8;
                        count += full;
                    }
                }else{
                    return;
                }
                System.out.println(count);
            }
        }
    }
}
