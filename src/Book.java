public class Book {
    String name;
    int shelf;

    public Book(String name) {
        this.name = name;
        this.shelf = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShelf() {
        return shelf;
    }

    public void setShelf(int shelf) {
        this.shelf = shelf;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", shelf=" + shelf +
                '}';
    }
}
