package Lesson3;

/**
 *   Извиняюсь за такое большое количество коммитов, сложно всё это...
 *   Наверное я погорячился после первого уровня java к вам записываться.
 *   К тому же я сейчас переезжаю в другую страну и очень много забот из-за которых откладывается учёба...
 *   Я стараюсь сдавать их более менее вовремя но далеко не всегда, к сожалению, это получается.
 */

public class Main {
    public static void main(String[] args) {
        MyIntDeque dk = new MyIntDeque(5);
        dk.insertRight(3);
        dk.insertRight(4);
        dk.insertRight(5);
        dk.insertLeft(2);
        dk.insertLeft(1);
        System.out.println(dk.peekRight());
        System.out.println(dk.peekLeft());
    }
}
