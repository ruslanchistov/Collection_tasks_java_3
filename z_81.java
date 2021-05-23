//Дано число N (> 0) и набор из N чисел. Отсортировать значения в стеке по возрастанию.

package zadachnic_2.zadachi_79_81;

import java.util.Scanner;

public class z_81 {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов стека: ");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        Stack_79_81 S_1 = new Stack_79_81();
        S_1.setStack(count);
        S_1.getStack();
        System.out.println();
        S_1.sortStack();
        S_1.getStack();
    }
}
