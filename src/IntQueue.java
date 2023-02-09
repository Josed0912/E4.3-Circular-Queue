import java.util.Queue;

public class IntQueue implements Queueable
{
    private int[] queue;
    private int rear;
    private int front;
    private final int QUEUE_CAPACITY = 10;

    public IntQueue()
    {
        this.rear = -1;
        this.queue = new int[QUEUE_CAPACITY];
    }
    public IntQueue(int capacity)
    {
        this.rear = -1;
        this.front = -1;
        this.queue = new int[capacity];
    }

    public void enqueue(int element)
    {
        if (!isFull()){
            rear = (rear + 1) % queue.length;
            queue[rear] = element;
        }
        else{
            throw new QueueOverflowException("The queue is full");
        }
    }

    public int dequeue()
    {
        if(!isEmpty())
        {
            front = (front + 1) % queue.length;
            int value = queue[front];
            return value;
        }
        else
        {
            throw new QueueUnderflowException("The queue is empty.");
        }
    }

    public int front(){
        if (!isEmpty()){
            return queue[front];
        }
        else
        {
            throw new QueueUnderflowException("The queue is empty");
        }
    }

    public boolean isEmpty()
    {
        return (rear + 1)% queue.length == front;
    }

    public boolean isFull(){
        return rear == front;
    }

    public int peek(){
        return front();
    }

    @Override

    public String toString(){
        return "";
    }

}
