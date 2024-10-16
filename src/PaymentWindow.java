public class PaymentWindow {

    public boolean processPayment(Order order, double amount){
        //absolutely scuffed but you get the point
        return amount >= order.getTotal();
    }
}
