package zadachnic_2;

import java.util.Scanner;

public class Stack <T>{
   /* private Unit head;
    private int counter=0;
    private class Unit<T>{
        private T parameter;
        private Unit next;
    }

    }
    public void addStack(){
        if(this.head==null){
            System.out.println("Стека не существует !!!");
            return;
        }
        Unit current = this.head;
        this.head = new Unit();
        this.counter++;
        System.out.print("Введите элемент для добавления в стек: ");
        Scanner in = new Scanner(System.in);
        this.head.data = in.next();
        this.head.next=current;

    }
    public void getStack(){
        if(this.head==null) {
            System.out.println("Стека не существует !!!");
            return;
        }
        System.out.print("Сколько элементов хотите достать из стека: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n>this.counter){
            System.out.println("Запрашиваемое количество больше существующего!!!");
            System.out.print("Сколько элементов хотите достать из стека: ");
            n = in.nextInt();
        }
        Unit cur = this.head;
        while (n>0){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }*/
}
