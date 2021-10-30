package Lesson2;

import java.lang.module.FindException;
import java.util.Arrays;

public class ArrayListHW<T extends Comparable<T>> {
    private final int DEFAULT_CAP = 15;
    private int size;
    private T[] list;

    public ArrayListHW(int capacity) {

        list = (T[]) new Comparable[capacity];
    }

    public ArrayListHW() {
        list = (T[]) new Comparable[DEFAULT_CAP];
    }

    //методы управления массивом

    public void add(T item) {
        list[size] = item;
        size++;
    }

    public void add(int index, T item) {
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        size++;
    }

    public T get(int index) {
        return list[index];
    }

    public final T delete(int index) {
        T temporary = list[index];
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
        size--;
        return temporary;
    }

    public boolean delete(T item) {
        int pos = index(item);
        if (pos < 0) {
            return false;
        }
        delete(pos);
        return true;
    }

    public void set(int index, T item) {
        list[index] = item;
    }

    public int indexOf(T item) {
        return index(item);
    }

    private int index(T item) {
        if (item == null) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (item.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }

    public int site() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(list, size));
    }

    private boolean less(T item1, T item2) {
        return item1.compareTo(item2) < 0;
    }

    private void swap(int index1, int index2) {
        T temporary = list[index1];
        list[index1] = list[index2];
        list[index2] = temporary;
    }

    //Методы сортировки

    //Метод выборочной сортировки
    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int minimum = i;                                //устанавливаем условно минимальное значение
            for (int j = i; j < size; j++) {                //прогоняем элементы и сравниваем
                if (less(list[j], list[minimum])) {         //если элемент J меньше элемента с минимальным значением
                    minimum = j;                            //то присваиваемм минимуму новое значение
                }
                swap(i, minimum);                           //меняем их местами
            }
        }
    }

    //Метод сортировки вставками не меняет местами два элемента, а вставляет прям в нужное местоо

    public void insertionSort() {
        T key;                                               //переменная в которой храним значение проверяемого элемента
        for (int i = 1; i < size; i++) {
            int j = i;
            key = list[i];                                   //помещаем проверяемый элемент
            while (j > 0 && less(key, list[j - 1])) {        //пока i(j) больше нуля и значение в ключе (i) меньше чем
                list[j] = list[j - 1];                       //значение элемента до него
                j--;                                         //перебираем элементы до нуженого нам места
                                                             //пока условие не будет верным
            }
            list[j] = key;                                   //нашли и поставили
        }
    }

    //Метод пузырьковой сортировки сравнивает два рядом стоящих элемента и меняет их местами

    public void bubbleSort() {
        for (int i = size - 1; i > 0; i--) {                //прогоняем элементы массива
            for (int j = 0; j < i; j++) {
                if (less(list[j + 1], list[j])) {           //если элемент j+1 больше элемента j то меняем их местами
                    swap(j + 1, j);
                }
            }
        }
    }

    //Улучшенный метод пузырьковой сортировки сортировки

    public void enhancedBubbleSort() {
        boolean isSwap;
        for (int i = size - 1; i > 0; i--) {
            isSwap = false;
            for (int j = 0; j < i; j++) {
                if (less(list[j + 1], list[j])) {
                    swap(j + 1, j);
                    isSwap = true;
                }
            }

            if (!isSwap) {                                  //предотвращает лишние циклы
                break;
            }
        }
    }
}
