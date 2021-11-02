package Lesson3;

public class MyIntDeque {
    private int[] deQue;
    private int size;
    private int front;          //маркер начала очереди
    private int rear;           //маркер конца очереди
    private int items;           //кол-во элементов в очереди
    private int leftPointer;
    private int rightPointer;

    public MyIntDeque(int size) {
        this.size = size;
        this.deQue = new int[size];
        this.front = 0;
        this.rear = -1;
        this.items = 0;
        this.leftPointer = this.front - 1;
        this.rightPointer = this.rear + 1;
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public boolean isFull() {
        return (items == size);
    }

    public int size() {
        return items;
    }


    public void insertLeft(int i) {
        if (rightPointer==rear) {
            front = 1;
        }
        deQue[--front] = i;
        items++;
    }

    public void insertRight(int i) {
        if (leftPointer == size) {
            rear = -1;
        }
        deQue[++rear] = i;
        items++;
    }

    public int remove() {
        int temp = deQue[front++];
        if (front == size)
            front = 0;
        return temp;
    }

    public int peek() {
        return deQue[front];
    }

}
