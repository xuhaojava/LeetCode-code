import java.util.HashMap;

public class Question384 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap();
        for(int i = 0;i<ransomNote.length();i++){
            if(!map.containsKey(ransomNote.charAt(i))){
                map.put(ransomNote.charAt(i),1);
            }else{
                map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))+1);
            }
        }
        for(int i = 0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))-1);
            }
        }
        for(Character c : map.keySet()){
            if(map.get(c)>0){
                return false;
            }
        }
        return true;
    }
}
