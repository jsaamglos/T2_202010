package model.data_structures;

//node interface
public interface INode<T>
{
    //get the next element in the stack
    public Node<T> getNext();

    //set the node in the parameters as the next node in the list
    public void setNext(Node<T> node);

    //returns the element saved in the node
    public T getData();
}