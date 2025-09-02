class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean [][]visit=new boolean[m][n];
        Queue<pair>q=new LinkedList<>();
        int count=0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (visit[i][j]!=true && grid[i][j]=='1'){
                    bfs(grid,visit,q,i,j);
                    count++;
                }
            }
        }
        return count;
        
    }
    public void bfs(char[][]mat, boolean[][] visit,Queue<pair>q,int i,int j){
        int m=mat.length;
        int n=mat[0].length;
        q.add(new pair(i,j));
        while(!q.isEmpty()){
            int x=q.peek().x;
            int y=q.peek().y;
            q.poll();
            visit[x][y]=true;
            int[]dr={-1,0,1,0};
            int[]dc={0,1,0,-1};
            for (int a=0;a<dr.length;a++){
                int dlr=x+dr[a];
                int dlc=y+dc[a];
                if (dlr>=0 && dlc>=0 && dlr<mat.length && dlc<mat[0].length
                 && !visit[dlr][dlc] && mat[dlr][dlc]=='1' ){
                    q.add(new pair(dlr,dlc));
                    visit[dlr][dlc] = true;
                }
            }
        }
    }
    
}
class pair{
    int x;
    int y;
    public pair(int x,int y){
        this.x=x;
        this.y=y;
    }
} 