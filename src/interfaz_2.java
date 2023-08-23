import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaz_2 extends JFrame {
    private JPanel interfaz_administrador;

    public interfaz_2() {
        setTitle("Formulario de Administrador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar este formulario
        setSize(600, 400); // Tamaño del formulario
        setLocationRelativeTo(null); // Centrar en la pantalla
        setContentPane(interfaz_administrador); // Establecer el panel como contenido

        // Aquí puedes agregar más componentes y configuraciones específicas para el formulario del administrador

        setVisible(true); // Mostrar el formulario

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new interfaz_2();
        });
    }
}
