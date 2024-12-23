public class EncapsulationExample {
    
    public static void main(String[] args){

        
        System.out.println();

        Student s1 = new Student();

        s1.setId(3746);
        s1.setName("Ma. Erica");
        System.out.println("Student ID: " + s1.getId());
        System.out.println("Student Name: " + s1.getName());
        System.out.println();

  
        System.out.println();

        Book b1 = new Book();

        b1.setBookNumber(123);
        b1.setAuthor("Noilee Ann");
        b1.setTitle("Never Give Up");
        b1.setPrice(400.00);
        System.out.println("Book Number: " + b1.getBookNumber());
        System.out.println("Book Title: " + b1.getTitle());
        System.out.println("Book Author: " + b1.getAuthor());
        System.out.println("Book Price: " + b1.getPrice());
        System.out.println();
    }
}