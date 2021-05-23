package zadachnic_2.zadacha_88;


import zadachnic_2.zadacha_87.Queue_87;

import java.util.*;

public class Queue_88 extends Queue_87 {
    public Queue_88 sorted(Queue_88 queue){
        /*Берём название книги,делаем все буквы строчными,удаляем пробелы
        * и записываем в словарь,в котором они сортируются по алфавиту.
        * В качестве ключа строка,в качестве значения порядок в очереди*/
        int size = queue.sizeQueue();
        String str;
        TreeMap<String,Integer> map = new TreeMap<>();
        for (int i = 0; i < size; i++) {
            str = queue.getQueue(i);
            str=str.toLowerCase();
            str = str.replaceAll("\\s+","");
               map.put(str,i);
        }
        /*Создаём новую очередь и записываем в неё элементы начальной очереди
        * всоответствии с порядком индексов в словаре*/
        Queue_88 new_books = new Queue_88();
        for(Map.Entry<String,Integer> pair:map.entrySet()){
            int val = pair.getValue();
            int count=0;
            Unit_85 current = this.head;
            while ( val!= count){
                current=current.next;
                count++;
                }
            new_books.addQueue(current.parameter1,current.parameter2);
        }
        return new_books;
    }
}
