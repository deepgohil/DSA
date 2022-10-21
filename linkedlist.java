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

Remove First In Linkedlist
Easy

1. You are given a partially written LinkedList class.
2. Here is a list of existing functions:
   2.1 addLast - adds a new element with given value to the end of Linked List
   2.2. display - Prints the elements of linked list from front to end in a single line. All 
     elements are separated by space
     2.3. size - Returns the number of elements in the linked list.
3. You are required to complete the body of removeFirst function 
     3.1. removeFirst - This function is required to remove the first element from 
          Linked List. Also, if there is only one element, this should set head and tail to 
          null. If there are no elements, this should print "List is empty".
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
removeFirst
size
addLast 40
addLast 50
removeFirst
display
size
removeFirst
removeFirst
removeFirst
removeFirst
quit

Sample Output
10 20 30 
2
30 40 50 
3
List is empty


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
      return size;
    }

    public void display(){
      for(Node temp = head; temp != null; temp = temp.next){
        System.out.print(temp.data + " ");
      }
      System.out.println();
    }

    public void removeFirst(){
      // write your code here
      if(size==0)
      {
        System.out.println("List is empty");
      }
      else if(size==1)
      {
         head=tail=null;
        size--;
      }
    else{
      head=head.next;
      size--;
    }
      
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
      } else if(str.startsWith("removeFirst")){
        list.removeFirst();
      }
      str = br.readLine();
    }
  }
}





Get Value In Linked List
Easy

1. You are given a partially written LinkedList class.
2. Here is a list of existing functions:
    2.1 addLast - adds a new element with given value to the end of Linked List
    2.2. display - Prints the elements of linked list from front to end in a single line. 
     All elements are separated by space.
2.3. size - Returns the number of elements in the linked list.
2.4. removeFirst - Removes the first element from Linked List. 
3. You are required to complete the body of getFirst, getLast and getAt function 
3.1. getFirst - Should return the data of first element. If empty should return -1 and print "List is empty".
3.2. getLast - Should return the data of last element. If empty should return -1 and print "List is empty".
3.3. getAt - Should return the data of element available at the index passed. If empty should return -1 and print "List is empty". If invalid index is passed, should return -1 and print "Invalid arguments".
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
getFirst
addLast 20
addLast 30
getFirst
getLast
getAt 1
addLast 40
getLast
addLast 50
removeFirst
getFirst
removeFirst
removeFirst
getAt 3
removeFirst
removeFirst
getFirst
quit

Sample Output
10
10
30
20
40
20
Invalid arguments
List is empty
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
      return size;
    }

    public void display(){
      for(Node temp = head; temp != null; temp = temp.next){
        System.out.print(temp.data + " ");
      }
      System.out.println();
    }

    public void removeFirst(){
      if(size == 0){
        System.out.println("List is empty");
      } else if(size == 1){
        head = tail = null;
        size = 0;
      } else {
        head = head.next;
        size--;
      }
    }

    public int getFirst(){
      // write your code here
       if(size == 0){
         System.out.println("List is empty");
       return -1;
      }
      else{
        return head.data;
      }

    }

    public int getLast(){
      // write your code here
      if(size == 1){
       return head.data;
      }
      else if(size==0)
      {
        System.out.println("List is empty");
        return -1;
      }
      else{
        return tail.data;
      }
    }

    public int getAt(int idx){
      // write your code here
    if(size == 0){
         System.out.println("List is empty");
       return -1;
      }

      else if(idx>=size)
      {
        System.out.println("Invalid arguments");
        return -1;
      }
      else
      {
        Node temp=head;
        for (int i = 0; i < idx; i++) {
          temp=temp.next;
        }
        return temp.data;
      }

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
      } else if(str.startsWith("removeFirst")){
        list.removeFirst();
      } else if(str.startsWith("getFirst")){
        int val = list.getFirst();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("getLast")){
        int val = list.getLast();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("getAt")){
        int idx = Integer.parseInt(str.split(" ")[1]);
        int val = list.getAt(idx);
        if(val != -1){
          System.out.println(val);
        }
      }
      str = br.readLine();
    }
  }
}
Add First In Linked List
Easy

1. You are given a partially written LinkedList class.
2. Here is a list of existing functions:
    2.1 addLast - adds a new element with given value to the end of Linked List
    2.2. display - Prints the elements of linked list from front to end in a single line. 
    All elements are separated by space.
    2.3. size - Returns the number of elements in the linked list.
    2.4. removeFirst - Removes the first element from Linked List. 
    2.5. getFirst - Returns the data of first element. 
    2.6. getLast - Returns the data of last element. 
    2.7. getAt - Returns the data of element available at the index passed. 
3. You are required to complete the body of addFirst function. This function should add the element to the beginning of the linkedlist and appropriately set the head, tail and size data-members.
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

