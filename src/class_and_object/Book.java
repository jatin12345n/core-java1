package class_and_object;

public class Book {
    String book_name;
    String writer_name;
    int num_of_pages;


    public static void main(String[] args) {


        // SYNTEX : ClassName obj_name= new ClassName();

        Book object= new Book();// Object created
        object.book_name="Harry Potter and the half blood prince";
        object.num_of_pages=500;
        object.writer_name="j.k.rowling";

        System.out.println(object.book_name);
        System.out.println(object.num_of_pages);
        System.out.println(object.writer_name);

    }

}
