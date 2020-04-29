public class Question860 {
    public boolean lemonadeChange(int[] bills) {
        int f = 0,t = 0;
        for(int money : bills){
            if(money == 5){
                f++;
            }else if(money == 10){
                if(f == 0){
                    return false;
                }
                f--;
                t++;
            }else{
                if(f > 0 && t > 0){
                    f--;
                    t--;
                }else if(f >= 3){
                    f -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
