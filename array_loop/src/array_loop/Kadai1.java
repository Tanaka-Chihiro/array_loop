package array_loop;
import java.util.Scanner;

public class Kadai1 {
	
	static Scanner scanner = new Scanner(System.in);
	
	//配列を表示する関数
	public static void printArray(int[] nums) {
		
		for(int i = 0; i < nums.length; i++) {
			//最後の要素で改行する
			if( i == nums.length -1) {
				System.out.println( nums[i]);
			}else {
				System.out.print( nums[i] + "、" );
			}
		}
		
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
				for(int j = 0; j < 9; j++) {
					nums[j] = x * (j+1);
				}
				
				printArray(nums);
				break;
			}else {
				System.out.println("1以上9以下の整数を入力してください");
			}
		}
		
	}
}
