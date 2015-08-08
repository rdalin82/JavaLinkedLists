public class TestNode{
	public static void main(String[] args){
		ListNode l1 = new ListNode(7, new ListNode(0, new ListNode(6)));



		System.out.println(l1.next.next.item);
		l1.insertAfter(3);
		System.out.println(l1.next.item);
	}

}
