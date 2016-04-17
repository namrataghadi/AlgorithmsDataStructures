/*1->2->3->4->5->6->7->8->9->10->null

evenPtr = head.next
oddPtr = head

while(evenPtr!=null){   //1->3->2->4->5->6->7->8->9->10
	prevEven = oddPtr.next
	odPtr.next = evenPtr.next 3->5
	oddPtr = oddPtr.next   oddPtr = 5
	evenPtr.next = oddPtr.next  4->6
	oddPtr.next = prevEvenPtr  3->2
	evenPtr = evenPtr.next 4  // 1->3->2->4->5->6->7->8->9->10
} */
