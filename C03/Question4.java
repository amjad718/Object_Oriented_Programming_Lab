package C03;
import java.util.*;

class Publisher{
    String publisher;
    public Publisher(String publisher) {
        this.publisher = publisher;
    }
}

class Book extends Publisher{
    String author;
    public Book(String publisher, String author) {
        super(publisher);
        this.author = author;
    }
}

class Literature extends Book{
    String literature;
    public Literature(String publisher, String author, String literature) {
        super(publisher, author);
        this.literature = literature;
    }
    void display(){
        System.out.println("Literature Book Details...........");
        System.out.println("Publisher: "+publisher);
        System.out.println("Author: "+author);
        System.out.println("Title: "+literature);
    }
}

class Fiction extends Book{
    String fiction;
    public Fiction(String publisher, String author, String fiction) {
        super(publisher, author);
        this.fiction = fiction;
    }
    void display(){
        System.out.println("Fiction Book Details...........");
        System.out.println("Publisher: "+publisher);
        System.out.println("Author: "+author);
        System.out.println("Title: "+fiction);
    }
}


public class Question4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the choice\n1. Enter the literature book details\n2. Enter the fiction book details\n0. Exit");
        int choice = sc.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Enter the publisher name:");
                String publisher = sc.next();
                System.out.println("Enter the author name:");
                String author = sc.next();
                System.out.println("Enter the name of the Literature book:");
                String literature = sc.next();
                Literature lit_obj = new Literature(publisher,author,literature);
                lit_obj.display();
            }
            break;
            case 2:{
                System.out.println("Enter the publisher name:");
                String publisher = sc.next();
                System.out.println("Enter the author name:");
                String author = sc.next();
                System.out.println("Enter the name of the Fiction book:");
                String fiction = sc.next();
                Fiction fic_obj = new Fiction(publisher,author,fiction);
                fic_obj.display();
            }
            break;
            case 0:{
                System.out.println("Exiting...!!!");
            }
            break;
        }
    }
}