addFirst 10
getFirst
addFirst 20
getFirst
getLast
display
size
addLast 40
getLast
addLast 50
addFirst 30
removeFirst
getFirst
removeFirst
removeFirst
getAt 3
display
size
removeFirst
removeFirst
getFirst
quit

Sample Output
10
20
10
20 10 
2
40
20
Invalid arguments
40 50 
2
List is empty
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

    public int size() {
      return size;
    }

    public void display() {
      for (Node temp = head; temp != null; temp = temp.next) {
        System.out.print(temp.data + " ");
      }
      System.out.println();
    }

    public void removeFirst() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        head = head.next;
        size--;
      }
    }

    public int getFirst() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return head.data;
      }
    }

    public int getLast() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return tail.data;
      }
    }

    public int getAt(int idx) {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
        return -1;
      } else {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp.data;
      }
    }

    public void addFirst(int val) {
      // write your code here
      if(size==0)
      {
        Node nn=new Node();
        nn.data=val;
        nn.next=null;
        head=tail=nn;
        size++;
      }
      else{
        Node nn=new Node();
        nn.data=val;
        nn.next=head;
        head=nn;
        size++;
      }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("addLast")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } else if (str.startsWith("size")) {
        System.out.println(list.size());
      } else if (str.startsWith("display")) {
        list.display();
      } else if (str.startsWith("removeFirst")) {
        list.removeFirst();
      } else if (str.startsWith("getFirst")) {
        int val = list.getFirst();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("getLast")) {
        int val = list.getLast();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("getAt")) {
        int idx = Integer.parseInt(str.split(" ")[1]);
        int val = list.getAt(idx);
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("addFirst")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addFirst(val);
      }
      str = br.readLine();
    }
  }
}


Reverse A Linked List (data Iterative)
Easy

1. You are given a partially written LinkedList class.
2. Here is a list of existing functions:
    2.1 addLast - adds a new element with given value to the end of Linked List
    2.2. display - Prints the elements of linked list from front to end in a single line. 
    All elements are separated by space
    2.3. size - Returns the number of elements in the linked list.
    2.4. removeFirst - Removes the first element from Linked List. 
    2.5. getFirst - Returns the data of first element. 
    2.6. getLast - Returns the data of last element. 
    2.7. getAt - Returns the data of element available at the index passed. 
    2.8. addFirst - adds a new element with given value in front of linked list.
    2.9. addAt - adds a new element at a given index.
    2.10. removeLast - removes the last element of linked list.
    2.11. removeAt - remove an element at a given index.
3. You are required to complete the body of reverseDI function. The function should be an iterative function and should reverse the contents of linked list by changing the "data" property of nodes.
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

addFirst 10
addFirst 20
addLast 30
addLast 40
addLast 50
addFirst 60
removeAt 2
display
reverseDI
display
quit

Sample Output
60 20 30 40 50 
50 40 30 20 60


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

    public int size() {
      return size;
    }

    public void display() {
      for (Node temp = head; temp != null; temp = temp.next) {
        System.out.print(temp.data + " ");
      }
      System.out.println();
    }

    public void removeFirst() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        head = head.next;
        size--;
      }
    }

    public int getFirst() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return head.data;
      }
    }

    public int getLast() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return tail.data;
      }
    }

    public int getAt(int idx) {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
        return -1;
      } else {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp.data;
      }
    }
    public Node getNodeAt(int idx) {
      if (size == 0) {
        System.out.println("List is empty");
        return null;
      } else if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
        return null;
      } else {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp;
      }
    }
    public void addFirst(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = head;
      head = temp;

      if (size == 0) {
        tail = temp;
      }

      size++;
    }

    public void addAt(int idx, int val) {
      if (idx < 0 || idx > size) {
        System.out.println("Invalid arguments");
      } else if (idx == 0) {
        addFirst(val);
      } else if (idx == size) {
        addLast(val);
      } else {
        Node node = new Node();
        node.data = val;

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }
        node.next = temp.next;

        temp.next = node;
        size++;
      }
    }

    public void removeLast() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
          temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size--;
      }
    }

    public void removeAt(int idx) {
      if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
      } else if (idx == 0) {
        removeFirst();
      } else if (idx == size - 1) {
        removeLast();
      } else {
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
      }
    }

    public void reverseDI() {
      // write your code here
      int p1=0;
      int p2=size-1;
      while(p1<p2)
      {
        Node n1= getNodeAt(p1);
        Node n2= getNodeAt(p2);

       int temp=n1.data;
       n1.data=n2.data;
        n2.data=temp;
        p1++;
        p2--;
      }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("addLast")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } else if (str.startsWith("size")) {
        System.out.println(list.size());
      } else if (str.startsWith("display")) {
        list.display();
      } else if (str.startsWith("removeFirst")) {
        list.removeFirst();
      } else if (str.startsWith("getFirst")) {
        int val = list.getFirst();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("getLast")) {
        int val = list.getLast();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("getAt")) {
        int idx = Integer.parseInt(str.split(" ")[1]);
        int val = list.getAt(idx);
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("addFirst")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addFirst(val);
      } else if (str.startsWith("addAt")) {
        int idx = Integer.parseInt(str.split(" ")[1]);
        int val = Integer.parseInt(str.split(" ")[2]);
        list.addAt(idx, val);
      } else if (str.startsWith("removeLast")) {
        list.removeLast();
      } else if (str.startsWith("removeAt")) {
        int idx = Integer.parseInt(str.split(" ")[1]);
        list.removeAt(idx);
      } else if(str.startsWith("reverseDI")){
        list.reverseDI();
      }
      str = br.readLine();
    }
  }
}


