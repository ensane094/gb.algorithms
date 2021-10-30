package Lesson2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int size = 100_000;
        ArrayListHW<Integer> listHW =new ArrayListHW<>(size);
        for (int i = 0; i < size; i++) {
            listHW.add(random.nextInt(1000));
        }
        //listHW.selectionSort();     // 1:28
        //listHW.insertionSort();       // 0:25
        listHW.enhancedBubbleSort();    // 1:47
        System.out.println(listHW);
    }
}
