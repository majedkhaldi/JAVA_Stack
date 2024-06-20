// inside of Art.java
public abstract class Art {
    protected String title;
    protected String author;
    protected String description;
    abstract void viewArt();
    abstract void setTitle(String title);
    abstract void setAuthor(String author);
    abstract void setDescription(String description);
    abstract String getTitle();
    abstract String getAuthor();
    abstract String getDescription();
}