Reverse Linked List (pointer Iterative)
Easy

1. You are given a partially written LinkedList class.
2. Here is a list of existing functions:
    2.1 addLast - adds a new element with given value to the end of Linked List
    2.2. display - Prints the elements of linked list from front to end in a single line. 
    All elements are separated by space
    2.3. size - Returns the number of elements in the linked list.
    2.4. removeFirst - Removes the first element from Linked List. 
    2.5. getFirst - Returns the data of first element. 
    2.6. getLast - Returns the data of last element. 
    2.7. getAt - Returns the data of element available at the index passed. 
    2.8. addFirst - adds a new element with given value in front of linked list.
    2.9. addAt - adds a new element at a given index.
    2.10. removeLast - removes the last element of linked list.
    2.11. removeAt - remove an element at a given index
3. You are required to complete the body of reversePI function. The function should be an iterative function and should reverse the contents of linked list by changing the "next" property of nodes.
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

addFirst 10
addFirst 20
addLast 30
addLast 40
addLast 50
addFirst 60
removeAt 2
display
reversePI
display
quit

Sample Output
60 20 30 40 50 
50 40 30 20 60 
  
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

    public int size() {
      return size;
    }

    public void display() {
      for (Node temp = head; temp != null; temp = temp.next) {
        System.out.print(temp.data + " ");
      }
      System.out.println();
    }

    public void removeFirst() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        head = head.next;
        size--;
      }
    }

    public int getFirst() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return head.data;
      }
    }

    public int getLast() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return tail.data;
      }
    }

    public int getAt(int idx) {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
        return -1;
      } else {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp.data;
      }
    }

    public void addFirst(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = head;
      head = temp;

      if (size == 0) {
        tail = temp;
      }

      size++;
    }

    public void addAt(int idx, int val) {
      if (idx < 0 || idx > size) {
        System.out.println("Invalid arguments");
      } else if (idx == 0) {
        addFirst(val);
      } else if (idx == size) {
        addLast(val);
      } else {
        Node node = new Node();
        node.data = val;

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }
        node.next = temp.next;

        temp.next = node;
        size++;
      }
    }

    public void removeLast() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
          temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size--;
      }
    }

    public void removeAt(int idx) {
      if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
      } else if (idx == 0) {
        removeFirst();
      } else if (idx == size - 1) {
        removeLast();
      } else {
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
      }
    }

    private Node getNodeAt(int idx) {
      Node temp = head;
      for (int i = 0; i < idx; i++) {
        temp = temp.next;
      }
      return temp;
    }

    public void reverseDI() {
      int li = 0;
      int ri = size - 1;
      while(li < ri){
        Node left = getNodeAt(li);
        Node right = getNodeAt(ri);

        int temp = left.data;
        left.data = right.data;
        right.data = temp;

        li++;
        ri--;
      }
    }
 
    public void reversePI(){
      // write your code here
      Node previous=null;
      Node current=head;
      Node forward=head;
      Node temp=current;
      for(int i=0;i<size;i++)
      {
        forward=current.next;
        current.next=previous;
        previous=current;
        current=forward;

      }
      head=previous;
      tail=temp;

    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("addLast")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } else if (str.startsWith("size")) {
        System.out.println(list.size());
      } else if (str.startsWith("display")) {
        list.display();
      } else if (str.startsWith("removeFirst")) {
        list.removeFirst();
      } else if (str.startsWith("getFirst")) {
        int val = list.getFirst();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("getLast")) {
        int val = list.getLast();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("getAt")) {
        int idx = Integer.parseInt(str.split(" ")[1]);
        int val = list.getAt(idx);
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("addFirst")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addFirst(val);
      } else if (str.startsWith("addAt")) {
        int idx = Integer.parseInt(str.split(" ")[1]);
        int val = Integer.parseInt(str.split(" ")[2]);
        list.addAt(idx, val);
      } else if (str.startsWith("removeLast")) {
        list.removeLast();
      } else if (str.startsWith("removeAt")) {
        int idx = Integer.parseInt(str.split(" ")[1]);
        list.removeAt(idx);
      } else if(str.startsWith("reverseDI")){
        list.reverseDI();
      } else if(str.startsWith("reversePI")){
        list.reversePI();
      }
      str = br.readLine();
    }
  }
}


