package Week_04;


public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(Solution_maxProfit.maxProfit(prices));
    }
}
class Solution_maxProfit {
    public static int maxProfit(int[] prices) {
        int ans=0;
        for(int i=1;i<=prices.length-1;i++)
        {
            if(prices[i]>prices[i-1])
            {
                ans+=prices[i]-prices[i-1];
            }
        }
        return ans;
    }
}

