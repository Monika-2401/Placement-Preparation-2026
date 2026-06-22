public class SearchTest {

    // Linear Search
    public static int linearSearch(Product[] products, String target) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(target)) {
                return i;
            }
        }

        return -1;
    }

    // Binary Search
    public static int binarySearch(Product[] products, String target) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int result = target.compareToIgnoreCase(products[mid].productName);

            if (result == 0)
                return mid;

            if (result > 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(1, "Keyboard", "Electronics"),
                new Product(2, "Laptop", "Electronics"),
                new Product(3, "Mobile", "Electronics"),
                new Product(4, "Mouse", "Electronics")
        };

        System.out.println("Linear Search Result: "
                + linearSearch(products, "Mobile"));

        System.out.println("Binary Search Result: "
                + binarySearch(products, "Mobile"));
    }
}


/*OUTPUT:
         cd "c:\Users\monik\OneDrive\文件\Desktop\Placement-Preparation-2026\DSA\Exercise1\" && javac SearchTest.java && java SearchTest
Linear Search Result: 2
Binary Search Result: 2
*/