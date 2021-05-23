package zadachnic_2.zadacha_82;


public class Queue_82 {
    private Block head = null;
    private Block tail = null;

    public class Block{ //элементы очереди
        private String model;
        private int memory;
        private Block next = null;
        private Block previous = null;
    }
    public void setQueue(String[] mod,int[] ram) {
        int count = mod.length;
        //создаём голову очереди
        this.head = new Block();
        this.head.model = mod[count-1];
        this.head.memory = ram[count-1];
        Block current = this.head;
        count--;
        //создаём следующие блоки очереди
        while (count > 0) {
            this.tail = new Block();
            this.tail.previous = current;
            this.tail.model = mod[count-1];
            this.tail.memory = ram[count-1];

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
            System.out.println(cur.model+"  "+cur.memory);
            cur = cur.next;
        }
    }
    public void sortQueue(){
        if(this.head==null) {
            System.out.println("Очередь не существует !!!");
            return;
        }
        Block temp = this.head;
        //определяем узел очереди с минимальным значением поля memory
        int min_ram = temp.memory;
        Block min_unit = temp;
        while (temp!=null){
            if(temp.memory<min_ram){
                min_ram=temp.memory;
                min_unit=temp;
            }
            temp= temp.next;
        }
        //ставим этот узел в голову списка
        if(min_unit!=this.head) {   //если это не голова
            min_unit.previous.next = min_unit.next;
            if(min_unit.next!=null) {   //если это не хвост
                min_unit.next.previous = min_unit.previous;
            }
            min_unit.next = this.head;
            head.previous = min_unit;
            min_unit.previous = null;
            this.head = min_unit;
        }
        //сортируем остальную очередь
        Block cur = this.head.next;
        while (cur!=null){
            //определяем узел очереди с минимальным значением поля memory
            temp=cur;
            min_ram=temp.memory;
            min_unit=temp;
            while (temp!=null){
                if(temp.memory<min_ram){
                    min_ram=temp.memory;
                    min_unit=temp;
                }
                temp= temp.next;
            }
            //ставим этот узел на место текущего узла
            if(min_unit!=cur) { //если он не является текущим
                min_unit.previous.next = min_unit.next;
                if (min_unit.next != null) { //если это не хвост
                    min_unit.next.previous = min_unit.previous;
                }
                min_unit.next = cur;
                cur.previous.next = min_unit;
                min_unit.previous = cur.previous;
                cur.previous = min_unit;
            }
            this.tail=cur;
            cur = min_unit.next;
        }
    }
}
