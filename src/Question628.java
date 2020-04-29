public class Question628 {
    public int maximumProduct(int[] nums) {
        int minfirst = Integer.MAX_VALUE;
        int minsecond = Integer.MAX_VALUE;
        int maxfirst = Integer.MIN_VALUE;
        int maxsecond = Integer.MIN_VALUE;
        int maxthird = Integer.MIN_VALUE;
        for(int x:nums){
            if(x<minfirst){
                minsecond = minfirst;
                minfirst = x;
            }else if(x<minsecond){
                minsecond = x;
            }
            if(x>maxfirst){
                maxthird = maxsecond;
                maxsecond = maxfirst;
                maxfirst = x;
            }else if(x>maxsecond){
                maxthird = maxsecond;
                maxsecond = x;
            }else if(x>maxthird){
                maxthird = x;
            }
        }
        return Math.max(minfirst*minsecond*maxfirst,maxfirst*maxsecond*maxthird);
    }
}
