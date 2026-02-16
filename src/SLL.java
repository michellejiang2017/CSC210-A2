import org.w3c.dom.Node;

/**
 * Class to implement a singly linked list
 *
 * @author Michelle Jiang
 * @version Spring 2026
 */


class SLL<T> implements ListADT<T> {

    public NodeSL<T> head; 
    public int size; 

    public SLL() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Queries number of elements in list. If empty, returns zero. 
     * @return size of list. 
     */
    public int size() { 
        return this.size; 
    }

    /**
     * Accesses element at a given index. 
     * @param index the index to query
     * @throws IndexOutOfBoundsException if the index is less than 0 or greater than or equal to the size of the list
     * @return value at specified index
     */
    public T get(int index) { 
        return this.getNode(index).getData(); 
    }

    /**
     * Sets the value at the given index
     * @param index the index whose value is changed
     * @param value the value to change the index to 
     * @return the item that was previously at this position
     * @throws IndexOutOfBoundsException if the index is less than 0 or greater than or equal to the size of the list
     */
    public T set(int index, T value) {
        T prevValue = this.get(index);
        NodeSL<T> node = this.getNode(index);
        node.setData(value);
        return prevValue; 
    }

    /**
     * Adds element to existing list. Note: If the element type isn't the same as the list type, the code will not compile. 
     * @param index of where the new element should be added
     * @param value the element to be added to the ListADT object
     * @throws IndexOutOfBoundsException if the index is less than 0 or greater than or equal to the size of the list
     */
    public void add(int index, T value) { 
        NodeSL<T> prevNode = this.getNode(index-1); 
        NodeSL<T> nextNode = this.getNode(index+1);
        if (nextNode == null) {
            NodeSL<T> newNode = new NodeSL<T>(value, null);
            prevNode.setNext(newNode);
        } else {
            NodeSL<T> newNode = new NodeSL<T>(value, nextNode);
            prevNode.setNext(newNode);
        }
        this.size++;
    }

    /**
     * Removes item from list at given index. 
     * @param index the index to query
     * @throws IndexOutOfBoundsException if the index is less than 0 or greater than or equal to the size of the list
     * @return the element at the index specified
     */
    public T remove(int index) {
        NodeSL<T> prevNode = this.getNode(index-1); 
        NodeSL<T> nextNode = this.getNode(index+1);
        prevNode.setNext(nextNode);
        return this.get(index);
    }

    /**
     * Converts the Linked List to a string.
     * @return Linked List in String type
     */
    public String toString() {
        String returnString = "["; 
        if (this.head == null) {
            returnString += "]"; 
            return returnString;
        }
        NodeSL<T> item;
        for ( item = this.head; item.getNext() != null; item = item.getNext()) {
            returnString += item.getData() + ", ";
        }
        returnString += item.getData() + "]";
        return returnString;
    }
    
    /**
     * Tests if a list is empty or not. 
     * @return true if empty, false if has elements
     */
    public boolean isEmpty() { 
        if (this.size() == 0) { 
            return true; 
        }
        return false; 
    }

    /**
     * Helper method to get the node at a given index.
     * @param index the index to query
     * @throws IndexOutOfBoundsException if the index is less than 0 or greater than or equal to the size of the list
     * @return the node at the index specified
     */
    public NodeSL<T> getNode(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        NodeSL<T> currentNode = this.head;
        for (int i=0; i<index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public void addFirst(T value) { 
        
    }
}