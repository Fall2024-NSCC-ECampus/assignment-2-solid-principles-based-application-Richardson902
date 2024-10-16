public class Order {
    private Long id;
    private int qty;
    private Product product;

    public Order(Long id, int qty, Product product) {
        this.id = id;
        this.qty = qty;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getTotal(){
        return this.product.getPrice() * this.qty;
    }

    public String toString(){
        return "Order{" +
                "id=" + id +
                ", qty=" + qty +
                ", product=" + product +
                ", total=" + getTotal() +
                '}';
    }
}
