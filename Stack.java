/**
 * Write a description of class Stack here.
 *
 * @author Nikita Patel
 * @version 1
 */
//create a class called Stack
public class Stack{
    //create a Object array called theStackArray
    private Object[] theStackArray;
    //instance variable top
    private int top;

    /**
     * Stack Constructor
     *
     */
    public Stack(){
        //stack is set to be the length 1000
        this.theStackArray = new Object[1000];
        //to is set to 0
        this.top = 0;
    }

    /**
     * Method push- this medthod will add the object to the stack after the elements before it 
     *
     * @param obj A parameter
     */
    public void push(Object obj){
        //check if obj is not null
        if (obj != null){ 
            //check if top is 1000
            if (top == 1000){
                //print Stack is full
                System.out.println("Stack is full");
            }
            else{
                //the top of theStack is set to obj
                this.theStackArray[top] = obj;
                //increment top
                top++;
            }
        }
        else{
            //print error message and exit the program
            System.err.println("Error! Invalid parameter"); 
            System.exit(-1);
        }
    }

    /**
     * Method pop- this method will remove the last element of the arrat and return it
     *
     * @return The return value
     */
    public Object pop(){
        Object obj = null;
        //check if stack is empty
        if (isEmpty()){
            //orint stack is empty
            System.out.println("Stack is Empty");
        }
        else{
            //else decrement top
            top--;
            //obj is set to index top of the stack array
            obj = this.theStackArray[top];
        }
        //return obj
        return obj;
    }

    /**
     * Method size- return the size of the stack
     *
     * @return The return value
     */
    public int size(){
        //return top
        return this.top;
    }

    /**
     * Method toString- will format and return the elements in the stacks
     *
     * @return The return value
     */
    public String toString(){
        //String str is set to [
        String str = "[";
        //loop through
        for(int i=0; i < this.top; i++){
            //set str to str and index i of theStackArray
            str = str + "  " + this.theStackArray[i];
        }
        //return str and ]
        return str + "  ]";
    }

    /**
     * Method isEmpty- the method will return true if the stack is empty adn false if it is not empty
     *
     * @return The return value
     */
    public boolean isEmpty(){
        //check is size is equal to 0
        if (size() == 0) {
            //return true
            return true;
        }
        else{
            //else, return false
            return false;
        }
    }

    /**
     * Method equals- checks if the Sack objects are equal 
     *
     * @param obj A parameter
     * @return The return value
     */
    public boolean equals(Stack obj){
        //check if the input is not null and is an instance of Stack 
        if (obj != null && obj instanceof Stack == true){            
            //casting to object
            Stack stackObject = (Stack) obj; 

            //check if the size is equal to size of the stackObject size
            if (this.size() == (stackObject.size())){ 
                //iterate of the array
                for (int i = 0; i <= size(); i++){
                    //check if the element sare the same
                    if (this.theStackArray[i] != stackObject.theStackArray[i]){ 
                        //return false
                        return false; 
                    } 
                    //otherwise
                    else { 
                        //return true
                        return true; 
                    }
                }
            }
        }
        //return true;
        return true;
    }
}

