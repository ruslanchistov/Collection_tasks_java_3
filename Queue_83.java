package zadachnic_2.zadacha_83;

import java.util.Random;
import java.util.Scanner;

public class Queue_83 {
    private Unit head = null;
    private Unit tail = null;
    Scanner in = new Scanner(System.in);

    public class Unit{ //элементы очереди
        private int data;
        private Unit next = null;
        private Unit previous = null;
    }
    public void setQueue() {
        Random rnd = new Random();
        System.out.print("Введите количество элементов очереди: ");
        int count = in.nextInt();
        //создаём голову очереди
        this.head = new Unit();
        this.head.data = 10+rnd.nextInt(100-10);
        Unit current = this.head;
        count--;
        //создаём следующие блоки очереди
        while (count > 0) {
            this.tail = new Unit();
            this.tail.previous = current;
            this.tail.data = 10+rnd.nextInt(100-10);
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
        Unit cur = this.head;
        while (cur!=null){
            System.out.print(cur.data+"  ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void delHead(){  //Удаление первого узла очереди
        if(this.head==null) {
            System.out.println("Очередь не существует !!!");
            return;
        }
        System.out.println("Извлечённый элемент: "+this.head.data);
        this.head = this.head.next;
    }
    public void addTail(){
        if(this.head==null) {
            System.out.println("Очередь не существует !!!");
            return;
        }
        System.out.print("Введите элемент для добавления в конец очереди: ");
        int D = in.nextInt();
        Unit cur = new Unit();
        cur.data = D;
        cur.previous = this.tail;
        this.tail.next = cur;
        this.tail = cur;
    }
}
