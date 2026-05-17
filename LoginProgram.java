import javax.swing.JOptionPane;

public class LoginProgram {

    public static void main(String[] args) {

        String username = JOptionPane.showInputDialog("Enter Username:");
        String password = JOptionPane.showInputDialog("Enter Password:");

        if (username.equals("Hero") && password.equals("Zero")) {
            JOptionPane.showMessageDialog(null, "Access Granted");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Credentials");
        }

        System.exit(0);
    }
}