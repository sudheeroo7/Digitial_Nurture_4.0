package Exercise_2_Factory_Method;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF Document");
    }
}
