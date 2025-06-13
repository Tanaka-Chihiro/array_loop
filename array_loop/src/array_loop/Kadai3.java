package array_loop;

public class Kadai3 {
	
	public static void doubleArray() {
		//配列
		int[][] array = {
				{ 1, 8, 12, 17, 20 },
				{ 2, 5, 11, 13, 18 },
				{ 4, 6, 9, 19, 21 }
				};
		
		System.out.println("【課題3】");
		
		//配列の要素を表示する
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				
				//最後の要素で改行する
				if(j == array[i].length-1) {
					System.out.println(array[i][j]);
				}else {
					System.out.print(array[i][j] + " ");
				}
			}
		}
	}

}
