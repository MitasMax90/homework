public class Loader {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("Я выполнился, Братик!");
            System.out.println("Я выполнился второй раз)!");
        } while (i < 1) ;
        i--;

        System.out.println("Value i = " + i);
    }
}
/* Используя цикл do...while, напишите программу, которая уменьшает значение i до тех пор, пока оно больше 1.

В программе должна выполнится хотя бы одна итерация.*/