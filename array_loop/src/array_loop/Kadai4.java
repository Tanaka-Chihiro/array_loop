package array_loop;

public class Kadai4 {
	
	public static void pyramid() {
		
		System.out.println("【課題4】");
		
		//繰り返す文字とスペース
		String repeatStr = "$";
		String repeatSpc = " ";
		
		//1つ目のピラミッドの表示
		for(int i = 1; i <= 4; i++) {
			System.out.println( repeatStr.repeat(i));
		}
		
		System.out.println("");
		
		//2つ目のピラミッドの表示
		for(int j = 1; j <= 4; j++) {
			System.out.println( repeatSpc.repeat(4-j) + repeatStr.repeat(j));
		}
	}

}
