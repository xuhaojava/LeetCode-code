public class Question821 {
    public int[] shortestToChar(String S, char C) {
        int length = S.length();
        int ans[] = new int[length];

        int index = -20000;
        for(int i = 0;i<length;i++){
            if(S.charAt(i)==C){
                index = i;
            }
            ans[i] = i-index;
        }
        index = 20000;
        for(int i = length-1;i>=0;i--){
            if(S.charAt(i)==C){
                index = i;
            }
            ans[i] = Math.min(ans[i],index-i);
        }
        return ans;
    }
}
