package class_and_object;

public class Book2 {


    String book_name;
    String writer_name;
    int num_of_pages;

    // parameterized constructor

    public Book2(String book_name, String writer_name, int num_of_pages) {
        this.book_name = book_name;
        this.writer_name = writer_name;
        this.num_of_pages = num_of_pages;
    }

    public static void main(String[] args) {


        // SYNTEX : ClassName obj_name= new ClassName();

        Book object= new Book();// Object created
        object.book_name="twelve years a slave";
        object.num_of_pages=500;
        object.writer_name="soloman northup";

        System.out.println(object.book_name);
        System.out.println(object.num_of_pages); 
        System.out.println(object.writer_name);

        // SYNTEX Parameterized : ClassName obj_name= new ClassName(properties );

        Book2 obj=new Book2("twelve years a slave","soloman northup",500);

        System.out.println(object.book_name);
        System.out.println(object.num_of_pages);
        System.out.println(object.writer_name);



    }

}


