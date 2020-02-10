package model.data_structures;

public class Node<T> implements INode<T>
{
    //data saved in the node
    private T data;

    //pointer to the next node
    private Node<T> next;

    //constructor of the node
    public Node(T data)
    {
        this.data = data;
    }

    //returns the next node in the stack
    public Node<T> getNext()
    {
        return next;
    }

    //set the node in the parameter as the next in the list
    public void setNext(Node<T> node)
    {
        next = node;
    }

    //returns the data that was saved
    public T getData()
    {
        return data;
    }
}