import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Node extends JButton implements ActionListener {

    Node parent;
    int col, row, gCost, hCost, fCost;
    boolean start, goal, solid, open, checked;
    static int clicked = 0;

    Panel p;

    public Node(int col, int row, Panel p) {
        this.col = col;
        this.row = row;
        this.p = p;

        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        addActionListener(this);

        setFocusable(false);
    }

    public void reset(){
        start = false;
        goal = false;
        solid = false;
        open = false;
        checked = false;

        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        addActionListener(this);

        setFocusable(false);

        parent.reset();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (clicked == 0) {
            clicked++;
            p.setStartNode(col, row);
        } else if (clicked == 1) {
            p.setGoalNode(col, row);
            clicked++;
            p.setCostOnNode();
        } else {
            p.setSolidNode(col, row);
        }

    }

    public void setAsStart() {
        setBackground(Color.BLUE);
        setForeground(Color.WHITE);
        setText("Start");
        start = true;
    }

    public void setAsGoal() {
        setBackground(Color.MAGENTA);
        setForeground(Color.BLACK);
        setText("Goal");
        goal = true;
    }
    
    public void setAsSolid() {
        setBackground(Color.BLACK);
        setForeground(Color.BLACK);
        solid = true;
    }

    public void setAsOpen() {
        open = true;
    }

    public void setAsChecked() {
        if (start == false && goal == false) {
            setBackground(Color.ORANGE);
            setForeground(Color.BLACK);
        }
        checked = true;
    }

    public void setAsPath() {
        setBackground(Color.GREEN);
        setForeground(Color.BLACK);
    }
}