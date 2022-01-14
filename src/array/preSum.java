package array;

public class preSum {
	
	// 保存前缀和的数组
	private int preSum[];

	/* 输入一个数组，构造前缀和 */
	public preSum(int[] arr) {
		preSum = new int[arr.length + 1];
		// 构造前缀和:下标代表前n个数之和
		for (int i = 1; i < preSum.length; i++) {
			preSum[i] = preSum[i - 1] + arr[i - 1];
		}
	}

	/* 查询闭区间[i,j]的累加和 */
	public int sumRange(int left, int right) {
		return preSum[right + 1] - preSum[left];
	}
	
}
