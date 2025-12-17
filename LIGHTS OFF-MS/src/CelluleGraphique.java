import javax.swing.*;
import java.awt.*;

public class CelluleGraphique extends JButton {
    private final CelluleLumineuse cellule;

    public CelluleGraphique(CelluleLumineuse cellule) {
        this.cellule = cellule;
        this.setBackground(cellule.getEtat() ? Color.YELLOW : Color.GRAY);
        this.setOpaque(true);
        this.setBorderPainted(true);

        this.addActionListener(e -> {
            cellule.activerCellule();
            this.setBackground(cellule.getEtat() ? Color.YELLOW : Color.GRAY);
        });
    }

    public void rafraichir() {
        this.setBackground(cellule.getEtat() ? Color.YELLOW : Color.GRAY);
    }
}
