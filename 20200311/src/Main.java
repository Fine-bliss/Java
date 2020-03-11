import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int all = 1;
            int l = 1;
            for(int i = 1; i < n; i++){
                 all *= i;
            }
            String sall = String.valueOf(all);
            char[] s = sall.toCharArray();
            for (int i = s.length-1; i >= 0 ; i--) {
                if('0' == (s[i])){
                    l++;
                }else{
                    break;
                }
            }
            System.out.println(l);
        }
    }
}
