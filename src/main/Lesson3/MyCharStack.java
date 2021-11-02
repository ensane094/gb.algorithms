package Lesson3;

public class MyCharStack {
    private char [] stack;
    private int top;
    private int size;

    public MyCharStack( int size) {
        this.size = size;
        this.stack = new char[this.size];
        this.top = -1;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public boolean isFull (){
        return this.top == size-1;
    }

    public char push (char i){                    //добавить элемент
        return this.stack[++this.top]=i;
    }

    public char pop (){
        return this.stack[this.top--];
    }

    public char peek(){
        return this.stack[this.top];
    }
}
