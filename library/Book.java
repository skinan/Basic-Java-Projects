package library;

import java.util.ArrayList;

public class Book  {
    public String name;
    public static int id;
    public int bookId;
    public ArrayList<Author> authorList;
    public Type bookType;
    public Editon editon;
    public boolean isAvailable;

    public Book(String name,Type bookType, Editon editon)
    {
        this.bookId = ++ library.Book.id;
        this.name = name;
        this.bookType = bookType;
        this.editon = editon;
        this.authorList = new ArrayList<Author>();
        this.isAvailable = true;
    }

    public  void authorAdd(Author author)
    {
        this.authorList.add(author);
        author.bookList.add(this);

    }

    public void authorAdd(ArrayList<Author> authors){
        for(int i=0; i<authors.size(); i++){
            authorAdd(authors.get(i));
        }
    }

    public void printDetails()
    {
        System.out.println("Book Name: " + name + "\n" + "Book Id: " + bookId + "\n" +
                            "Editon: "  + editon.month + ", " + editon.year +". " + "Book Type: "
                            + bookType + "\n" +
                            "Number of Authors: " + authorList.size() + "\n");
    }

    public void printAuthorlist()
    {
        System.out.println("Authors List of " + "\"" + name + "\" :");
        for (int i = 0; i < authorList.size(); i++)
        {
            System.out.println(this.authorList.get(i).name);
        }
        System.out.println();
    }

    public void borrowBook()
    {
        this.isAvailable = false;
    }

    public void returnBook()
    {
        this.isAvailable = true;
    }

    public void IsAvailable()
    {
        if(isAvailable)
            System.out.println("The book named " + "\""+ name + "\"" + " is currently available at the library." + "\n");
        else
            System.out.println("Sorry, the book named " + "\""+ name + "\""
                    + " is borrowed by someone and so not currently available in the library." + "\n");
    }
}
