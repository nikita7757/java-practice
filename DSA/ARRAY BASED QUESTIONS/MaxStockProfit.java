
// Problem Statement

// Rohit is an investor who observes stock prices every day. The price of a stock changes daily. He wants to earn the maximum profit by buying and selling the stock.
// The conditions are:
// Rohit can buy the stock only once.
// After buying the stock, he must sell it on a later day.
// He cannot sell before buying.
// Rohit's goal is to choose a day to buy the stock and another later day to sell it such that the profit is maximum.

// If no profit can be made, return 0.
// *********************************************
// 6
// 7 1 5 3 6 4
// Sample Output
// 5


import java.util.*;

class MaxStockProfit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int minPrice = arr[0];
        int maxProfit = 0;
        
        for(int i=1;i<n;i++){
            
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }
            
            int profit = arr[i] - minPrice;
            
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        
        System.out.println(maxProfit);
    }
}
