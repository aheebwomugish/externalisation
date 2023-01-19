import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ExterWrite {
    public static void main(String[] args) {
        ExterExample obj = new ExterExample("Sasha", 21, "BSSE");
        try {
            FileOutputStream fin = new FileOutputStream("text.ser");
            ObjectOutputStream out = new ObjectOutputStream(fin);
            obj.writeExternal(out);
            System.out.println("Finished!");
            out.flush();
            out.close();
            fin.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     
    }
}
 