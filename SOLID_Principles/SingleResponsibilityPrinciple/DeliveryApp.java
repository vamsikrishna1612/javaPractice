package SOLID_Principles.SingleResponsibilityPrinciple;

public class DeliveryApp {
    private Order order;
    public DeliveryApp(Order order){
        this.order=order;
    }

    public void delivery(){
        System.out.println("Delivering the order");
        System.out.println("Order with orderId as "+ this.order.getOrderId() + " being delivered to " + this.order.getCustomer().getName());
        System.out.println("Delivering to the address "+ this.order.getCustomer().getAddress());
    }
    
}
