package Lesson3;

public class MyIntStack {
    private int [] stack;
    private int top;
    private int size;

    public MyIntStack( int size) {
        this.size = size;
        this.stack = new int [this.size];
        this.top = -1;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public boolean isFull (){
        return this.top == size-1;
    }

    public int push (int i){                    //добавить элемент
        return this.stack[++this.top]=i;
    }

    public int pop (){
        return this.stack[this.top--];
    }

    public int peek(){
        return this.stack[this.top];
    }
}
