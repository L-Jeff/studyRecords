package homework;

public class Book implements Comparable{
    public String name;
    public Double price;
    public String author;

    public Book() {
    }

    public Book(String name, Double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int compareTo(Object o) {
        Book book = (Book) o;
        if(book.price > this.price){
            return -1;
        }else if(book.price <this.price){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

    public void greeting(){
        System.out.println("hi ,I'm book Class");
    }
}