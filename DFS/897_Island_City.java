//897_Island_City

public int numIslandCities(int[][] grid) {
        
    int n = grid.length;
    int m = grid[0].length;
    if (grid == null || n == 0 || m == 0) {
        return 0;
    }
    
    boolean[][] met =  new boolean[n][m];
    
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    
    int result = 0;
    Queue<Integer> q_n = new LinkedList<>();
    Queue<Integer> q_m = new LinkedList<>();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (grid[i][j] == 2 && !met[i][j]) {
                result++;
                met[i][j] = true;
               
                q_n.add(i);
                q_m.add(j);
            
                while (!q_n.isEmpty()) {
                    int a = q_n.poll();
                    int b = q_m.poll();
                    
                    for (int d = 0; d < 4; d++) {
                        int x = a + dx[d];
                        int y = b + dy[d];
                        if (x >= 0 && x < n && y >= 0 && y < m && (grid[x][y] == 1 || grid[x][y] == 2) && !met[x][y]) {
                            met[x][y] = true;
                            q_n.add(x);
                            q_m.add(y);
                        }
                        
                    }
                }
            }
        }
    }
    return result;
    
}
//time :O(n * m);
//space:O(n * m);