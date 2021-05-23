package zadachnic_2.zadacha_80;

import java.util.Random;
import java.lang.Math;
public class Queue_80 {
    private Block head = null;
    private Block tail = null;

    public class Block{ //элементы очереди
        private double data;
        private Block next = null;
        private Block previous = null;
    }
    public void setQueue(int count) {
        Random rnd = new Random();
        //создаём голову очереди
            this.head = new Block();
            double number = rnd.nextDouble()*20 -10;
            number = Math.ceil(number*100)/100;
            this.head.data = number;
            Block current = this.head;
            count--;
        //создаём следующие блоки очереди
        while (count > 0) {
            this.tail = new Block();
            this.tail.previous = current;
            number = rnd.nextDouble()*20 - 10;
            number = Math.ceil(number*100)/100;
            this.tail.data = number;
            current.next = this.tail;
            current = this.tail;
            count--;
        }
    }
    public void getQueue(){//выводим данные элементов очереди
        if(this.head==null) {
            System.out.println("Очередь не существует !!!");
            return;
        }
        Block cur = this.head;
        while (cur!=null){
            System.out.print(cur.data+"  ");
            cur = cur.next;
        }
    }
    public void searchPositiveElem() {//определяем количество положительных элементов в очереди
        if (this.head == null){
            System.out.println("Очередь не существует !!!");
            return;
        }
         Block cur = this.head;
        int count = 0;
        while (cur != null) {
            if(cur.data>0)count++;
            cur = cur.next;
        }
        System.out.println("Количество положительных элементов: "+count);
    }
}
