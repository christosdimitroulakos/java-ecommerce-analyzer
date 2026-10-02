
import java.util.List;

public class SalesAnalyzer {
    private List<Order> list;

    // Constructor
    public SalesAnalyzer(List<Order> list) {
        this.list = list;
    }

    // Υπολογισμός συνολικών πωλήσεων
    public double getTotalSales() {
        double sumSales = 0;
        for (Order o : list) {
            sumSales = sumSales + o.getSales();
        }
        return sumSales;
    }

    // Υπολογισμός συνολικού κέρδους
    public double getTotalProfit() {
        double sumProfit = 0;
        for (Order o : list) {
            sumProfit = sumProfit + o.getProfit();
        }
        return sumProfit;
    }

    // Υπολογισμός ποσοστού κέρδους (%)
    public double getMargin() {
        double totalSales = getTotalSales();
        if (totalSales == 0) {
            return 0;
        }
        return (getTotalProfit() / totalSales) * 100;
    }

    // Εκτύπωση αποτελεσμάτων
    public void printReport() {
        System.out.println("=== E-COMMERCE REPORT ===");
        System.out.println("Total Sales: $" + getTotalSales());
        System.out.println("Total Profit: $" + getTotalProfit());
        System.out.println("Margin: " + getMargin() + "%");
        System.out.println("-------------------------");
    }

    // Εντοπισμός ζημιογόνων παραγγελιών
    public void printLossOrders() {
        System.out.println("Loss Orders:");
        for (Order o : list) {
            if (o.getProfit() < 0) {
                System.out.println(o.getSubCategory() + " -> Loss: $" + o.getProfit());
            }
        }
    }
}