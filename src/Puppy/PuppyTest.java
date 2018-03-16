
/**
 * PuppyTest
 */
public class PuppyTest {

    public void getNumber() {
        int i;
        i = i +10;
        System.out.println(i);
    }

    public static void main(String[] args) {
        Puppy p1 = new Puppy("alice");
        Puppy p2 = new Puppy("bob");

        p1.setAge(10);
        p1.getAge();

        p2.setAge(20);
        p2.getAge();


        PuppyTest t = new PuppyTest();
        t.getNumber();
    }
}