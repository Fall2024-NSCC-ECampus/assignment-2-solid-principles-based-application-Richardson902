import java.util.List;

public class OrderManager {

    private List<Order> orderHistory;
    private List<Return> returnHistory;
    private PaymentWindow paymentWindow;
    private FreightHandler freightHandler;

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public List<Return> getReturnHistory() {
        return returnHistory;
    }

    public void setReturnHistory(List<Return> returnHistory) {
        this.returnHistory = returnHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }

    public String processOrder(Order order, String shippingAddress, String shipmentDate){
        //something like this should be done
        if(paymentWindow.processPayment(order, order.getTotal())) {

            orderHistory.add(order);

            OrderShipment orderShipment = new OrderShipment(order, shippingAddress, shipmentDate, freightHandler);
            return "Order added to history and shipment processed";
        }
        return "Order processed";
    }

    public String processReturn(Return returnOrder) {
        // some logic to process the return and refund or something like that
        returnHistory.add(returnOrder);
        return "Return processed";
    }
}
