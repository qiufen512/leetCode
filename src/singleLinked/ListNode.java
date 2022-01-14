package singleLinked;

public class ListNode {
	
	private ListNode next;
	
	/* 双指针的应用：返回链表的倒数k个结点 */
	public ListNode findFromEnd(ListNode head, int k) {
		ListNode p1 = head;
		// 通过p1求得n-k
		for(int i = 0 ;i < k; i++) {
			p1 = p1.next;
		}
		ListNode p2 = head;
		// 用p2定位到n-k位
		while(p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}

}
