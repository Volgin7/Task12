import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Book 7");
        names.add("Book 6");
        names.add("Book 5");
        names.add("Book 4");
        names.add("Book 3");
        names.add("Book 1");
        names.add("Book 2");
        names.add("Book 4");
        names.add("Book 8");
        names.add("Book 9");
        names.add("Book 10");
        names.add("Book 11");

        List<Book> books = PutBooksOnShelves(names);

        for (Book book: books) {
            System.out.println(book);
        }
    }

    public static List<Book> PutBooksOnShelves(List<String> names) {
        final int  NUMBER_OF_SHELVES = 5;
        List<Book> books = new ArrayList<>();

        Collections.sort(names);

        for (String name: names ) {
            books.add(new Book (name));
        }

        int num_books_per_shelf_min = books.size() / NUMBER_OF_SHELVES;
        int num_books_per_shelf_max = num_books_per_shelf_min;
        if(books.size() % NUMBER_OF_SHELVES != 0) {
            num_books_per_shelf_max++;
        }

        int dif = num_books_per_shelf_max * NUMBER_OF_SHELVES - books.size();

        int[] book_per_shelf = new int [NUMBER_OF_SHELVES];
        for (int i = 0; i < NUMBER_OF_SHELVES; i++) {
            if (i >= dif) {
                book_per_shelf[i] = num_books_per_shelf_max;
            } else {
                book_per_shelf[i] = num_books_per_shelf_min;
            }
            System.out.println("book_per_shelf[i] = " + book_per_shelf[i]);
        }

        int i = 0;
        for(int j=0; j < NUMBER_OF_SHELVES; j++) {
            for (int k = 0; k < book_per_shelf[j]; k++) {
                books.get(i).setShelf(j);
                i++;
            }
        }

        return books;
    }
}