Is Linked List A Palindrome?
Easy

1. You are given a partially written LinkedList class.
2. You are required to complete the body of IsPalindrome function. The function is expected to check if the linked list is a palindrome or not and return true or false accordingly.
3. Input and Output is managed for you.

Constraints
1. Time complexity -> O(n)
2. Space complexity -> Recursion space, O(n)

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

5
1 2 3 2 1

Sample Output
true
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

    public int size() {
      return size;
    }

    public void display() {
      for (Node temp = head; temp != null; temp = temp.next) {
        System.out.print(temp.data + " ");
      }
      System.out.println();
    }

    public void removeFirst() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        head = head.next;
        size--;
      }
    }

    public int getFirst() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return head.data;
      }
    }

    public int getLast() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return tail.data;
      }
    }

    public int getAt(int idx) {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
        return -1;
      } else {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp.data;
      }
    }

    public void addFirst(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = head;
      head = temp;

      if (size == 0) {
        tail = temp;
      }

      size++;
    }

    public void addAt(int idx, int val) {
      if (idx < 0 || idx > size) {
        System.out.println("Invalid arguments");
      } else if (idx == 0) {
        addFirst(val);
      } else if (idx == size) {
        addLast(val);
      } else {
        Node node = new Node();
        node.data = val;

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }
        node.next = temp.next;

        temp.next = node;
        size++;
      }
    }

    public void removeLast() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
          temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size--;
      }
    }

    public void removeAt(int idx) {
      if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
      } else if (idx == 0) {
        removeFirst();
      } else if (idx == size - 1) {
        removeLast();
      } else {
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
      }
    }

    private Node getNodeAt(int idx) {
      Node temp = head;
      for (int i = 0; i < idx; i++) {
        temp = temp.next;
      }
      return temp;
    }

    public void reverseDI() {
      int li = 0;
      int ri = size - 1;
      while (li < ri) {
        Node left = getNodeAt(li);
        Node right = getNodeAt(ri);

        int temp = left.data;
        left.data = right.data;
        right.data = temp;

        li++;
        ri--;
      }
    }

    public void reversePI() {
      if (size <= 1) {
        return;
      }

      Node prev = null;
      Node curr = head;
      while (curr != null) {
        Node next = curr.next;

        curr.next = prev;
        prev = curr;
        curr = next;
      }

      Node temp = head;
      head = tail;
      tail = temp;
    }

    public int kthFromLast(int k) {
      Node slow = head;
      Node fast = head;
      for (int i = 0; i < k; i++) {
        fast = fast.next;
      }

      while (fast != tail) {
        slow = slow.next;
        fast = fast.next;
      }

      return slow.data;
    }

    public int mid() {
      Node f = head;
      Node s = head;

      while (f.next != null && f.next.next != null) {
        f = f.next.next;
        s = s.next;
      }

      return s.data;
    }

    public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
      LinkedList ml = new LinkedList();

      Node one = l1.head;
      Node two = l2.head;
      while (one != null && two != null) {
        if (one.data < two.data) {
          ml.addLast(one.data);
          one = one.next;
        } else {
          ml.addLast(two.data);
          two = two.next;
        }
      }

      while (one != null) {
        ml.addLast(one.data);
        one = one.next;
      }

      while (two != null) {
        ml.addLast(two.data);
        two = two.next;
      }

      return ml;
    }

    public static Node midNode(Node head, Node tail) {
      Node f = head;
      Node s = head;

      while (f != tail && f.next != tail) {
        f = f.next.next;
        s = s.next;
      }

      return s;
    }

    public static LinkedList mergeSort(Node head, Node tail) {
      if (head == tail) {
        LinkedList br = new LinkedList();
        br.addLast(head.data);
        return br;
      }

      Node mid = midNode(head, tail);
      LinkedList fsh = mergeSort(head, mid);
      LinkedList ssh = mergeSort(mid.next, tail);
      LinkedList sl = mergeTwoSortedLists(fsh, ssh);
      return sl;
    }

    public void removeDuplicates() {
      LinkedList res = new LinkedList();

      while (this.size() > 0) {
        int val = this.getFirst();
        this.removeFirst();

        if (res.size() == 0 || val != res.tail.data) {
          res.addLast(val);
        }
      }

      this.head = res.head;
      this.tail = res.tail;
      this.size = res.size;
    }

    public void oddEven() {
      LinkedList odd = new LinkedList();
      LinkedList even = new LinkedList();

      while (this.size > 0) {
        int val = this.getFirst();
        this.removeFirst();

        if (val % 2 == 0) {
          even.addLast(val);
        } else {
          odd.addLast(val);
        }
      }

      if (odd.size > 0 && even.size > 0) {
        odd.tail.next = even.head;

        this.head = odd.head;
        this.tail = even.tail;
        this.size = odd.size + even.size;
      } else if (odd.size > 0) {
        this.head = odd.head;
        this.tail = odd.tail;
        this.size = odd.size;
      } else if (even.size > 0) {
        this.head = even.head;
        this.tail = even.tail;
        this.size = even.size;
      }
    }

    public void kReverse(int k) {
      LinkedList prev = null;

      while (this.size > 0) {
        LinkedList curr = new LinkedList();

        if (this.size >= k) {
          for (int i = 0; i < k; i++) {
            int val = this.getFirst();
            this.removeFirst();
            curr.addFirst(val);
          }
        } else {
          int sz = this.size;
          for (int i = 0; i < sz; i++) {
            int val = this.getFirst();
            this.removeFirst();
            curr.addLast(val);
          }
        }

        if (prev == null) {
          prev = curr;
        } else {
          prev.tail.next = curr.head;
          prev.tail = curr.tail;
          prev.size += curr.size;
        }
      }

      this.head = prev.head;
      this.tail = prev.tail;
      this.size = prev.size;
    }

    private void displayReverseHelper(Node node) {
      if (node == null) {
        return;
      }
      displayReverseHelper(node.next);
      System.out.print(node.data + " ");
    }

    public void displayReverse() {
      displayReverseHelper(head);
      System.out.println();
    }

    private void reversePRHelper(Node node) {
      if (node == tail) {
        return;
      }
      reversePRHelper(node.next);
      node.next.next = node;
    }

    public void reversePR() {
      reversePRHelper(head);
      Node temp = head;
      head = tail;
      tail = temp;
      tail.next = null;
    }

    public boolean IsPalindrome() {
      // write your code here
      left=this.head;
      return IsPalindromehelper(this.head,0);

    }
    static Node left;
    public boolean IsPalindromehelper(Node node,int counter)
    {
      if(node==null)
      {
        return true;
      }
      boolean retval=IsPalindromehelper(node.next,counter+1);
      if(retval==false)
      {
        return false;
      }
      else{
        if(counter>=this.size/2)
        { 
          if(left.data==node.data)
          {
           left=left.next;
            return true;
          }
          else{
            return false;
          }
        }
return true;

      }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n1 = Integer.parseInt(br.readLine());
    LinkedList l1 = new LinkedList();
    String[] values1 = br.readLine().split(" ");
    for (int i = 0; i < n1; i++) {
      int d = Integer.parseInt(values1[i]);
      l1.addLast(d);
    }

    System.out.println(l1.IsPalindrome());
  }
}

