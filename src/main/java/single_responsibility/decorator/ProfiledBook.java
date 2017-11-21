package single_responsibility.decorator;

public class ProfiledBook implements Book{

    private final PaperBook _paperBook;

    public ProfiledBook(PaperBook paperBook) {
        _paperBook = paperBook;
    }

    @Override
    public String getTitle() {
        //profile start
        String title = _paperBook.getTitle();
        // profile end
        return title;
    }

    @Override
    public String getAuthor() {
        //profile start
        String author = _paperBook.getAuthor();
        // profile end
        return author;
    }

    @Override
    public void turnPage() {
        //profile start
        _paperBook.turnPage();
        // profile end
    }
}
