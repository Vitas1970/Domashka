import java.util.Scanner;

public class HomeWorck6 {
//    First level: level1
//    С консоли считывается число. Если это число равно 0
//    - тогда напишите на экран "ошибок не обнаружено",
//    если число не равно 0, тогда выведите три сообщения "ERROR"
//
//
//    Level2
//    Мартин играет в рулетку.
//    Он крутит ее два раза. Если в первый раз выпадет 36 И во второй выпадет 17,
//    то он выиграет джекпот.
//    Если в первый раз выпадет 36 ИЛИ во второй раз выпадет 17,
//    то он выиграет маленький приз. Если выпадет НЕ 36 И НЕ 17, то он все проиграет.

//    С консоли считывается два числа,
//    первое число - сколько выпало на рулетке первый раз, второе число -
//    сколько выпало второй раз. Напишите, что выиграет Марин

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        if (i == 0) {  //if uslovie zadachi
//            System.out.println("ошибок не обнаружено");
//        } else { // else v protivnom sluchae
//            System.out.println("error");
//            System.out.println("error");
//            System.out.println("error");
//        }


        ///  if (uslovie) {
        /// telo if cod esli ono sootvetsvuet true
        /// }
        System.out.println("Vedite pervoe chislo");
        Scanner scanner = new Scanner(System.in);
        int pervoe = scanner.nextInt();
        System.out.println("Vedite vtoroe chislo");
        int vtoroe = scanner.nextInt();
        if (pervoe == 36 && vtoroe == 17) {
            System.out.println("Djecpot");
        } else if (pervoe == 36 || vtoroe == 17) {
            System.out.println("Malenkiy pris");
        } else{
            System.out.println("Vi vse proigrali");

        }
    }
}