package SOLID_Principles.SingleResponsibilityPrinciple;

import java.util.Random;

public class BillCalculation {
    private Order order;
    public BillCalculation(Order order){
        this.order=order;
    }

    public void calculateBill(){
        Random random = new Random();
        int amount = random.nextInt(200) * this.order.getQuantity();
        this.order.setBillAmount(amount);
        System.out.println("This order id " + this.order.getOrderId()+ " has a bill amount of " + this.order.getBillAmount());
    }

}
