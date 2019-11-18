

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		int number = (int) (Math.random() * 100); 
		int max = 100;
		int min = 1;
		
		while(true){
			
			System.out.println("请输入你要猜的数据：(" + min + "~" + max + ")");
			// 这里需要创建录入的对象sc
			Scanner sc = new Scanner(System.in);
			
			int guessNumber = sc.nextInt();
			
			if (guessNumber > number) {
			      max = guessNumber;
			System.out.println("你猜大了");
			} 
			else if (guessNumber < number) {
			      min = guessNumber;
			System.out.println("你猜小了");
			}
			else{
			System.out.println("恭喜你猜对了");
			}
			
		}
	}

}
