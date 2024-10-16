import java.util.List;

public class ProductManager {
    private List<Product> products;

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        //logic to update product
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public boolean isAvailable(Product product) {
        return products.contains(product); // could be improved to something better
    }

    public void updateInventoryReturn(Product product, int qty) {
        for (Product p : products) {
            if (p.getId().equals(product.getId())) {
                p.setQty(p.getQty() + qty);
                break;
                // or something like that
            }
        }
    }
}
