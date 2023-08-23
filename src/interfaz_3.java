import javax.swing.*;

public class interfaz_3 extends JFrame {

    private JPanel interfaz_cajero;
    private JLabel text;
    public interfaz_3() {
        setTitle("Farmacia su economia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar este formulario
        setSize(600, 400); // Tamaño del formulario
        setLocationRelativeTo(null); // Centrar en la pantalla
        setContentPane(interfaz_cajero); // Establecer el panel como contenido

        // Aquí puedes agregar más componentes y configuraciones específicas para el formulario del administrador

        setVisible(true); // Mostrar el formulario
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new interfaz_3();
        });
    }
}
