/**
 * Write a description of class Queue here.
 *
 * @author Nikita Patel
 * @version 1
 */
//create a class called Queue
public class Queue{
    //create an object array named theQueueArray
    private Object [] theQueue;
    //3 int variables: front, rear, size
    //private int front;
    //private int rear;
    //private int numElement variable to keep track of the number of elements the queue has
    private int numElements;

    /**
     * Queue Constructor
     *
     */
    public Queue(){
        // intialize the length to 1000
        this.theQueue = new Object[1000];
        // set front to 0
        //this.front = 0;
        // set rear to 0
        //this.rear = 0;
        // set size to 0
        this.numElements = 0;
    }

    /**
     * Method enqueue- will add an object to the array of Objects in the index after 
     * the last object element. The parameter input should not be null and 
     * has to be an instanceof the class Queue
     *
     * @param obj A parameter
     */
    public void enqueue (Object obj) {
        //checks if object parameter is not null
        if (obj != null){ 
            //check if numElements is less than the length of the array
            if (numElements < this.theQueue.length){ 
                // if it is then add the object to the array
                this.theQueue[numElements++] = obj; 
            } 
            //otherwise 
            else { 
                //set the queue to the new array
                this.theQueue = resize(); 
                //and set the index of the new numElements to the object
                this.theQueue[numElements] = obj; 

            }
        } 
        //otherwise 
        else { 
            //print error message and exit the program
            System.err.println("Error! Invalid parameter"); 
            System.exit(-1);
        }
    }

    /**
     * Method resize- this method resizes the array if the enqueue mehtod 
     * runs out of space in the queue
     *
     * @return The return value
     */
    public Object[] resize(){
        //create a new temporary array set to the length of how every many numElements there are
        Object [] tempQueue = new Object[numElements];
        
        //iterate over the array
        for (int i = 0; i < this.theQueue.length; i++){
            //set the index of temp array to the old array
            tempQueue[i] = this.theQueue[i];
        }
        
        //return temperorary array
        return tempQueue;
    }

    /**
     * Method dequeue- will remove the first element of the array and shift everything to
     * the left so that the is no empty space and returns the object that has been removed 
     * from the queue
     *
     * @return The return value
     */
    public Object dequeue(){
        //check if size is equal to 0
        if(this.numElements == 0){
            //return null
            return null;
        }
        //set object obj to index 0 of theQueueArray
        Object obj = theQueue[0];
        //loop through
        for(int i = 1; i < this.numElements;i++){
            //set the index i-1 of theQueueArray to i
            this.theQueue[i-1] = this.theQueue[i];
        }
        //decrement size
        this.numElements--;
        //return obj
        return obj;
    }

    /**
     * Method size- will return the number of elements in the queue
     *
     * @return The return value
     */
    public int size() {
        //return numElements
        return this.numElements;
    }

    /**
     * Method isEmpty- checks if the queue is empty. Returns true if it is and false if it 
     * is not empty
     *
     * @return The return value
     */
    public boolean isEmpty(){
        //iterate over array
        for(int i = 0; i < numElements; i++){ 
            //check if the eleemnt is not null
            if (theQueue[i] != null){ 
                //return false, it's not empty
                return false; 
            }       
        }
        //else return true if it is empty
        return true; 
    }

    /**
     * Method equals- compares the Queue obejcts to see if they are equal
     *
     * @param obj A parameter
     * @return The return value
     */
    public boolean equals(Queue obj){
        //stackObject is set to obj of Queue class
        Queue stackObject = (Queue) obj;
        
        // check if size is not size of stackObject
        if (size() != stackObject.size()){
            //retrun false
            return false;
        }
        
        //loop through
        for(int i = 0; i < this.numElements; i++){
            //check if indexes are not the equaled to each other
            if(!this.theQueue[i].equals(stackObject.theQueue[i])){
                //return false
                return false;
            }
        }
        
        //return true
        return true;
    }

    /**
     * Method toString
     *
     * @return The return value
     */
    public String toString(){
        //declares String str set to [
        String str = "["; 
        
        //iterate over array
        for (int i = 0; i < numElements; i++){ 
            //add elements to the string 
            str = str + "  " + theQueue[i]; 
        }
        
        //return String and ]
        return str + "  ]"; 
    }
}
