public class Activity {
    public static void main(String[] args) {

    Dog puppy = new Dog();

    puppy.setName("Snowy");

    System.out.println(puppy.showName());

    puppy.bark();

    puppy.setListOfPuppies(new String[]{"Ace","Dwight","Browny","Sunny", "Cream"});

    int showNumber = puppy.show_numOfPuppies();

    System.out.println(" Number of puppies: " + showNumber);

    puppy.show_numOfPuppies();

    puppy.showPuppies();
    }
}