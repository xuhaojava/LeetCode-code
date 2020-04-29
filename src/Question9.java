public class Question9 {
    public boolean isPalindrome(int x) {
        if(x<0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int renum = 0;
        while(renum < x){
            renum = renum * 10 + x % 10;
            x /= 10;
        }
        return x == renum || x == renum/10;

    }
}
