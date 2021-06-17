package baitap;

import java.util.Scanner;

public class ManageBook {
    public void Array(){
        Book[] books = new Book[1];

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ID, Name, PublishDate, Author, Language, AveragePrice");

        for (int i = 0; i < books.length; i++) {
            int ID = scanner.nextInt();
            String Name = scanner.nextLine();
            String PublishDate = scanner.nextLine();
            String Author = scanner.nextLine();
            String Language = scanner.nextLine();
            float AveragePrice = scanner.nextFloat();

            books[i] = new Book(ID, Name, PublishDate, Author, Language, AveragePrice);

            scanner.nextLine();
        }
        for (Book arr: books) {
            System.out.println(arr.getID()+" "+arr.getName()+" "+arr.getPublishDate()+" "+arr.getAuthor()+" "+arr.getLanguage()+" "+arr.getAverragePrice());

        }



    }


    public void Insert(){

    }
    public void Remove(){

    }
    public void Update(){

    }
    public void Seach(){

    }
    public void Sort(){

    }
}
