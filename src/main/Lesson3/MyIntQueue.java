package Lesson3;

public class MyIntQueue {
    private int[] queue;
    private int size;
    private int front;          //маркер начала очереди
    private int rear;           //маркер конца очереди
    private int item;           //кол-во элементов в очереди

    public MyIntQueue(int i) {
        this.size = i;
        this.queue = new int[size];
        this.front = 0;
        this.rear = -1;
        this.item = 0;
    }

    public boolean isEmpty() {
        return (item == 0);
    }

    public boolean isFull() {
        return (item == size);
    }

    public int size() {
        return item;
    }

    public void insert(int i) {
        if (rear == size - 1) {
            rear = -1;
        }
        queue[++rear] = i;
        item++;
    }

    public int remove() {
        int temp = queue[front++];
        if (front == size)
            front = 0;
        return temp;
    }

    public int peek() {
        return queue[front];
    }
}
