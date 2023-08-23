import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaz_1 extends JDialog{
    private JButton administradorButton;
    private JButton cajeroButton;
    private JPanel primer_login;
    public interfaz_1(JFrame parent){
        super(parent);
        setTitle("Farmacia su economia");
        setContentPane(primer_login);
        setMinimumSize(new Dimension(550, 400));
        setModal(true);
        setLocationRelativeTo(parent);


        administradorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cerrar el formulario actual
                interfaz_2 adminForm = new interfaz_2();



            }
        });
        cajeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cerrar el formulario actual
                interfaz_3 adminForm = new interfaz_3();

            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        interfaz_1 myForm = new interfaz_1(null);
    }



}

