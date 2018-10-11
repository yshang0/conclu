//433_Number_of_Islands

public int numIslands(boolean[][] grid) {
    int island = 0;
    if (grid == null || grid.length == 0 || grid[0].length == 0) {
        return island;
    }
    boolean[][] v = new boolean[grid.length][grid[0].length];
    
    
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    
    Queue<Integer> qx = new LinkedList<>();
    Queue<Integer> qy = new LinkedList<>();
    
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[i][j] && !v[i][j]) {
                island++;
                qx.offer(i);
                qy.offer(j);
                v[i][j] = true;
                while (!qx.isEmpty()) {
                    int x = qx.poll();
                    int y = qy.poll();
                    for (int d = 0; d < 4; d++) {
                        int cur_x = x + dx[d];
                        int cur_y = y + dy[d];
                        if (cur_x >= 0 && cur_y >= 0 && cur_x < grid.length && cur_y < grid[0].length && !v[cur_x][cur_y] && grid[cur_x][cur_y]) {
                            qx.offer(cur_x);
                            qy.offer(cur_y);
                            v[cur_x][cur_y] = true;
                        }
                    }
                }
                
            }
        }
    }
    return island;
}

    //time:(n * m)
    //space:O(n * m)