Fold A Linked List
Easy

1. You are given a partially written LinkedList class.
2. You are required to complete the body of fold function. The function is expected to place last element after 1st element, 2nd last element after 2nd element and so on. For more insight check the example

Example 1
1->2->3->4->5
will fold as
1->5->2->4->3

Example 2
1->2->3->4->5->6
1->6->2->5->3->4

Constraints
1. Time complexity -> O(n)
2. Space complexity -> Recursion space, O(n)

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

5
1 2 3 4 5
10
20

Sample Output
1 2 3 4 5 
1 5 2 4 3 
10 1 5 2 4 3 20
  
  
  
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

    public int size() {
      return size;
    }

    public void display() {
      for (Node temp = head; temp != null; temp = temp.next) {
        System.out.print(temp.data + " ");
      }
      System.out.println();
    }

    public void removeFirst() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        head = head.next;
        size--;
      }
    }

    public int getFirst() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return head.data;
      }
    }

    public int getLast() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return tail.data;
      }
    }

    public int getAt(int idx) {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
        return -1;
      } else {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp.data;
      }
    }

    public void addFirst(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = head;
      head = temp;

      if (size == 0) {
        tail = temp;
      }

      size++;
    }

    public void addAt(int idx, int val) {
      if (idx < 0 || idx > size) {
        System.out.println("Invalid arguments");
      } else if (idx == 0) {
        addFirst(val);
      } else if (idx == size) {
        addLast(val);
      } else {
        Node node = new Node();
        node.data = val;

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }
        node.next = temp.next;

        temp.next = node;
        size++;
      }
    }

    public void removeLast() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
          temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size--;
      }
    }

    public void removeAt(int idx) {
      if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
      } else if (idx == 0) {
        removeFirst();
      } else if (idx == size - 1) {
        removeLast();
      } else {
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
      }
    }

    private Node getNodeAt(int idx) {
      Node temp = head;
      for (int i = 0; i < idx; i++) {
        temp = temp.next;
      }
      return temp;
    }

    public void reverseDI() {
      int li = 0;
      int ri = size - 1;
      while (li < ri) {
        Node left = getNodeAt(li);
        Node right = getNodeAt(ri);

        int temp = left.data;
        left.data = right.data;
        right.data = temp;

        li++;
        ri--;
      }
    }

    public void reversePI() {
      if (size <= 1) {
        return;
      }

      Node prev = null;
      Node curr = head;
      while (curr != null) {
        Node next = curr.next;

        curr.next = prev;
        prev = curr;
        curr = next;
      }

      Node temp = head;
      head = tail;
      tail = temp;
    }

    public int kthFromLast(int k) {
      Node slow = head;
      Node fast = head;
      for (int i = 0; i < k; i++) {
        fast = fast.next;
      }

      while (fast != tail) {
        slow = slow.next;
        fast = fast.next;
      }

      return slow.data;
    }

    public int mid() {
      Node f = head;
      Node s = head;

      while (f.next != null && f.next.next != null) {
        f = f.next.next;
        s = s.next;
      }

      return s.data;
    }

    public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
      LinkedList ml = new LinkedList();

      Node one = l1.head;
      Node two = l2.head;
      while (one != null && two != null) {
        if (one.data < two.data) {
          ml.addLast(one.data);
          one = one.next;
        } else {
          ml.addLast(two.data);
          two = two.next;
        }
      }

      while (one != null) {
        ml.addLast(one.data);
        one = one.next;
      }

      while (two != null) {
        ml.addLast(two.data);
        two = two.next;
      }

      return ml;
    }

    public static Node midNode(Node head, Node tail) {
      Node f = head;
      Node s = head;

      while (f != tail && f.next != tail) {
        f = f.next.next;
        s = s.next;
      }

      return s;
    }

    public static LinkedList mergeSort(Node head, Node tail) {
      if (head == tail) {
        LinkedList br = new LinkedList();
        br.addLast(head.data);
        return br;
      }

      Node mid = midNode(head, tail);
      LinkedList fsh = mergeSort(head, mid);
      LinkedList ssh = mergeSort(mid.next, tail);
      LinkedList sl = mergeTwoSortedLists(fsh, ssh);
      return sl;
    }

    public void removeDuplicates() {
      LinkedList res = new LinkedList();

      while (this.size() > 0) {
        int val = this.getFirst();
        this.removeFirst();

        if (res.size() == 0 || val != res.tail.data) {
          res.addLast(val);
        }
      }

      this.head = res.head;
      this.tail = res.tail;
      this.size = res.size;
    }

    public void oddEven() {
      LinkedList odd = new LinkedList();
      LinkedList even = new LinkedList();

      while (this.size > 0) {
        int val = this.getFirst();
        this.removeFirst();

        if (val % 2 == 0) {
          even.addLast(val);
        } else {
          odd.addLast(val);
        }
      }

      if (odd.size > 0 && even.size > 0) {
        odd.tail.next = even.head;

        this.head = odd.head;
        this.tail = even.tail;
        this.size = odd.size + even.size;
      } else if (odd.size > 0) {
        this.head = odd.head;
        this.tail = odd.tail;
        this.size = odd.size;
      } else if (even.size > 0) {
        this.head = even.head;
        this.tail = even.tail;
        this.size = even.size;
      }
    }

    public void kReverse(int k) {
      LinkedList prev = null;

      while (this.size > 0) {
        LinkedList curr = new LinkedList();

        if (this.size >= k) {
          for (int i = 0; i < k; i++) {
            int val = this.getFirst();
            this.removeFirst();
            curr.addFirst(val);
          }
        } else {
          int sz = this.size;
          for (int i = 0; i < sz; i++) {
            int val = this.getFirst();
            this.removeFirst();
            curr.addLast(val);
          }
        }

        if (prev == null) {
          prev = curr;
        } else {
          prev.tail.next = curr.head;
          prev.tail = curr.tail;
          prev.size += curr.size;
        }
      }

      this.head = prev.head;
      this.tail = prev.tail;
      this.size = prev.size;
    }

    private void displayReverseHelper(Node node) {
      if (node == null) {
        return;
      }
      displayReverseHelper(node.next);
      System.out.print(node.data + " ");
    }

    public void displayReverse() {
      displayReverseHelper(head);
      System.out.println();
    }

    private void reversePRHelper(Node node) {
      if (node == tail) {
        return;
      }
      reversePRHelper(node.next);
      node.next.next = node;
    }

    public void reversePR() {
      reversePRHelper(head);
      Node temp = head;
      head = tail;
      tail = temp;
      tail.next = null;
    }
    public void foldHelper(Node right,int count)
    {
if(right==null)
{
return ;
}
foldHelper(right.next,count+1);
if(count>size/2)
{
Node forward=left.next;
left.next=right;
right.next=forward;
left=forward;
return;
}
else if(count==size/2)
{
  right.next=null;
  tail=right;
  return;
}
return;

    }
    static Node left;
    public void fold() {
      left=head;
      foldHelper(head,0);
      return;
      // write your code here

    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n1 = Integer.parseInt(br.readLine());
    LinkedList l1 = new LinkedList();
    String[] values1 = br.readLine().split(" ");
    for (int i = 0; i < n1; i++) {
      int d = Integer.parseInt(values1[i]);
      l1.addLast(d);
    }

    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());

    l1.display();
    l1.fold();
    l1.display();
    l1.addFirst(a);
    l1.addLast(b);
    l1.display();
  }
}  
Linked List To Stack Adapter
Easy

