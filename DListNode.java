//Doubly linked Lists 2 versions 
/*
inserting deleting at front of list is easy in single linked lists 

Inserting or deleting at end of the list 
	no pointer, need to start at front, walk all the way back 
	with tail pointer, inserting is easy, deleting isn't 
	doubly linked helps with this 

	Removes the tail node (at least 2 items in Dlist)
		this goes in DList? right? 
		tail.prev.next = null;
		tail = tail.prev; 

	Sentinel:  A special node that does not represent an item 


*/

class DListNode {
	Object item;
	DListNode next;
	DListNode prev;

	public DListNode(Object item, DListNode next, DListNode prev) {
		this.item = item;
		this.next = next;
		this.prev = prev;
	}

	public DListNode (Object item){
		this.item = item;
		this.next = null; 
		this.prev = null; 
	}
}




// Private method or field is invisble and not asscessible
//why? 
//1 prevent data from being corrupted by other people or yourself
//2 prevent dependency from other classes, allows for changes without messing up other programs or classes


/*public class Date 
	private int day;
	private int month;

	private void setMonth(int m){
		month = m;
	}

	public Date(int month, int day) {
		[implement with error checking code]
	}
}

public class EvilTamperer{
	public void tamper()
	Date d = new Date(1, 1, 2006);
	d.day = 100;
	d.setMonth(0);
}

Java will refuse to compile EvilTamperer, private method fails


Interface of a class: is prototypes for public methods
and descriptions of those methods behaviors 

Abstract Data Type(ADT): a class (or multiple) that has a well defined interface but 
implementation details are hidden from other classes 

Invariant: (ADT enforces this) is a fact about a data structure (always true) 
	"A date object always represents a valid date" (error checking code and protection of tampering)
	ADT - should aspire to, but not always possible, some are just data storage units

Invariants force data to be valid





*/
