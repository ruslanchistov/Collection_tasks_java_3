//Создать стек из целых чисел. Вычислить произведение нечѐтных значений элементов
//стека. Организовать просмотр данных стека.

        package zadachnic_2.zadachi_79_81;

import java.util.Scanner;

public class z_79 {
        public static void main(String[] args) {
                System.out.print("Введите количество элементов стека: ");
                Scanner in = new Scanner(System.in);
                int count = in.nextInt();
                Stack_79_81 S_1 = new Stack_79_81();
                S_1.setStack(count);
                S_1.getStack();
                System.out.println();
                S_1.productEven();
        }
}
