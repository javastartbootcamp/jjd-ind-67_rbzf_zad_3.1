package pl.javastart.task;

public class BookShelf {

    public static void main(String[] args) {
        Book book1 = new Book("Prawdziwa Odessa", "Uki Goni", "Replika");
        Book book2 = new Book("Nelka i piesek Fafik", "Dorota Loskot-Cichocka", "Edukacyjny Egmont");

        System.out.printf("tytul: %s, autor: %s, wydawnictwo: %s%n", book1.title, book1.author, book1.publisher);
        System.out.printf("tytul: %s, autor: %s, wydawnictwo: %s%n", book2.title, book2.author, book2.publisher);
    }
}
