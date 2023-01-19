import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ExterRead {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("text.ser");
            ObjectInputStream oin = new ObjectInputStream(in);
            ExterExample obj = new ExterExample();
            obj.readExternal(oin);
            System.out.println("It is working");
            System.out.println(obj.name);
            System.out.println(obj.age);
            System.out.println(obj.course);
            oin.close();
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
