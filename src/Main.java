import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        window.add(new Panel());

        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        String msg = "Java implementation of A* search\nTo set the start and the final node click two cell of the grid\nOnce the goal node has been chosen, the G cost and F cost will appear in the cells.\nThe G cost is the distance between the current node and the starting node.\nH cost is the distance between the current node and the goal node.\nF cost is the sum of G and H. \nYou can also put some obstacles between the start node and the end node by clicking on the grid cells.\nHit enter to start the algorithm";
        JOptionPane.showMessageDialog(null, msg, "Tutorial", 1);

    }
}