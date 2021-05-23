//Создать очередь из вещественных чисел. Определить количество положительных значений
//элементов очереди. Организовать просмотр данных очереди.

        package zadachnic_2.zadacha_80;

import zadachnic_2.zadacha_80.Queue_80;

import java.util.Scanner;

public class z_80 {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов очереди: ");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        Queue_80 Q_1 = new Queue_80();
        Q_1.setQueue(count);
        Q_1.getQueue();
        System.out.println();
        Q_1.searchPositiveElem();
    }
}
