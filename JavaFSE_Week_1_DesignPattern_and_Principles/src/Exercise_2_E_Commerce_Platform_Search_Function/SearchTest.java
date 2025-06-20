package Exercise_2_E_Commerce_Platform_Search_Function;

public class SearchTest
{
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Personal Computer", "Electronics"),
                new Product(2, "Socks", "Footwear"),
                new Product(3, "Chain", "Accessories"),
                new Product(4, "Smart Watch", "Electronics"),
                new Product(5, "Jeans", "Clothing")
        };
        String searchTerm = "Personal Computer";
        System.out.println("Using Linear Search:");
        Product result1 = SearchEngine.linearSearch(products, searchTerm);
        printResult(result1);
        System.out.println("\nUsing Binary Search:");
        Product result2 = SearchEngine.binarySearch(products, searchTerm);
        printResult(result2);
    }
    public static void printResult(Product product)
    {
        if (product != null)
        {
            System.out.println("Product Found: " + product.getProductName() + " in " + product.getCategory());
        }
        else
        {
            System.out.println("Product Not Found");
        }
    }
}

