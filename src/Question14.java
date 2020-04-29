public class Question14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String pre = strs[0];
        for(int i = 0;i<strs.length;i++){
            while(strs[i].indexOf(pre)!=0){
                pre = pre.substring(0,pre.length()-1);
                if(pre.equals("")){
                    return "";
                }
            }
        }
        return pre;
    }
}
