package zadachnic_2.zadacha_85;


public class Queue_85 {
    public Unit_85 head = null;
    public Unit_85 tile = null;
    public int counter = 0;

    public class Unit_85 {
        private Unit_85(String param1,int param2){
            this.parameter1=param1;
            this.parameter2=param2;
        }
        public String parameter1;
        public Integer parameter2;
        public Unit_85 next = null;
        public Unit_85 previous = null;
    }

    public void addQueue(String param1,Integer param2 ) {
        if(param1==null && param2==null)return;
        if(this.tile!=null){
            Unit_85 current = new Unit_85(param1,param2);
            this.tile.next=current;
            current.previous=this.tile;
            this.tile=current;
            this.counter++;
        }
        else {
            this.head=this.tile=new Unit_85(param1,param2);
            this.counter++;
        }
    }
    public void getQueue(){
        int min=this.head.parameter2;
        Unit_85 current = this.head;
        int count=0;
        int min_index = 0;
        while (current!=null){
            if(current.parameter2<min){
                min=current.parameter2;
                min_index=count;
            }
            current=current.next;
            count++;
        }
        showQueue();
        delQueue(min_index);
    }
    public void delQueue(int index) {
        if(this.head==null || this.counter < index) return ;

        if(index==0) {   //если удаляется нулевой элемент
            this.head = this.head.next;
            this.counter--;
            return;
        }
        if(index==this.counter-1){  //если удаляется последний элемент
            this.tile.previous.next=null;
            this.tile=this.tile.previous;
            this.counter--;
            return;
        }
        Unit_85 current = this.head;
        int count = 0;
        while (count != index){
            current=current.next;
            count++;
        }
        current.previous.next=current.next;
        current.next.previous=current.previous;
        this.counter--;
    }
    public void showQueue(){
        Unit_85 current = this.head;
        while (current!=null){
            System.out.println(current.parameter1+"\t"+current.parameter2+"\t");
            current=current.next;
        }
        System.out.println();
    }
    public int sizeQueue() {
        return this.counter;
    }
}
