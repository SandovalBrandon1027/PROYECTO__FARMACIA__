import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaz_2 extends JFrame {
    private JPanel interfaz_administrador;
    private JButton ingresarProductoButton;
    private JButton agregarUsuarioButton;
    private JButton revisarVentasButton;

    public interfaz_2() {
        setTitle("Formulario de Administrador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setContentPane(interfaz_administrador);






        ingresarProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cerrar el formulario actual
            }
        });

        agregarUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cerrar el formulario actual
            }
        });
        setVisible(true); // Mostrar el formulario
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new interfaz_2();
        });
    }
}
