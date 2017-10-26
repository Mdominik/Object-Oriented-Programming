
package mediaAdmin_II;

public class Book extends Medium {
    private String author;
    private int pages_number;
    
    Book() {
        super();
    }
    
    Book(String aut, int pag_no) {
        super();
        author = aut;
        pages_number = pag_no;
    }
    
    @Override
    void print() {
        System.out.print("Book by " + author);
        super.print(); // superclass method stays here
        System.out.println(", " + pages_number + " pages.");
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the pages_number
     */
    public int getPages_number() {
        return pages_number;
    }

    /**
     * @param pages_number the pages_number to set
     */
    public void setPages_number(int pages_number) {
        this.pages_number = pages_number;
    }
}




