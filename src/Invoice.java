public class Invoice {
    private Order order;
    private boolean received;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public boolean isReceived() {
        return received;
    }

    public void setReceived(boolean received) {
        this.received = received;
    }

    public String toString() {
        return "details.Invoice{" +
                "order=" + order.toString() +
                ", received=" + received +
                '}';
    }
}
