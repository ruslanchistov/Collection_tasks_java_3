/*Дано число D и указатели P1 и P2 на начало и конец очереди, содержащей не менее двух
  элементов. Добавить элемент со значением D в конец очереди и извлечь из очереди
  первый (начальный) элемент. Вывести значение извлеченного элемента и содержимое
  очереди.*/

        package zadachnic_2.zadacha_83;

public class z_83 {
        public static void main(String[] args) {
             Queue_83 Q_1 = new Queue_83();
             Q_1.setQueue();
             Q_1.getQueue();
             Q_1.delHead();
             Q_1.getQueue();
             Q_1.addTail();
             Q_1.getQueue();
        }
}

