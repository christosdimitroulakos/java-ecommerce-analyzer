
public class Order {
    private String orderId;
    private String category;
    private String subCategory;
    private double sales;
    private double profit;

    // Constructor
    public Order(String orderId, String category, String subCategory, double sales, double profit) {
        this.orderId = orderId;
        this.category = category;
        this.subCategory = subCategory;
        this.sales = sales;
        this.profit = profit;
    }

    // Getters
    public String getOrderId() { 
        return orderId; 
    }

    public String getCategory() { 
        return category; 
    }

    public String getSubCategory() { 
        return subCategory; 
    }

    public double getSales() { 
        return sales; 
    }

    public double getProfit() { 
        return profit; 
    }
}