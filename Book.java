package baitap;

public class Book implements IBook {
    private int ID;
    private String Name;
    private String PublishDate;
    private String Author;
    private String Language;
    private float AverragePrice;

    public Book() {
    }

    public Book(int ID, String name, String publishDate,
                String author, String language, float averragePrice) {
        this.ID = ID;
        Name = name;
        PublishDate = publishDate;
        Author = author;
        Language = language;
        AverragePrice = averragePrice;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public float getAverragePrice() {
        return AverragePrice;
    }

    public void setAverragePrice(float averragePrice) {
        AverragePrice = averragePrice;
    }

    @Override
    public void Display() {
        System.out.println("ID Book : "+getID());
        System.out.println("Name Book : " + getName());
        System.out.println("PublishDate : " + getPublishDate());
        System.out.println("Author : "+  getAuthor());
        System.out.println("Language : " + getLanguage());
        System.out.println("AveragePrice : "+ getAverragePrice());
    }

    @Override
    public void sort() {


    }
}
