public class OrderShipment {

    private Order order;
    private String shippingAddress;
    private String shipmentDate;
    private FreightHandler freightHandler;

    public OrderShipment(Order order, String shippingAddress, String shipmentDate, FreightHandler freightHandler) {
        this.order = order;
        this.shippingAddress = shippingAddress;
        this.shipmentDate = shipmentDate;
        this.freightHandler = freightHandler;
        processShipment();
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(String shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    private void processShipment() {
        Invoice invoice = new Invoice();
        invoice.setOrder(order);
        freightHandler.processInvoice(invoice);
    }


}
