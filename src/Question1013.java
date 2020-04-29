public class Question1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int num : A){
            sum += num;
        }
        if(sum % 3 != 0){
            return false;
        }
        int leftindex = 0;
        int leftsum = A[leftindex];
        int rightindex = A.length-1;
        int rightsum = A[rightindex];
        while(leftindex + 1 < rightindex){
            if(leftsum == sum/3 && rightsum == sum/3){
                return true;
            }
            if(leftsum != sum/3){
                leftsum += A[++leftindex];
            }
            if(rightsum != sum/3){
                rightsum += A[--rightindex];
            }
        }
        return false;
    }
}
