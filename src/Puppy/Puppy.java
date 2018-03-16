/**
 * Putty
 */
public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        System.out.println("puppy name is:" + name);
    }

    public void setAge(int age) {
        this.puppyAge = age;
    }

    public int getAge() {
        System.out.println("puppy's age is:" + this.puppyAge);
        return this.puppyAge;
    }
}