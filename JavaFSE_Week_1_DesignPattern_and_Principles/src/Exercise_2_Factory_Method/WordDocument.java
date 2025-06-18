package Exercise_2_Factory_Method;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word Document");
    }
}
