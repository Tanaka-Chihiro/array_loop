package array_loop;

public class Kadai2 {
	
	public static void array() {
		
		//配列
		int[] nums={20,1,2,23,5,11,5,67};
		
		//4番目の要素
		int num4 = nums[3];
		
		//配列の要素数
		int numsLength = nums.length;
		
		//平均値の計算
		//要素の合計を出す
		double sum = 0;
		
		for(int num : nums) {
			sum += num;
		}
		//平均値を出す
		double ave = sum / numsLength;
		
		//中央値の計算
		//昇順に並べ替え
		for(int i = 0; i < numsLength; i++) {
			
			for(int j = 0; j < numsLength-i-1; j++) {
				
				if( nums[j] > nums[j+1] ) {
					int largeNum = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = largeNum;
				}
			}
		}
		//中央値（4番目と5番目の平均）を出す
		int median = (nums[3] + nums[4])/2;
		
		//分散		
		//（データ-平均値）の二乗の合計
		double squaring = 0;
		for(int k = 0; k < numsLength; k++) {
			squaring += (nums[k] - ave)*(nums[k] - ave);
		}
		//分散の計算
		double dispersion = squaring/numsLength;
		
		System.out.println("【課題2】");
		System.out.println("4個目の要素：" + num4);
		System.out.println("要素数：" + numsLength);
		System.out.println("平均値：" + ave);
		System.out.println("中央値：" + median);
		System.out.println("分散：" + dispersion);
		
		
	}
}
