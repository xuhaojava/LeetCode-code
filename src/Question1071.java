public class Question1071 {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        return str1.substring(0,gcb(str1.length(),str2.length()));
    }
    public int gcb(int a,int b){
        return b == 0?a:gcb(b,a%b);
    }
}
