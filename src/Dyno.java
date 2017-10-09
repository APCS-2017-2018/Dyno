import javax.swing.JOptionPane;

/**
 *
 */


/**
 * @author john
 *
 */
public class Dyno {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] choices = {"Petris"};
        JOptionPane.showInputDialog(null, "Game Selection","Choose a game.", JOptionPane.QUESTION_MESSAGE, null,choices,choices[0]);
    }

}
