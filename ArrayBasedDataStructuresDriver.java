/**
 * Write a description of class ArrayBasedDataStructuresDriver here.
 *
 * @author Nikita Patel
 * @version 1
 */
public class ArrayBasedDataStructuresDriver {
    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String[] args) {
        stackTests();
        queueTests();
        arrayListTests();
    }

    /**
     * Method arrayListTests  tests: insert, remove, size, toString, isEmpty, indexOf, equals, get
     *
     */
    private static void arrayListTests() {
        //todo: make more tests here
        //create a new instance of the class ArrayList
        ArrayList a = new ArrayList();
        //insert element at the given indexes
        a.insert('b', 0);
        a.insert('a',0);
        a.insert('t',1);
        //insert a null
        //a.insert(null,1);

        //print statement
        System.out.println("ArrayList Tests:");
        //call toString
        System.out.println("Insert a: " + a.toString());
        //calls isEmpty to check if the arrayList is empty
        System.out.println("Is it a empty?: " + a.isEmpty());
        //call size method to check the size
        System.out.println("The size of the arrayList a is: " + a.size());
        //call get method to get elements at specific indexes
        System.out.println("get object at index 1 from a: " + a.get(1));
        System.out.println("get object at index 0 from a: " + a.get(0));

        //while there are elements in the stack
        while(a.isEmpty() == false) {
            //remove the one at index 0 of the ArrayList and print it out in order
            System.out.println(a.remove(0) + " has been removed");
        }
        //calls toString to print elements in arraylist
        System.out.println("Removed a: " + a.toString());
        //calls isEmpty
        System.out.println("Is a empty?: " + a.isEmpty());
        //call size method
        System.out.println("The size of the arrayList a is: " + a.size());
        
        //create a new instance of the class ArrayList
        ArrayList b = new ArrayList();
        //insert element at the given indexes
        b.insert('d', 0); 
        b.insert('e',0); 
        b.insert('f',1);  

        //calls toString to print elements
        System.out.println("Insert b: " + b.toString());
        //calls equals method to check if a and b are equal
        System.out.println("Are a and b equal? " + a.equals(b));
        
        //finds the indexes of the elements in array list b
        System.out.println("The index of object d: " + b.indexOf('d'));
        System.out.println("The index of object c: " + b.indexOf('c'));
        System.out.println("The index of object f: " + b.indexOf('f'));

        //create a new instance of the class ArrayList
        ArrayList c = new ArrayList();
        //insert element at the given indexes
        c.insert('d', 0); 
        c.insert('e',0); 
        c.insert('f',1);  
        
        //calls toString to print elements
        System.out.println("Insert c: " + c.toString());
        
        //calls equals method to check if a and b are equal
        System.out.println("Are b and c equal? " + b.equals(c));
    }
    
    /**
     * Method queueTests tests: enqueue, dequeue, size, isEmpty, equals
     *
     */
    private static void queueTests() {
        //todo: make more tests here

        //create a new instance of the class Queue
        Queue a = new Queue();

        a.enqueue('g'); //insert 'g'
        a.enqueue('h'); //insert 'h'
        a.enqueue('i'); //insert 'i'
        //a.enqueue(null); //insert null
        //print statement
        System.out.println("Queue Tests: FIFO");
        //calls toString to print elemets
        System.out.println("Enqueue a: " + a.toString());
        //calls isEmpty
        System.out.println("Is a empty?: " + a.isEmpty());
        //call size method
        System.out.println("The size of the queue a is: " + a.size());

        //while there are elements in the stack
        while(a.isEmpty() == false) {
            //remove the first one in the queue and print it
            System.out.println(a.dequeue() + " has been removed");
        }
        //calls toString to print elemets
        System.out.println("Dequeued a: " + a.toString());
        //calls isEmpty
        System.out.println("Is a empty?: " + a.isEmpty());
        //call size method
        System.out.println("The size of the queue a is: " + a.size());
        
        
        //create a new instance of the class Queue
        Queue b = new Queue();
        b.enqueue('g'); //insert 'g'
        b.enqueue('h'); //insert 'h'
        b.enqueue('i'); //insert 'i'
        //calls toString method to print elements
        System.out.println("Enqueue b: " + b.toString());

        //create a new instance of the class Queue
        Queue c = new Queue();
        c.enqueue('g'); //insert 'g'
        c.enqueue('h'); //insert 'h'
        c.enqueue('i'); //insert 'i'
        
        //calls toString method to print elements
        System.out.println("Enqueue c: " + c.toString());
        //call size method
        System.out.println("The size of the stack c is: " + c.size());
        //equals method
        System.out.println("Does queue b equal to queue c? " + b.equals(c) );
        
        
        //equals method
        System.out.println("Does queue a equal to queue c? " + a.equals(c) );
        System.out.println();
    }

    /**
     * Method stackTests tests: push, pop, size, isEmpty, equals
     *
     */
    private static void stackTests() {
        //todo: make more tests here
        Stack a = new Stack();

        a.push('f'); //push 'p' to stack b
        a.push('m'); //push 'q' to stack b
        a.push('l'); //push 'r' to stack b
        //a.push(null); //push null to stack b
        
        //print statement
        System.out.println("Stack Tests: LIFO");
        //calls toString method
        System.out.println("Push a: " + a.toString());
        //calls isEmpty
        System.out.println("Is a empty?: " + a.isEmpty());
        //call size method
        System.out.println("The size of the stack a is: " + a.size());

        //while there are elements in the stack
        while(a.isEmpty() == false) {
            //pop the last element of the stack and then print it
            System.out.println(a.pop() + " has been removed");
        }
        //calls toString method
        System.out.println("Pop a: " + a.toString());
        //calls isEmpty
        System.out.println("Is a empty?: " + a.isEmpty());
        //call size method
        System.out.println("The size of the stack a is: " + a.size());

        Stack b = new Stack();
        b.push('s'); //add 's' to stack b
        b.push('t'); //add 't' to stack b
        b.push('u'); //add 'u' to stack b
        b.push('v'); //add 'v' to stack b

        //print elements of stack b by calling toString method
        System.out.println("Push elements of b:" + b.toString()); 
        //call size method
        System.out.println("The size of the stack b is: " + b.size());

        
        //while there are elements in the stack
        while(b.isEmpty() == false) { 
            //pop the last element of the stack and then print it
            System.out.println(b.pop() + " has been removed"); 
        }
        //calls toString method
        System.out.println("Pop b:" + b.toString());
        //calls isEmpty
        System.out.println("Is b empty?: " + b.isEmpty());
        //equals method checks if a and b is equal
        System.out.println("Does queue a equal to queue b? " + a.equals(b) );

        Stack c = new Stack();
        c.push('s'); //add 's' to stack c
        c.push('t'); //add 't' to stack c
        c.push('u'); //add 'u' to stack c
        c.push('v'); //add 'v' to stack c
        
        //print elements of stack c by calling toString method
        System.out.println("Push c:" + c.toString()); 
        
        Stack d = new Stack();
        d.push('s'); //add 's' to stack c
        d.push('t'); //add 't' to stack c
        d.push('u'); //add 'u' to stack c
        d.push('v'); //add 'v' to stack c
        
        //print elements of stack c by calling toString method
        System.out.println("Push d:" + d.toString()); 
        
        //equals method checks if c and d are equal
        System.out.println("Does queue c equal to queue d? " + c.equals(d) );
        
        System.out.println();
    }
}