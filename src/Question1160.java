public class Question1160 {
    public int countCharacters(String[] words, String chars) {
        int []a = new int[26];
        for(char c : chars.toCharArray()){
            a[c-'a']++;
        }
        int length = 0;
        for(String s : words){
            boolean flag = true;
            int num[] = new int[26];
            for(char c : s.toCharArray()){
                num[c-'a']++;
                if(num[c-'a'] > a[c-'a']){
                    flag = false;
                    break;
                }
            }
            if(flag){
                length += s.length();
            }
        }
        return length;
    }
}
