package book;
public class BookList {
    private Book[] books = new Book[100];
    private int usedSize = 0;

    public BookList(){
        books[0] = new Book("三国演义","罗贯中",100,"小说");
        books[1] = new Book("水浒传","施耐庵",100,"小说");
        books[2] = new Book("西游记","吴承恩",100,"小说");
        this.usedSize = 3;
    }
  //我们可以把所有的操作都写到这个类当中 因为每一个操作都是操作books
    public static void main(String[] args) {

    }
}
