package model.data_structures;

public class Stack<T> implements IStack<T>
{
    //pointer to the top of the stack
    private Node<T> top;

    //saves the size of the stack
    private int size;

    //constructor of the stack
    public Stack()
    {
        //initialize stack in 0 elements and top in null
        size = 0;
        top = null;
    }

    //push an element to the stack
    public void push(T data)
    {
        //creates a node and adds it to the top of the stack
        Node<T> node = new Node<T>(data);
        node.setNext(top);
        top = node;

        //increments the size by 1
        size++;
    }

    //pop the last saved data from the stack and then 
    public T pop()
    {
        //get the data from the stack before deliting it
        T data = top.getData();
        //delites the top from the stack and sets a new top
        top = top.getNext();
        //reduces the size by 1
        size--;

        //return data
        return data;
    }

    //returns the size of the stack
    public int getSize()
    {
        return size;
    }

    //gets the top element of the stack
    public T top()
    {
        return top.getData();
    }

    //return true if the stack is empty false if it has something
    public boolean isEmpty()
    {
        //if the stack is empty, ther top should be null
        return top == null;
    }
}