import javax.swing.*;

public class registro_usuarios extends JFrame {
    private JPanel login_agregar_usuarios;
    private JTextField nombretextField;
    private JTextField correotextField;
    private JTextField telefonotextField;
    private JTextField direcciontextField;
    private JPasswordField contraseñaField1;
    private JPasswordField contraseña2Field2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public registro_usuarios(){
        setTitle("Formulario de Administrador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setContentPane(login_agregar_usuarios);
        setVisible(true); // Mostrar el formulario
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new registro_usuarios();
        });
    }
}
