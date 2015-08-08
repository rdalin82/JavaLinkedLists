// recursive data type
// Made of Nodes{ Item and reference to next node in list }
// built into Scheme(lisp)
// Advantages over array lists:
//	instering an int middle of linked list takes constant time if you have a reference to previous node
// 
// Don't have to worry about how big list/array is.  
// can be as big as you like as long as memory doesn't run out

///
// Disadvantages
// finding the nth item of a linked list takes time proportional to n -> lenght of list 
//  arrays  = constant time on array list
// hash tables and binary trees - compromise between arrays and linked list

// Lists of Objects
// Reference any object by declaring a reference of Type Object. 
//



public class ListNode{
	int item;
	ListNode next;

	public ListNode(int item, ListNode next){
		this.item = item;
		this.next = next;
	}

	public ListNode(){
		int item;
		ListNode next;
	}

	public ListNode(int item){
		this(item, null);
		//this.item = item, this.next = null
	}	

	//insert a new item after "this" node:
	public void insertAfter(int item){
		next = new ListNode(item, next);
	}
	
	public ListNode nth(int position){
		if (position ==1){
			return this;
		// error checking
		} 
		else if ((position< 1)||(next == null)){
			return null;
		}
		else {
			return next.nth(position-1);
		}
	}
	

}
