
public class QueueAsMyLinkedList<E>
{   
	private MyLinkedList<E> theQueue;  // list header
	
	
    public QueueAsMyLinkedList()
    {  theQueue = new MyLinkedList<E>();       
    }
	
    public void enqueue(E newElement) //insert at tail
    {  
		   theQueue.append(newElement);
    }
	
	public  E dequeue() //remove from head
    {  
		E temp = null;
		boolean isDone = false;
		
		temp = theQueue.getFirst();
		if (temp != null)
		{
			isDone=theQueue.delete(temp);
		}
		if (isDone)
			return temp;
		else
			return null;
    }
	public String toString()
	{
		return theQueue.toString();
	}
	public QueueAsMyLinkedList<E> reverseOrder(QueueAsMyLinkedList q){
		//How does my program work?
		E e; //I use a generic object to store the 'previous' data entry
		if(theQueue.getFirst()==null){//first operation is to simply find if the queue is empty and return it if it is
			return q;
		}
		else{//otherwise the operation will continue
			e = theQueue.getFirst(); //generic ojbect is the same as the first value of the queue
			q.dequeue(); //dequeue the head as it is currently stored and is no longer needed for the operation
			q = reverseOrder(q); //this is where the regression starts, the program will call this method n-1 times where n is equal to the amount of objects in the queue.
			q.enqueue(e);//this step is also called n-1 times and will only start executing when the regression ends (when the tail of the queue is found)
		}
		return q;
	}
   
}//end class 

