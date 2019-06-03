DEQUEUE
	=>The main advantage of Deque is that you can use it as both Queue (FIFO) as well as Stack (LIFO).
Operation	Throws an exception if operation fails.	Returns null or false if operation fails.
Insertion	Front End -	addFirst()	offerFirst()
Rear End			  -	addLast()	offerLast()
Retrieval	Front End -	getFirst()	peekFirst()
Rear End			  -	getLast()	peekLast()
RetrievalAnd
Removal	Front End     -	removeFirst()	pollFirst()
Rear End			  -	removeLast()	pollLast()


How Deque – Double Ended Queue Works?
Queue Methods	Equivalent Deque Methods
add()			addLast()
offer()			OfferLast()
element()		getFirst()
peek()			peekFirst()
remove()		removeFirst()
poll()			pollFirst()

Deque As Stack :
Stack Methods	Equivalent Deque Methods
push()			addFirst()
pop()			removeFirst()
peek()			peekFirst()

Properties Of Deque :

   * Unlike Queue, Deque can have null elements.
	But, it is recommended not to insert null elements as many methods return null to indicate Deque is empty.

   * Deque can have duplicate elements.

   * You can’t set or get or insert the elements at an arbitrary position of Deque.
	i.e Random access is not possible with the Deque.

    You can use removeFirstOccurrenec(E e), removeLastOccurrence(E e) and remove(E e) methods to delete the elements from the Deque.