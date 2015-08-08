/*
version one
class DList {
	private DListNode head;
	private DlistNode tail;

}
*/

//version 2 circularly linked 
class DList {
	private DListNode head; //this is to the sentinel
	//prev points to tail, next points to head on DListNode, nulls point to sentinel  does not effect size
	private int size; 
}
/* 
invariants with sentinel
	for any Dlist d, d.head is never null 
	for any DlistNode x, x.next is never null 
	as well as x.prev is never null 
	as well as if x.next = y (dlistnode), then y.prev points back to x
	and reverse is true 
	size field is always correct 
	number of DList nodes in the list, not counting the sentinel 
	empty DList: sentinel previous and next point to itself 

	