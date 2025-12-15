/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lights.off.ms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class LightsOff extends JFrame {

    private static final int SIZE = 5;
    private JButton[][] buttons = new JButton[SIZE][SIZE];
    private boolean[][] lights = new boolean[SIZE][SIZE];
    private int score = 0;
    private JLabel scoreLabel;

  