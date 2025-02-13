package Ques6;

public enum OrderStatus {

    PENDING("Order is awaiting confirmation."),
    PROCESSING("Order is being prepared"), SHIPPED("Order has been dispatched."), DELIVERED("Order has been successfully delivered."),
    CANCELLED("Order has been canceled."),
    REFUNDED("Refund has been issued for the order.");

    private final String s;
    OrderStatus(String s) {
        this.s = s;
    }

    public String getStatus(){
        return this.s;
    }
}

