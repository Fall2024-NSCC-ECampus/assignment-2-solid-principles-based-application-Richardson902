public class Return {
    private Long id;
    private Product product;
    private int qty;


    public Return(Long id, Product product, int quantity) {
        this.id = id;
        this.product = product;
        this.qty = qty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


}