1. You are required to complete the code of our LLToStackAdapter class. 
2. As data members, you've a linkedlist available in the class.
3. Here is the list of functions that you are supposed to complete
    3.1. push -> Should accept new data in LIFO manner
    3.2. pop -> Should remove and return data in LIFO manner. If not 
     available, print "Stack underflow" and return -1.
    3.3. top -> Should return data in LIFO manner. If not available, print 
    "Stack underflow" and return -1.
    3.4. size -> Should return the number of elements available in the 
    stack
4. Input and Output is managed for you.

Note -> The intention is to use linked list functions to achieve the purpose of a stack. All the functions should work in constant time.

Constraints
None

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

push 10
push 20
push 5
push 8
push 2
push 4
push 11
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
quit

Sample Output
11
7
11
4
6
4
2
5
2
8
4
8
5
3
5
20
2
20
10
1
10
import java.io.*;
import java.util.*;

public class Main {

  public static class LLToStackAdapter {
    LinkedList<Integer> list;

    public LLToStackAdapter() {
      list = new LinkedList<>();
    }


    int size() {
      // write your code here\
      return list.size();
    }

    void push(int val) {
      // write your code here
     list.addFirst(val);
    }

    int pop() {
      // write your code here
      if(list.size()==0)
      {
        System.out.println("Stack underflow");
        return -1;
      }
      return list.removeFirst();
    }

