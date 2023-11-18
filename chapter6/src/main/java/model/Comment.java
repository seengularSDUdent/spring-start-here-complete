package model;

public class Comment {

    private String author;
    private String text;

    public Comment(String author, String text){
        this.author = author;
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString(){
        return "Comment of: " + getAuthor() + ", with text: " + getText();
    }
}
