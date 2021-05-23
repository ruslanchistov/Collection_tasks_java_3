//Создать стек из вещественных чисел. Определить максимальный элемент в стеке.
//Организовать просмотр данных стека.

        package zadachnic_2;

import java.util.Random;
import java.util.Stack;
public class z_84 {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            Double num = Math.ceil((-10+rnd.nextDouble()*30)*100)/100;
            stack.push(num);
        }
        Double max = stack.peek();
        for (int i = 0; i < stack.size(); i++) {
            if(stack.get(i)>max)max=stack.get(i);
        }
        System.out.println("max element: "+max);
        for (Double item:stack) System.out.print(item+"  ");
    }


}
