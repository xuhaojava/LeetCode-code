public class Question415 {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        String s = "";
        int count = 0;
        while(i >= 0 || j >= 0){
            int m = i>=0?num1.charAt(i)-'0':0;
            int n = j>=0?num2.charAt(j)-'0':0;
            int tem = m + n + count ;
            count = tem / 10;
            s = tem % 10 + s;
            i--;
            j--;
        }
        if(count == 1){
            s = 1 + s;
        }
        return s;
    }
}
