import java.util.Random;

public class Partie {

    private static final int SIZE = 5; 
    private boolean[][] lights = new boolean[SIZE][SIZE];
    private int score = 0;

    public Partie() {
        initGame();
    }

    
    public void initGame() {
        Random rand = new Random();
        score = 0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                lights[i][j] = rand.nextBoolean();
            }
        }
    }

   
    public void toggleColumn(int col) {
        score++;
        for (int i = 0; i < SIZE; i++) {
            lights[i][col] = !lights[i][col];
        }
    }

   
    public void toggleRow(int row) {
        score++;
        for (int j = 0; j < SIZE; j++) {
            lights[row][j] = !lights[row][j];
        }
    }

   
    public void toggleDiagonalDesc() {
        score++;
        for (int i = 0; i < SIZE; i++) {
            lights[i][i] = !lights[i][i];
        }
    }

    
    public void toggleDiagonalAsc() {
        score++;
        for (int i = 0; i < SIZE; i++) {
            lights[i][SIZE - 1 - i] = !lights[i][SIZE - 1 - i];
        }
    }

    // Vérifie si toutes les lumières sont éteintes
    public boolean checkWin() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (lights[i][j]) return false;
            }
        }
        return true;
    }

    
    public void afficherGrille() {
        System.out.println("Score : " + score);
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(lights[i][j] ? "X " : "O ");
            }
            System.out.println();
        }
        System.out.println();
    }

    
    public int getScore() {
        return score;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
