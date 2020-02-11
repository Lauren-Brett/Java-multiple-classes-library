import java.util.ArrayList;

public class Borrower {

    private String name;
    private Integer readingList;

    public Borrower(String name) {
        this.name = name;
        this.readingList = 0;
    }


    public String getName() {
        return this.name;
    }

    public int readingListCount() {
        return this.readingList;
    }
}
