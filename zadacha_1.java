/*Написать функцию, которая объединяет два списка в один,
* исключая повторы*/

package zadachnic_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class zadacha_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list_1 = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list_1.add(rnd.nextInt(50));
        }
        show(list_1);
        ArrayList<Integer> list_2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list_2.add(rnd.nextInt(50));
        }
        show(list_2);
        list_1 = union_1(list_1,list_2); //первый вариант
        //union_2(list_1,list_2);           //второй вариант
        show(list_1);
    }
    /*первый вариант,когда исключаются все повторы*/
    public static ArrayList union_1(ArrayList list_1,ArrayList list_2) {
        HashSet<Integer> set = new HashSet<>();
        set.addAll(list_1);
        set.addAll(list_2);
        list_1.clear();
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) list_1.add(itr.next());
        return list_1;
    }

    /*второй вариант,когда исключается вхождение элементов второго списка
     если они уже существуют в первом списке */
    public static void union_2(ArrayList list_1,ArrayList list_2){
        int line = list_2.size();
        for (int i = 0; i < line; i++) {

            if(! list_1.contains(list_2.get(i))) list_1.add(list_2.get(i));
        }
    }

    public static void show(ArrayList list){
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+"  ");
        }
        System.out.println();
    }
}
