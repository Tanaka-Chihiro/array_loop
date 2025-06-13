package array_loop;
import java.util.Arrays;
import java.util.Scanner;

public class Kadai1 {
	
	static Scanner scanner = new Scanner(System.in);
	
	//配列を文字列に変換する関数
	public static String intToStr(int[] nums) {
		String str = Arrays.toString(nums).replace("[", "").replace("]", "");
		return str;
	}
	
	//xの段を計算して表示する関数
	public static void timesTable() {
		
		System.out.println("【課題1】");
		//計算した数字を入れる配列
		int[] nums = new int[9];
		
		while(true) {
			
			//xの入力
			System.out.print("xを入力してください：");
			int x = scanner.nextInt();
			
			if(x > 0 && x < 10) {
				for(int i = 0; i < 9; i++) {
					nums[i] = x * (i+1);
				}
				
				System.out.println(intToStr(nums));
				break;
			}else {
				System.out.println("1以上9以下の整数を入力してください");
			}
		}
		
	}
}
