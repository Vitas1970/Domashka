//First level: Level1:
//Считывается 2 числа, произвести все арифм. операции с ними
//        (поделить, умножить, сложить, вычесть)
//
//
//Level2:
//С консоли вводится трехзначное число.
//Найдите в нем первую, вторую и третью цифры.
//Используйте при этом / и (или) %

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double one = scanner.nextDouble();
//        double two = scanner.nextDouble();
//        System.out.println(one + two);
//        System.out.println(one - two);
//        System.out.println(one * two);
//        System.out.println(one / two);
        int i = scanner.nextInt();
        System.out.println(i / 100);
        System.out.println(i % 100 / 10);
        System.out.println(i % 10);
    }
}