    int top() {
      // write your code here
            if(list.size()==0)
      {
        System.out.println("Stack underflow");
        return -1;
      }
      return list.getFirst();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LLToStackAdapter st = new LLToStackAdapter();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}

Linked List To Queue Adapter
Easy

1. You are required to complete the code of our LLToQueueAdapter class. 
2. As data members, you've a linkedlist available in the class.
3. Here is the list of functions that you are supposed to complete
     3.1. add -> Should accept new data in FIFO manner
     3.2. remove -> Should remove and return data in FIFO manner. If not available, 
     print "Queue underflow" and return -1.
     3.3. peek -> Should return data in FIFO manner. If not available, print "Queue 
     underflow" and return -1.
     3.4. size -> Should return the number of elements available in the queue
4. Input and Output is managed for you.

Note -> The intention is to use linked list functions to achieve the purpose of a queue. All the functions should work in constant time.

Constraints
None

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

add 10
add 20
add 30
add 40
add 50
add 60
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
quit

Sample Output
10
10
20
20
30
30
40
40
50
50
60
60
import java.io.*;
import java.util.*;

public class Main {

  public static class LLToQueueAdapter {
    LinkedList<Integer> list;

    public LLToQueueAdapter() {
      list = new LinkedList<>();
    }

    int size() {
      // write your code here
      return list.size();
    }

    void add(int val) {
      // write your code here
      list.addLast(val);
    }

    int remove() {
      // write your code here
      if(list.size()==0)
      {   System.out.println("Queue underflow");

          return -1;
      }
      
      return list.removeFirst();
    }

