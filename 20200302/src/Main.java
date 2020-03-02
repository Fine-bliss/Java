import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        for(int i = 0; i <= str1.length(); i++){
            //把不可以修改的String类型转变为可以修改的StringBuilder
            StringBuilder sb = new StringBuilder(str1);
            //将str2插入str1
            sb.insert(i,str2);
            if(isPalindrom(sb.toString())){
                count++;
            }
        }
        System.out.println(count);
    }
    public  static boolean isPalindrom(String str ){
        //设置两个指针，一个指针 i 指向字符串的第一个字符，一个指向最后一个字符
        //然后放入循环，i++，j--，判断是否是回文结构
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            //把字符串转变为字符
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
