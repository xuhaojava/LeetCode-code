public class Question695 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                max = Math.max(max,findmax(i,j,grid));
            }
        }
        return max;
    }

    public int findmax(int i,int j,int[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]==0){
            return 0;
        }
        grid[i][j] = 0;
        int num = 1;
        num += findmax(i+1,j,grid);
        num += findmax(i-1,j,grid);
        num += findmax(i,j+1,grid);
        num += findmax(i,j-1,grid);
        return num;
    }
}
