package Lesson3;

public class Brackets {
    private String text = "()(({}[]";

    public Brackets(String text) {
        this.text = text;
    }

    public boolean check() {
        int size = text.length();
        MyCharStack stack = new MyCharStack(size);
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    System.out.println("Ошибка на позиции: " + i);
                    return false;
                }
                char after = stack.pop();
                if (ch == ')' && after != '(' ||
                        ch == '}' && after != '{' ||
                        ch == ']' && after != '[') {
                    System.out.println("Ошибка. В этом месте нет закрывающей скобки: " + i);
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Ошибка. Стэк пуст!");
            return false;
        }
        return true;
    }
}
