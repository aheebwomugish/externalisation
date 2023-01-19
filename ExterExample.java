import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExterExample implements Externalizable {
    public String name;
    public int age;
    public String course;

    public ExterExample() {}
    
    public ExterExample(String name, int age, String course) {
        this.name = name;
        this.age =  age;
        this.course = course;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeInt(age);
        out.writeUTF(course);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name =in.readUTF();
        this.age = in.readInt();
        this.course = in.readUTF();
        
    }

}