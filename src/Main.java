
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();
        list.add(new Order("CA-1", "Furniture", "Bookcases", 261.96, 41.91));
        list.add(new Order("CA-2", "Furniture", "Chairs", 731.94, 219.58));
        list.add(new Order("US-3", "Furniture", "Tables", 957.57, -383.03));
        list.add(new Order("CA-4", "Technology", "Phones", 907.15, 90.71));
        list.add(new Order("CA-5", "Office Supplies", "Binders", 18.50, 6.87));

        SalesAnalyzer analyzer = new SalesAnalyzer(list);
        analyzer.printReport();
        analyzer.printLossOrders();
    }
}
