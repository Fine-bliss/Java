import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int ABsub = sc.nextInt();
            int BCSub = sc.nextInt();
            int ABAdd = sc.nextInt();
            int BCAdd = sc.nextInt();
            int A = (ABsub + ABAdd) / 2;
            int B = (BCSub + BCAdd) / 2;
            int C = BCAdd - BCSub;
            System.out.println(A + " " + B + " " + C );
        }
    }
}
