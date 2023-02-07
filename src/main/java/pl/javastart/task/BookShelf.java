package pl.javastart.task;

public class BookShelf {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Prawdziwa Odessa";
        book1.author = "Uki Goni";
        book1.publisher = "Replika";

        Book book2 = new Book();
        book2.title = "Nelka i piesek Fafik";
        book2.author = "Dorota Loskot-Cichocka";
        book2.publisher = "Edukacyjny Egmont";

        System.out.printf("tytul: %s, autor: %s, wydawnictwo: %s%n", book1.title, book1.author, book1.publisher);
        System.out.printf("tytul: %s, autor: %s, wydawnictwo: %s%n", book2.title, book2.author, book2.publisher);
    }
}
