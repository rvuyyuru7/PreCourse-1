// Time Complexity : O(1) for all operations
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Did not find it on Leetcode.
// Any problem you faced while coding this : Yes, I could not solve it without using the StackNode pre.
public class Exercise_2 { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
        StackNode pre;
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data = data;
            this.next = null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        //Write your code here for the condition if stack is empty. 
        return this.root == null || this.root.next == null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        if (root == null) {
            root = new StackNode(data);
            root.pre = null;
            // root.next = null;
        }
        StackNode previousNode = root;
        root.next = new StackNode(data);
        root = root.next;
        root.pre = previousNode;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
        if (root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int popData = root.data;
        root = root.pre;
        root.next = null;
        return popData;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (root == null) {
            return -1;
        }
        return root.data;

    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
