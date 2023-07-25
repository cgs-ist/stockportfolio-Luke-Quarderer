import java.util.*;

public class StockPortfolio {
    
    private HashMap<Stock, Integer> portfolio = new HashMap<>();

    public StockPortfolio(){}

    public void addStock(Stock stock, int n){
        portfolio.put(stock, n);
    }

    public void viewPortfolio(){
        for(Stock stock : portfolio.keySet())
            System.out.println("\nStock: " + stock.getName() + ", Symbol: " + stock.getSymbol() + ", Price: " + stock.getPrice() + ", Quantity: " + portfolio.get(stock) + "\n");
    }
}
