//First level: Level1: Астерикс и Обеликс варили зелье.
//Зелье будет сварено правильно, если его будут варить больше 5 часов.
// Астерикс варил его 3 часа, Обеликс в два раза меньше.
// Получится ли у них сварить зелье? true - если получится, иначе false
//
//
//Level2: Вводится число. Если оно четное, то выведите true, иначе false

public class HW4 {
    public static void main(String[] args) {
        int readyTime = 5;
        int asterixTime = 3;
        double obelixTime = asterixTime / 2;
        boolean potionReady = asterixTime + obelixTime > readyTime;

        System.out.println("Zelie Gotovo - " + potionReady);

        double digit = 110;
        double ostatok = digit % 2;
        boolean odd = ostatok == 0;
        boolean even = ostatok != 0; //even nechetnoe  odd - chetnoe
        System.out.println("Четное ли число - " + odd);
        System.out.println("Нечетное и число - " + even);

//        second(odd,even);
    }

//    public static void second(boolean odd,boolean even) {
//        System.out.println("Четное ли число - " + odd);
//        System.out.println("Нечетное и число - " + even);
//    }
}