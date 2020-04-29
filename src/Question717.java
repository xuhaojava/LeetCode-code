public class Question717 {
    public boolean isOneBitCharacter(int[] bits) {
        int num = 0;
        for(;num<bits.length-1;){
            if(bits[num] == 0){
                num += 1;
            }else if(bits[num] == 1){
                num += 2;
            }
        }
        return !(num>=bits.length);
    }
}
