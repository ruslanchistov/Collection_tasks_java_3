/*Создать очередь, информационными полями которого являются: фамилия и возраст. При
  каждом вызове функции get печатать данные и удалять из очереди объект с самым малым
  возрастом.*/

        package zadachnic_2.zadacha_85;


public class z_85 {
    public static void main(String[] args) {
        Queue_85 data = new Queue_85();
        data.addQueue("Иванов",30);
        data.addQueue("Петров",25);
        data.addQueue("Сидоров",40);
        data.addQueue("Мокин",35);
        data.addQueue("Шохов",23);
        data.addQueue("Колесов",43);
        data.addQueue("Колачёв",55);
        data.addQueue("Вершин",18);

        data.getQueue();
        data.getQueue();
        data.getQueue();
        data.getQueue();
        data.getQueue();
        data.getQueue();

    }
}
