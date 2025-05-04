package cheatcode.hashcode;

public class BookMain {

    public static void main(String[] args) {

        Book book1 = new Book("Hector Garcia", "Ikigai", 2016);
        Book book2 = new Book("Amish tripati", "The Immortals of meluha", 2010);
        Book book3 = new Book("Hector Garcia", "Ikigai", 2016);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());

        boolean equals = book1.equals(book3);
        System.out.println(equals);

        Class<? extends Book> aClass = book1.getClass();
        System.out.println(aClass);
        

    }
}