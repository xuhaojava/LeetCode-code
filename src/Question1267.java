public class Question1267 {
    public int countServers(int[][] grid) {
        int []x = new int[grid.length];
        int []y = new int[grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    x[i]++;
                    y[j]++;
                }
            }
        }
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    if(x[i] > 1 || y[j] > 1){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
