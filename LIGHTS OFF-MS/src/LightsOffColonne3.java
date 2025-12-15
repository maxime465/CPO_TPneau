import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class LightsOffColonne3 extends JFrame {

    private static final int SIZE = 5;
    private JButton[][] buttons = new JButton[SIZE][SIZE];
    private boolean[][] lights = new boolean[SIZE][SIZE];
    private int score = 0;
    private JLabel scoreLabel;

    public LightsOffColonne3() {
        setTitle("Lights Off - 3 Cases par Colonne");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel gridPanel = new JPanel(new GridLayout(SIZE, SIZE));
        scoreLabel = new JLabel("Nombre de coups : 0", SwingConstants.CENTER);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JButton resetButton = new JButton("Nouvelle partie");
        resetButton.addActionListener(e -> initGame());

        add(scoreLabel, BorderLayout.NORTH);
        add(gridPanel, BorderLayout.CENTER);
        add(resetButton, BorderLayout.SOUTH);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                JButton btn = new JButton();
                btn.setOpaque(true);
                btn.setBorderPainted(false);

                int row = i;
                int col = j;
                btn.addActionListener(e -> toggleColumn(row, col));

                buttons[i][j] = btn;
                gridPanel.add(btn);
            }
        }

        initGame();
        setVisible(true);
    }

    private void initGame() {
        Random rand = new Random();
        score = 0;
        scoreLabel.setText("Nombre de coups : 0");

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                lights[i][j] = rand.nextBoolean();
                updateButton(i, j);
            }
        }
    }

  