public class Painting extends Art {
    private String paintType;
    public void viewArt(){

    };
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getDescription(){
        return description;
    }
    public void setType(String type){
        this.paintType = type;
    }
    public String getType(){
        return this.paintType;
    }
}
