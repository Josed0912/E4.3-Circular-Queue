public interface Queueable
{
    void enqueue(int element);

    int dequeue();

    int front();

    boolean isEmpty();

    boolean isFull();

    int peek();
}
