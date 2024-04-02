package SOLID_Principles.SingleResponsibilityPrinciple;

import java.util.Random;

public class Order {
    private Customer customer;
    private String orderId;
    private String itemName;
    private int billAmount;
    private int quantity;
    public Customer getCustomer(){return customer;}
    public void setCustomer(Customer customer){this.customer=customer;}
    public String getOrderId(){ return orderId;}
    public void setOrderId(String orderId){
        Random random = new Random();
        this.orderId=orderId + "-" + random.nextInt(500);
    }
    public String getItemName(){return itemName;}
    public void setItemName(String itemName){
        this.itemName=itemName;
        setOrderId(itemName);
    }
    public int getBillAmount() {
        return billAmount;
    }
    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void prepareOrder(){
        System.out.println("Order is preparing for the customer "+this.getCustomer().getName()+ 
                            " who has ordered " + this.getItemName());
    }
}
