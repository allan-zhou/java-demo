
/**
 * PuppyTest
 */
public class PuppyTest {

    public static void main(String[] args) {
        Puppy p1 = new Puppy("alice");
        Puppy p2 = new Puppy("bob");

        p1.setAge(10);
        p1.getAge();

        p2.setAge(20);
        p2.getAge();
    }
}