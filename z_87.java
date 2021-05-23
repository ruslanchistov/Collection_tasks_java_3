/*Создать  список,  информационными  полями которого являются: название горы и высота.
  Осуществлять поиск и вывод элемента, в названии которого имеется введенная
  пользователем подстрока.*/

        package zadachnic_2.zadacha_87;


public class z_87 {
    public static void main(String[] args) {
        Queue_87 mountains = new Queue_87();
        mountains.addQueue("Чогори",8611);
        mountains.addQueue("Макалу",8485);
        mountains.addQueue("Манаслу",8163);
        mountains.addQueue("Броуд Пик",8051);
        mountains.addQueue("Ракапоши",7788);
        mountains.addQueue("Скил Брум",7410);
        search(mountains);
    }
    public static void search(Queue_87 queue){
        int size = queue.sizeQueue();
        String str;
        int line;
        for (int i = 0; i < size; i++) {
            str = queue.getQueue(i);
            line = str.length();
            for (int j = 0; j < line; j++) {
                if(str.charAt(j)==' ' && j!=0 && j!=line-1){
                    System.out.println(queue.getQueue(i));
                    break;
                }
            }
        }
    }
}
