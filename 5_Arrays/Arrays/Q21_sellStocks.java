
// Best time to buy and sell a stock: 

public class Q21_sellStocks {

    public static int stocks(int arr[]){
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0; 

        for(int i = 0; i<arr.length; i++){
            if(buyPrice > arr[i]){
                buyPrice = arr[i];
            }
            profit = Math.max(profit, arr[i] - buyPrice);
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4};
        System.out.println(stocks(arr));
        
    }
}
