package array;
/**
 * leetCode26：删除有序数组中的重复项
 * 双指针的应用
 * @author 达达尼昂
 *
 */
public class deleteRepeatNumbers {
	
	/**
	 * 快慢指针：相同起点出发，如果快指针的值等于慢指针的值，则移动快指针
	 * 直到找到不是重复的值，先移动慢指针，再将快指针的值赋值给慢指针。
	 * 先移动慢指针的作用：
	 * 1.避免因为要将快指针找到的不是重复的值赋值给慢指针，所以同时移动。
	 * 2.如果第一二个数重复，但是赋值给第一个了。
	 */
	
	public int removeDuplicates(int[] nums) {
		int fast = 0, slow = 0;
		while (fast != nums.length) {
			if (nums[slow] != nums[fast]) {
				slow++;
				nums[slow] = nums[fast];
			}
			fast++;
		}
		// 数组长度 = 索引+1
		return slow + 1;
	}

}
