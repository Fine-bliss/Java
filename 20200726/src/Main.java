
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String string = sc.nextLine();
            int max = 0;
            int count = 0;
            int end = 0;
            for (int i = 0; i < string.length() ; i++) {
                if(string.charAt(i)>= '0'&& string.charAt(i)<= '9'){
                    count++;
                    if (max < count){
                        max = count;
                        end = i;
                    }
                }else {
                    count = 0;
                }
            }
            System.out.println(string.substring(end-max+1,end+1));
        }
    }
}

