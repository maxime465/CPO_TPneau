import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class LightOff extends JFrame {

    private static final int TAILLE = 5;

    private boolean[][] grille;
    private JButton[][] cellules;
    private int nbCoups;
    private JLabel labelCoups;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LightOff::new);
    }

    public LightOff() {
        setTitle("Lights Off");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        grille = new boolean[TAILLE][TAILLE];
        cellules = new JButton[TAILLE][TAILLE];

        
        JPanel panelHaut = new JPanel(new GridLayout(1, TAILLE + 1));
        panelHaut.add(new JLabel("")); // coin vide

        for (int j = 0; j < TAILLE; j++) {
            JButton btnCol = new JButton("C" + (j + 1));
            final int col = j;
            btnCol.addActionListener(e -> jouerColonne(col));
            panelHaut.add(btnCol);
        }

        add(panelHaut, BorderLayout.NORTH);

        JPanel centre = new JPanel(new GridLayout(TAILLE, TAILLE + 1));

        for (int i = 0; i < TAILLE; i++) {

            JButton btnLigne = new JButton("L" + (i + 1));
            final int ligne = i;
            btnLigne.addActionListener(e -> jouerLigne(ligne));
            centre.add(btnLigne);

            for (int j = 0; j < TAILLE; j++) {
                JButton cell = new JButton();
                cell.setEnabled(false);
                cell.setOpaque(true);
                cell.setBorderPainted(false);
                cellules[i][j] = cell;
                centre.add(cell);
            }
        }

        add(centre, BorderLayout.CENTER);

        JPanel bas = new JPanel();
        labelCoups = new JLabel("Coups : 0");
        JButton btnRejouer = new JButton("Rejouer");
        btnRejouer.addActionListener(e -> initialiserPartie());
        bas.add(labelCoups);
        bas.add(btnRejouer);
        add(bas, BorderLayout.SOUTH);

        initialiserPartie();
        setVisible(true);
    }


    private void initialiserPartie() {
        nbCoups = 0;
        labelCoups.setText("Coups : 0");

        for (int i = 0; i < TAILLE; i++) {
            for (int j = 0; j < TAILLE; j++) {
                grille[i][j] = false;
            }
        }

        
        Random rand = new Random();
        for (int k = 0; k < 10; k++) {
            if (rand.nextBoolean()) {
                jouerLigneInterne(rand.nextInt(TAILLE));
            } else {
                jouerColonneInterne(rand.nextInt(TAILLE));
            }
        }

        rafraichir();
    }

    private void jouerLigne(int ligne) {
        jouerLigneInterne(ligne);
        finDeCoup();
    }

    private void jouerColonne(int colonne) {
        jouerColonneInterne(colonne);
        finDeCoup();
    }

    private void jouerLigneInterne(int ligne) {
        for (int j = 0; j < TAILLE; j++) {
            grille[ligne][j] = !grille[ligne][j];
        }
    }

    private void jouerColonneInterne(int colonne) {
        for (int i = 0; i < TAILLE; i++) {
            grille[i][colonne] = !grille[i][colonne];
        }
    }

    private void finDeCoup() {
        nbCoups++;
        labelCoups.setText("Coups : " + nbCoups);
        rafraichir();

        if (toutesEteintes()) {
            JOptionPane.showMessageDialog(this,
                    "Victoire en " + nbCoups + " coups !");
        }
    }

    private boolean toutesEteintes() {
        for (int i = 0; i < TAILLE; i++) {
            for (int j = 0; j < TAILLE; j++) {
                if (grille[i][j]) return false;
            }
        }
        return true;
    }

    private void rafraichir() {
        for (int i = 0; i < TAILLE; i++) {
            for (int j = 0; j < TAILLE; j++) {
                cellules[i][j].setBackground(
                        grille[i][j] ? Color.YELLOW : Color.DARK_GRAY
                );
            }
        }
    }
}

