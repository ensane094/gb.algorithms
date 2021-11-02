package Lesson3;

public class MyIntDeque {
    private int[] deQue;
    private int size;
    private int head;          //маркер начала очереди
    private int tail;           //маркер конца очереди
    private int items;           //кол-во элементов в очереди

    public MyIntDeque(int size) {
        this.size = size;
        this.deQue = new int[size];
        this.head = 0;
        this.tail = this.size - 1;
        this.items = 0;
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

    public void insertRight(int i) {
        if (isFull()) {                                //если массив заполнен - удаляем правый элемент
            removeRight();
        }
        if (tail < 0) {                                //если хвост меньше нуля - ставим его в конец массива
            tail = size - 1;
        }
        tail--;                          //если хвост в конце то сдвигаем его влево и
        deQue[tail + 1] = i;                //на освободившийся индекс вставляем значение
        items++;
    }

    public void insertLeft(int i) {
        if (isFull()) {                                         //если массив заполнен - удаляем левый элемент
            removeLeft();
        }
        if (head > size - 1) {                                  //если голова больше последнего индекса- становится нулевым
            head = 0;
        }
        head++;                               //если голова на нулевом индексе, она становится на первый и
        deQue[head - 1] = i;                  //освободившийся индекс заполняется значением
        items++;
    }

    /* public int removeRight() {              //если честно, я не совсем понимаю как он работает.
         int temp = deQue[tail--];             //всё что я вижу это items-- ну и смещение хвоста если надо
         if (tail < 0) {
             tail = size - 1;
         }
         items--;
         return temp;
     }*/

    public int removeRight() {              //как я понимаю, флаг надо просто сместить
        int temp = deQue[tail--];
        if (tail < 0) {
            tail = size - 1;
        }
        deQue[tail] = 0;                   //в хвосте устанавливаем нулевое значение
        items--;
        return temp;
    }

    public int removeLeft() {
        int temp = deQue[head++];
        if (head > size - 1) {
            head = 0;
        }
        deQue[head] = 0;
        items--;
        return temp;
    }

    public int peekRight() {
        return deQue[head];
    }

    public int peekLeft() {
        return deQue[tail];
    }
}
