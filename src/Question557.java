public class Question557 {
    public String reverseWords(String s) {
        String str[] = s.split(" ");
        StringBuilder word = new StringBuilder();
        for(String S:str){
            word.append(new StringBuffer(S).reverse().toString()+" ");
        }
        return word.toString().trim();
    }
}
