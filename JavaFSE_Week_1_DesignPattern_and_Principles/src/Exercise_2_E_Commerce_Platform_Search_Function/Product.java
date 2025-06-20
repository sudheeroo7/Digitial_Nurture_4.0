package Exercise_2_E_Commerce_Platform_Search_Function;

public class Product
{
    private final int productId;
    private final String productName;
    private final String category;
    public Product(int productId, String productName, String category)
    {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    public int getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public String getCategory() {
        return category;
    }
}
