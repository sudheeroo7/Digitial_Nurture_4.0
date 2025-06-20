package Exercise_2_E_Commerce_Platform_Search_Function;

import java.util.Arrays;
public class SearchEngine
{
    public static Product linearSearch(Product[] products, String name)
    {
        for (Product p : products)
        {
            if (p.getProductName().equalsIgnoreCase(name))
            {
                return p;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String name)
    {
        Arrays.sort(products, (a, b) -> a.getProductName().compareToIgnoreCase(b.getProductName()));
        int low = 0;
        int high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = products[mid].getProductName().compareToIgnoreCase(name);
            if (result == 0)
            {
                return products[mid];
            }
            else if (result < 0)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return null;
    }
}
