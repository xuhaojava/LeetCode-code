public class Question551 {

    public boolean checkRecord(String s) {
        int Anum = 0;
        int Lnum = 0;
        for(char c:s.toCharArray()){
            if(c == 'A'){
                Anum++;
            }
            if(c == 'L'){
                Lnum++;
            }else{
                Lnum = 0;
            }
            if(Anum > 1 || Lnum > 2){
                return false;
            }
        }
        return true;
    }
}
