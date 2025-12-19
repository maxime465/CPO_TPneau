package thees.mn;

import java.util.Random;

public class Game {
    private Tile[][] grid;
    private int score;
    private Random rand = new Random();

    public Game() {
        grid = new Tile[4][4];
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                grid[i][j] = new Tile(0);

        addNewTile();
        addNewTile();
    }

    public Tile[][] getGrid() { return grid; }
    public int getScore() { return score; }

    
    public void move(Direction dir) {
        boolean moved = false;
        switch(dir) {
            case UP:
                for(int col=0; col<4; col++)
                    moved |= moveColumn(col, true);
                break;
            case DOWN:
                for(int col=0; col<4; col++)
                    moved |= moveColumn(col, false);
                break;
            case LEFT:
                for(int row=0; row<4; row++)
                    moved |= moveRow(row, true);
                break;
            case RIGHT:
                for(int row=0; row<4; row++)
                    moved |= moveRow(row, false);
                break;
        }
        if(moved) addNewTile();
    }

    private boolean moveRow(int row, boolean left) {
        boolean moved = false;
        int[] vals = new int[4];
        for(int i=0;i<4;i++) vals[i] = grid[row][i].getValue();
        int[] merged = merge(vals, left);
        for(int i=0;i<4;i++){
            if(grid[row][i].getValue() != merged[i]){
                moved = true;
                grid[row][i].setValue(merged[i]);
            }
        }
        return moved;
    }

    private boolean moveColumn(int col, boolean up){
        boolean moved = false;
        int[] vals = new int[4];
        for(int i=0;i<4;i++) vals[i] = grid[i][col].getValue();
        int[] merged = merge(vals, up);
        for(int i=0;i<4;i++){
            if(grid[i][col].getValue() != merged[i]){
                moved = true;
                grid[i][col].setValue(merged[i]);
            }
        }
        return moved;
    }

    // Fusion simplifiée : seules les tuiles de même valeur se combinent
    private int[] merge(int[] arr, boolean leftOrUp) {
        int[] res = new int[4];
        int idx = leftOrUp ? 0 : 3;
        int step = leftOrUp ? 1 : -1;
        boolean[] merged = new boolean[4];

        int start = leftOrUp ? 0 : 3;
        int end = leftOrUp ? 4 : -1;

        for(int i=start;i!=end;i+=step){
            if(arr[i]==0) continue;
            int pos = idx;
            while(pos - step >=0 && pos - step <4 && res[pos - step]==0) pos -= step;

            if(pos - step >=0 && pos - step <4 && !merged[pos-step]){
                int target = res[pos-step];
                if(arr[i] == target && target != 0){
                    res[pos-step] = arr[i]*2;
                    merged[pos-step] = true;
                    score += res[pos-step];
                    continue;
                }
            }
            res[pos] = arr[i];
            idx += step;
        }
        return res;
    }

    public void addNewTile() {
        int value = rand.nextBoolean() ? 1 : 2;
        int i,j;
        do{
            i = rand.nextInt(4);
            j = rand.nextInt(4);
        } while(!grid[i][j].isEmpty());
        grid[i][j].setValue(value);
    }

    public boolean isGameOver() {
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                if(grid[i][j].isEmpty()) return false;

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int v = grid[i][j].getValue();
                if(i<3 && grid[i+1][j].getValue() == v) return false;
                if(j<3 && grid[i][j+1].getValue() == v) return false;
            }
        }
        return true;
    }
}

