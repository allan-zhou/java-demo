import java.io.*;
import starting.*;

/**
 * DeserializeDemo
 */
public class DeserializeDemo {

    public static void main(String[] args) {
        Employee e = null;

        try {
            FileInputStream fileInput = new FileInputStream("./tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileInput);

            e = (Employee) in.readObject();
            in.close();
            fileInput.close();

        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
    }

}