package code;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener{
    private final int B_WIDTH=300; 
    private final int B_HEIGHT=300;
    private final int DOT_SIZE=10;
    private final int ALL_DOTS=900;
    private final int RAND_pos=29;
    private final int DELAY=140;

}