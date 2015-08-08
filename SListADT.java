//ADT advantage is you can force invariance.  This is from linked list 2 lecture
/*
1. size field is always correct
2. list is never circularly linked.  prevents loop in the list(infinite loop)
((follow this list who's next pointer is nil))

These deal with hidden parts of data structure, prevent problems 

Both goals accomplished because only (simple java mechanisms)
	Slist methods can change the lists (only SLists can) 

SList ensures this: 
	the fields of the SList class are private(head and size) 
	Individual nodes, no method of SList returns an SListNode
	can ONLY get items, not the nodes




