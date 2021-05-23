package zadachnic_2.zadacha_87;

import zadachnic_2.zadacha_85.Queue_85;

public class Queue_87 extends Queue_85 {

    public String  getQueue(int index){
      Unit_85 current = this.head;
      int count = 0;
      while (count!=index){
          current=current.next;
          count++;
      }
      return current.parameter1;
    }
}
