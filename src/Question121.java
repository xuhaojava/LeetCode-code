public class Question121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int pro = 0;
        int pri = prices[0];
        for(int i = 0;i<prices.length;i++){
            if(pri>prices[i]){
                pri = prices[i];
            }else{
                int tempro = prices[i] - pri;
                if(tempro>pro){
                    pro = tempro;
                }
            }
        }
        return pro;
    }
}
