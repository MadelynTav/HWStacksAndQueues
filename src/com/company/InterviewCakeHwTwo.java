package nyc.c4q.madelyntav.src.com.company;
/**
 * Created by c4q-madelyntavarez on 11/16/15.
 */
public class InterviewCakeHwTwo
{

    public static void main(String[] args)
    {
        int [] prices={1,3,4,8,9,10,45,11,3,6,1,7};

        System.out.println(getMaxProfit(prices));
    }

    private static int getMaxProfit(int[] prices)
    {
        int max=prices[0];
        int min=prices[0];
        int minIndex=0;
        int profit;

        if(prices==null){
            return -1;
        }

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                minIndex=i;
            }
        }
        for(int j=minIndex; j<prices.length;j++)
        {
            if(prices[j] > max)
            {
                max = prices[j];
            }
        }
        if(min<max){
            profit=max-min;
        } else{
            return -1;
        }
        return profit;
    }
}
