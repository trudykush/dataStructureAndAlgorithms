package LinkedList;

import java.util.Scanner;

class NodeList {
	int data;
	NodeList next;
	
	NodeList(int d) {
		data = d;
		next = null;
	}
}

public class LinkedListInsertion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t-- > 0) {
			LList myList = new LList();
			int n = sc.nextInt();
			sc.nextLine();
			
			for (int i=0; i<n; i++) {
				int a1 = sc.nextInt();
				int a2 = sc.nextInt();
			
				if (a2 == 0) {
					myList.insertAtBeginning(a1);
				} else {
					myList.insertAtEnd(a1);
				}	
			}
			myList.printList();
		}

	}

}

class LList {
	NodeList head;
	
	void insertAtBeginning(int n) {
		NodeList temp = new NodeList(n);
		temp.next = head;
		head = temp;
		
	}
	
	void insertAtEnd(int x) {
		NodeList temp = new NodeList(x);
		if (head == null) {
			head = temp;
			return;
		}
		
		NodeList last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = temp;
	}
	
	void printList() {
		NodeList temp = head;
		
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
