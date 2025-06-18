package Exercise_2_Factory_Method;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel Document");
    }
}
