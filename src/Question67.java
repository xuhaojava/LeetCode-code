public class Question67 {
    public String addBinary(String a, String b) {
        int n = a.length()-b.length();
        if(n<0){
            for(int i = 0;i<Math.abs(n);i++){
                a = "0"+ a;
            }
        }else{
            for(int i = 0;i<n;i++){
                b = "0"+ b;
            }
        }
        int jw = 0;
        String num = "";
        for(int i = a.length()-1;i>=0;i--){
            num = (Integer.parseInt(String.valueOf(a.charAt(i)))+Integer.parseInt(String.valueOf(b.charAt(i)))+jw)%2 + num;
            jw = (Integer.parseInt(String.valueOf(a.charAt(i)))+Integer.parseInt(String.valueOf(b.charAt(i)))+jw)/2;
        }
        if(jw == 1){
            num = "1" + num;
        }
        return num;
    }
}
