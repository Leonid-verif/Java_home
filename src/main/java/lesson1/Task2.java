package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for
*/

public class Task2 {

    public static void main(String[] args) {
//        String s = "Vladimir";
//        System.out.println(
//                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
//                        + s);
//        System.out.println(
//                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
//                        + s);
//        System.out.println(
//                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
//                        + s);
//        System.out.println(
//                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
//                        + s);
//        System.out.println(
//                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
//                        + s);
//    }


        for (var s = 1; s <= 5; s = s + 1) {
           for (var b = 1; b <= 10; b = b + 1)
               System.out.print("Leonid" + " ");
               System.out.print("\n");

            }

        }
    }
