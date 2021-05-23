package zadachnic_2.zadachi_79_81;

import java.util.Random;

public class Stack_79_81 {
    private Block head = null;

    public class Block{ //элементы стека
        private int data;
        private Block next = null;
    }

    public void setStack(int count) {
        Random rnd = new Random();
        Block current= null;
        while (count > 0) {
            this.head = new Block();
            this.head.data = rnd.nextInt(50);
            this.head.next=current;
            current = this.head;
            count--;
        }
    }
    public void getStack(){//выводим данные элементов стека
        if(this.head==null) {
            System.out.println("Стека не существует !!!");
            return;
        }
        Block cur = this.head;
        while (cur!=null){
            System.out.print(cur.data+"  ");
            cur = cur.next;
        }
    }
    public void productEven(){
        if(this.head==null) {
            System.out.println("Стека не существует !!!");
            return;
        }
        int prod = 1;
        Block cur = this.head;
        while (cur!=null){
            if(cur.data%2!=0) prod*=cur.data;
            cur =  cur.next;
        }
        System.out.println("Произведение нечётных элементов равно: "+prod);
    }
    public void sortStack() {
        if (this.head == null) {
            System.out.println("Стека не существует !!!");
            return;
        }
        Block current = this.head;
        Block min;
        Block cur;
        int min_data;
        int temp;
        while (current!=null){
            //находим блок с минимальным значением
           min=current;
           min_data=current.data;
           cur=current;
           while (cur!=null){
               if(cur.data<min_data){
                   min_data=cur.data;
                   min=cur;
               }
               cur=cur.next;
           }
           //меняем значения в блоках с мин.значением и текущего блока
           temp=current.data;
           current.data=min.data;
           min.data=temp;
            current=current.next;
        }
    }
}
