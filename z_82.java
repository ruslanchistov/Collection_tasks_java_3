/*Создать очередь, информационными полями которого являются: компьютер и объем его
  оперативной памяти. Отсортировать объекты по объему оперативной памяти.*/

        package zadachnic_2.zadacha_82;

public class z_82 {
        public static void main(String[] args) {
                String [] model_base = {"Acer  ","Apple ","Asus  ","Dell  ",//
                 "HP    ","Intel ","Irbis ","Lenovo","ASRock","MSI   "};
                int [] memory_base = {2,8,4,64,32,4,2,16,8,32}; //данные недостоверные

                Queue_82 Q_1 = new Queue_82();
                Q_1.setQueue(model_base,memory_base);
                Q_1.getQueue();
                System.out.println();
                Q_1.sortQueue();
                Q_1.getQueue();
        }
}
