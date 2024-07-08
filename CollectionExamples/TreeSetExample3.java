package CollectionExamples;

import java.util.Set;
import java.util.TreeSet;

class Books implements Comparable<Books>
{
    private String bookname;
    private String author;
    private Double price;


    public Books(String bookname, String author, Double price) {
        this.bookname = bookname;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price ;
    }


    @Override
    public int compareTo(Books o) {
        if(this.price>o.price)
            return 1;
        else if(this.price<o.price)
            return -1;
        else
            return 0;
    }
}
public class TreeSetExample3 {
    public static void main(String[] args) {
        Set <Books> bookSet=new TreeSet<>();
        Books b1=new Books("Let Us C", "Kanetkar", 350.0);
        Books b2=new Books("Learning java", "Leuman", 450.0);
        Books b3=new Books("Mastering Python", "McMiLLION", 550.0);
        Books b4=new Books("C++", "Kumar", 650.0);
        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);
        bookSet.add(b4);
        for(Books b:bookSet)
        {
            System.out.println(b);
        }
    }
}
