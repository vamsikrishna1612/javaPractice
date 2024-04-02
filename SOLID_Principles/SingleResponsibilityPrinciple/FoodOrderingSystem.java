package SOLID_Principles.SingleResponsibilityPrinciple;

public class FoodOrderingSystem {
    public static void main(String[] args){
        Customer customer = new Customer();
        customer.setName("Prannu");
        customer.setAddress("Hyderabad");
        Order order = new Order();
        order.setItemName("Pasta");
        order.setQuantity(3);
        order.setCustomer(customer);

        order.prepareOrder();

        BillCalculation bill = new BillCalculation(order);
        bill.calculateBill();

        DeliveryApp deliveryApp = new DeliveryApp(order);
        deliveryApp.delivery();
    }
}
