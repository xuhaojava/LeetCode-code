public class Question796 {
    public boolean rotateString(String A, String B) {
        if(A.equals(B)){
            return true;
        }
        for(int i = 0;i<A.length();i++){
            if(A.equals(B)){
                return true;
            }else{
                A = A.substring(1,A.length())+A.charAt(0);
            }
        }
        return false;

    }
}
