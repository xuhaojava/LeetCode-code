public class Question8 {
    public int myAtoi(String str) {
        str = str.trim();
        if(str.length() == 0 || str == null){
            return 0;
        }
        int s = 1;
        int start = 0;
        long num = 0;
        if(str.charAt(0)=='+'){
            start += 1;
        }else if(str.charAt(0)=='-'){
            start += 1;
            s = -1;
        }
        for(int i = start;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                return (int)num*s;
            }
            num = num * 10 + str.charAt(i) - '0';
            if(s == 1 && num>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(s == -1 && num>Integer.MAX_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int)num*s;

    }
}