    int peek() {
      // write your code here
       if(list.size()==0)
      {   System.out.println("Queue underflow");

          return -1;
      }
      
      return list.getFirst();

    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LLToQueueAdapter qu = new LLToQueueAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}

Kth Node From End Of Linked List
Easy

1. You are given a partially written LinkedList class.
2. Here is a list of existing functions:
     2.1 addLast - adds a new element with given value to the end of Linked List
     2.2. display - Prints the elements of linked list from front to end in a single line. 
     All elements are separated by space.
    2.3. size - Returns the number of elements in the linked list.
    2.4. removeFirst - Removes the first element from Linked List. 
    2.5. getFirst - Returns the data of first element. 
    2.6. getLast - Returns the data of last element. 
    2.7. getAt - Returns the data of element available at the index passed. 
    2.8. addFirst - adds a new element with given value in front of linked list.
    2.9. addAt - adds a new element at a given index.
    2.10. removeLast - removes the last element of linked list.
    2.11. removeAt - remove an element at a given index
3. You are required to complete the body of kthFromLast function. The function should be an iterative function and should return the kth node from end of linked list. Also, make sure to not use size data member directly or indirectly (by calculating size via making a traversal). k is a 0-based index. Assume that valid values of k will be passed.
4. Input and Output is managed for you.

Constraints
1. Size property should not be used directly or indirectly
2. Constant time, single traversal is expected
3. Iterative solution, (not recursion) is expected

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

addLast 10
getFirst
addLast 20
addLast 30
getFirst
getLast
getAt 1
addLast 40
kthFromEnd 3
getLast
addLast 50
removeFirst
getFirst
removeFirst
removeFirst
kthFromEnd 0
removeFirst
removeFirst
getFirst
quit

Sample Output
10
10
30
20
10
40
20
50
List is empty
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

    public int size() {
      return size;
    }

    public void display() {
      for (Node temp = head; temp != null; temp = temp.next) {
        System.out.print(temp.data + " ");
      }
      System.out.println();
    }

    public void removeFirst() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        head = head.next;
        size--;
      }
    }

    public int getFirst() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return head.data;
      }
    }

    public int getLast() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return tail.data;
      }
    }

    public int getAt(int idx) {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
        return -1;
      } else {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp.data;
      }
    }

    public void addFirst(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = head;
      head = temp;

      if (size == 0) {
        tail = temp;
      }

      size++;
    }

    public void addAt(int idx, int val) {
      if (idx < 0 || idx > size) {
        System.out.println("Invalid arguments");
      } else if (idx == 0) {
        addFirst(val);
      } else if (idx == size) {
        addLast(val);
      } else {
        Node node = new Node();
        node.data = val;

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }
        node.next = temp.next;

        temp.next = node;
        size++;
      }
    }

    public void removeLast() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
          temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size--;
      }
    }

    public void removeAt(int idx) {
      if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
      } else if (idx == 0) {
        removeFirst();
      } else if (idx == size - 1) {
        removeLast();
      } else {
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
      }
    }

    private Node getNodeAt(int idx) {
      Node temp = head;
      for (int i = 0; i < idx; i++) {
        temp = temp.next;
      }
      return temp;
    }

    public void reverseDI() {
      int li = 0;
      int ri = size - 1;
      while(li < ri){
        Node left = getNodeAt(li);
        Node right = getNodeAt(ri);

        int temp = left.data;
        left.data = right.data;
        right.data = temp;

        li++;
        ri--;
      }
    }
 
    public void reversePI(){
      if(size <= 1){
        return;
      }

      Node prev = null;
      Node curr = head;
      while(curr != null){
        Node next = curr.next;
        
        curr.next = prev;
        prev = curr;
        curr = next;
      }

      Node temp = head;
      head = tail;
      tail = temp;
    }
  
    public int kthFromLast(int k){
      // write your code here
      Node forward,current;
      forward=current=head;
      while(k!=0)
      {
        forward=forward.next;
        k--;
      }
      while(forward.next!=null)
      {
        forward=forward.next;
        current=current.next;
      }
    return current.data;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("addLast")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } else if (str.startsWith("size")) {
        System.out.println(list.size());
      } else if (str.startsWith("display")) {
        list.display();
      } else if (str.startsWith("removeFirst")) {
        list.removeFirst();
      } else if (str.startsWith("getFirst")) {
        int val = list.getFirst();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("getLast")) {
        int val = list.getLast();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("getAt")) {
        int idx = Integer.parseInt(str.split(" ")[1]);
        int val = list.getAt(idx);
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("addFirst")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addFirst(val);
      } else if (str.startsWith("addAt")) {
        int idx = Integer.parseInt(str.split(" ")[1]);
        int val = Integer.parseInt(str.split(" ")[2]);
        list.addAt(idx, val);
      } else if (str.startsWith("removeLast")) {
        list.removeLast();
      } else if (str.startsWith("removeAt")) {
        int idx = Integer.parseInt(str.split(" ")[1]);
        list.removeAt(idx);
      } else if(str.startsWith("reverseDI")){
        list.reverseDI();
      } else if(str.startsWith("reversePI")){
        list.reversePI();
      } else if(str.startsWith("kthFromEnd")){
        int idx = Integer.parseInt(str.split(" ")[1]);
        System.out.println(list.kthFromLast(idx));
      }
      str = br.readLine();
    }
  }
}
