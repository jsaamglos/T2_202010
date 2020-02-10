package model.data_structures;

public interface IStack<T>
{
    //push a pice of data ontop of the stack
    public void push(T data);

    //pop a pice of data from the stack and returns it
    public T pop();

    //returns the size of the stack
    public int getSize();

    //return the top element
    public T top();

    //return if the stack is empty
    public boolean isEmpty();
}