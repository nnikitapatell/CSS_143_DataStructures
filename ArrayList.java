/**
 * Write a description of class ArrayList here.
 *
 * @author Nikita Patel
 * @version 1
 */

//create a class called ArrayList
public class ArrayList{
    //create a private array called arrayList of Objects
    private Object[] arrayList;
    //private variable to keep track of the number of elements
    private int numElements;

    /**
     * Constructor for objects of class ArrayList
     */
    public ArrayList(){
        //initialize the length of the array to 100
        this.arrayList = new Object[100];
        //initialize the size to 0
        this.numElements = 0;
    }

    /**
     * Method insert- The insert method will insert an object element to a specific index
     * and move the rest of the object array elements to the right to make space for that
     * element at that specific index.
     *
     * @param obj A parameter
     * @param index A parameter
     */
    public void insert(Object obj, int index){
        //store the object parameter in a new object variable
        Object newVal = obj; 
        //check if the index is negative or object is null
        if (index < 0 || obj == null) { 
            //print error message and exit
            System.err.println("Error. Invalid parameters.");
            System.exit(-1);
        }

        //check if the index is greater than the length of the array
        if (index > this.arrayList.length) { 
            //create a new object array that will be one larger in sizer
            Object [] tempArrayList = new Object[index+1]; 
            //iterate over arrayList
            for (int i = 0; i < this.arrayList.length; i++){ 
                //copy each element over
                tempArrayList[i] = arrayList[i]; 
            }
            //set the old arrayList to new arrayList
            this.arrayList = tempArrayList; 
            //set numElements to index
            this.numElements= index; 
            //iterate over the new array
            for (int i = 0; i < size(); i++){ 
                //shift the elements to the right starting at the index
                this.arrayList[i+1] = this.arrayList[i]; 
            }

            //set the index element of the arrayList to the Object parameter 
            this.arrayList[index] = newVal; 
            //increment numElements by 1 since we just added one Object to array
            this.numElements++; 
        }

        //check if the index is greater than numElements
        if (index > this.numElements){
            //set the index to the number of elements in the array
            this.numElements = index;

            for (int i = index; i < size(); i++){
                this.arrayList[i+1] = arrayList[i]; 
                //shift array elements, starting at index, to the right
            }
            this.arrayList[index] = newVal; //add the object at specified index
            this.numElements++; //increment numElements by 1 since we just added one Object to array
        }

        for (int i = index; i < this.numElements; i++){
            //shift array elements to the right from the starting index
            this.arrayList[i+1] = this.arrayList[i];             
        }
        //add the object at the index
        this.arrayList[index] = newVal; 
        //increment numElements by 1 because the array has one more Object element
        this.numElements++; 
    }   

    /**
     * Method remove- Removes and returns the object at the specified index.  
     * THe program will move the elements to the left until there is no empty space
     *
     * @param index A parameter
     * @return The return value
     */
    public Object remove(int index){
        //check if the index is negative or if the index of the array is null
        if (index < 0 || this.arrayList[index] == null){ 
            //print the message adn exit the program
            System.err.println("There is an Error in the program"); 
            System.exit(-1);
        }
        //store Object being removed into a retVal variable
        Object retVal = this.arrayList[index]; 

        //iterate over array
        for (int i = index; i < size()-1; i++){ 
            //shift the array elements to the left, starting one after the specified index
            arrayList[i] = this.arrayList[i+1];             
        }

        //clear out the last element
        this.arrayList[this.numElements] = null; 
        //reduce number of elements by one because we removed one Object from the arrayList
        this.numElements--; 

        //returns the removed Object from the arrayList
        return retVal; 
    }

    /**
     * Method size- is getter method for size of the arrayList
     *
     * @return The return value
     */
    public int size(){
        //return the number of elements
        return this.numElements;
    }

    /**
     * Method toString- formats  and prints out the elements in the arraylist
     *
     * @return The return value
     */
    public String toString(){
        //str is set to [
        String str = "[";
        //loop through, increment
        for (int i = 0; i < size(); i++){
            //print index i and str
            str = str + "  " +arrayList[i];
        }
        //return str and bracket
        return str + "  ]";
    }

    /**
     * Method isEmpty- checks if arraylist is empty. if it is it will return ture and otherwise 
     * it will return false
     *
     * @return The return value
     */
    public boolean isEmpty(){
        //check if size is equal to 0
        if(size() == 0) {
            //return true
            return true;
        }
        //else
        else {
            //retrun false
            return false;
        }
    }

    /**
     * Method indexOf- Returns -1 if not found and index number if found
     *
     * @param obj A parameter
     * @return The return value
     */
    public int indexOf(Object obj){       
        //loop through
        for(int i = 0; i < this.numElements ; i++){
            //check if index i of list equals to obj
            if(this.arrayList[i].equals(obj)){
                //return i
                return i;
            }
        }
        //return -1
        return -1;
    }

    /**
     * Method equals- Compare sizes and elements in the data structure. Return true if 
     * they are the same arrayLists if not then it return false
     *
     * @param obj A parameter
     * @return The return value
     */
    public boolean equals(Object obj){
        //ArrayList objList is set to obj of ArrayList
        ArrayList objList = (ArrayList) obj;
        //check if sixe is not equal to size of objList
        if(size() != objList.size()){
            //return false
            return false;
        }
        //loop through
        for(int i = 0; i < size(); i++) {
            //check if index i of list is not equal to index i of objList
            if (!arrayList[i].equals(objList.arrayList[i])) {
                //return false
                return false;
            }
        }
        //return true
        return true;
    }  

    /**
     * Method get- Returns the object at index specified
     *
     * @param index A parameter
     * @return The return value
     */
    public Object get(int index){
        //Object obj is set to null
        Object obj = null;
        //check if index is greater than or equal to size
        if(index >= size()){
            //set obj to index of list
            obj = arrayList[index];
        }
        //set obj to index of list
        obj = arrayList[index];
        //return obj
        return obj;
    }
}
