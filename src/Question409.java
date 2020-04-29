public class Question409 {
    public int longestPalindrome(String s) {
        int a[] = new int[128];
        for(char c : s.toCharArray()){
            a[c]++;
        }
        int length = 0;
        for(int x:a){
            length+=x/2*2;
            if(x % 2 == 1 && length % 2 == 0){
                length++;
            }
        }
        return length;
    }
}
