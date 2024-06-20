public class Sculpture extends Art {
    String material;
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
    public void setMaterial(String material){
        this.material = material;
    }
    public String getMaterial(){
        return this.material;
    }
}
