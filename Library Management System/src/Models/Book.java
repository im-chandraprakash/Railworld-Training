package Models;

public class Book {

    private int BookId;
    private String Title;
    private String Author;
    private String Publisher;
    private int CategoryId;
    private int TotalCopies;
    private int AvailableCopies;

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public int getTotalCopies() {
        return TotalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        TotalCopies = totalCopies;
    }

    public int getAvailableCopies() {
        return AvailableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        AvailableCopies = availableCopies;
    }
}
