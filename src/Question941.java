public class Question941 {
    public boolean validMountainArray(int[] A) {
        if(A.length<3){
            return false;
        }
        int i = 0;
        while(i+1 < A.length && A[i] < A[i+1]){
            i++;
        }
        if(i == 0 || i == A.length - 1){
            return false;
        }
        while(i+1 < A.length && A[i] > A[i+1]){
            i++;
        }
        if(i == A.length -1 ){
            return true;
        }
        return false;
    }
}
