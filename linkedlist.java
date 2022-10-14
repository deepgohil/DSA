Add Last In Linked List
Easy

1. You are given a partially written LinkedList class.
2. You are required to complete the body of addLast function. This function is supposed to add an element to the end of LinkedList. You are required to update head, tail and size as required.
3. Input and Output is managed for you. Just update the code in addLast function.

Constraints
None

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

addLast 10
addLast 20
addLast 30
addLast 40
addLast 50
quit

Sample Output
10
20
30
40
50
5
50
import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      // Write your code here
      Node nn=new Node();
      nn.data=val; 
      if(size==0)
      {
        head=tail=nn;
      }
      else
      {
        tail.next=nn;
        tail=nn;

      }
      size++;
    }
  }

  public static void testList(LinkedList list) {
    for (Node temp = list.head; temp != null; temp = temp.next) {
      System.out.println(temp.data);
    }
    System.out.println(list.size);

    if (list.size > 0) {
      System.out.println(list.tail.data);
    } 
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } 
      str = br.readLine();
    }

    testList(list);
  }
}
Display A Linkedlist
Easy

1. You are given a partially written LinkedList class.
2. Here is a list of existing functions:
   2.1 addLast - adds a new element with given value to the end of Linked List
3. You are required to complete the body of display function and size function
   3.1. display - Should print the elements of linked list from front to end in a single line. Elements should be separated by space.
   3.2. size - Should return the number of elements in the linked list.
4. Input and Output is managed for you.

Constraints
None

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

addLast 10
addLast 20
addLast 30
display
size
addLast 40
addLast 50
display
size
quit

Sample Output
10 20 30 
3
10 20 30 40 50 
5
  import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = null;

      if (size == 0) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }

      size++;
    }

    public int size(){
      // write code here
      return size;
    }

    public void display(){
      // write code here
       Node temp = new Node();
       temp=head;
       if(size==0) return;
for (int i = 0; i < size; i++) {
  System.out.print(temp.data+" ");
  temp=temp.next;
}
System.out.println("");
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } else if(str.startsWith("size")){
        System.out.println(list.size());
      } else if(str.startsWith("display")){
        list.display();
      }
      str = br.readLine();
    }
  }
}
