/*Создать список, информационными полями которого являются: название книги и
  количество страниц. Осуществить сортировку объектов списка по названию книги в
  алфавитном порядке.*/

        package zadachnic_2.zadacha_88;

public class z_88 {
    public static void main(String[] args) {
        Queue_88 books = new Queue_88();
        books.addQueue("Приключения Буратино",200);
        books.addQueue("Война и мир",3000);
        books.addQueue("Статский советник",786);
        books.addQueue("Как закалялась сталь",1000);
        books.addQueue("Кавказский пленник",526);
        books.addQueue("Приключения Робинзона Крузо",753);
        books.addQueue("Золушка",325);
        books.showQueue();
        books = books.sorted(books);
        books.showQueue();

    }
}
