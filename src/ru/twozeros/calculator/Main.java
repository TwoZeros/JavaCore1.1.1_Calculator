package ru.twozeros.calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); // 3 / 0
        // Исключение возникает при деление на ноль
        // Для того чтобы обойти ошибку в devide реализована проверка b на 0.
        // Если b != 0, то devide выполняет деление a на b, иначе (если b == 0 ) просто возвращает 0.

        calc.println.accept(c);
    }
}
