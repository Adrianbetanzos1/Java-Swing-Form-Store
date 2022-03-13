import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaConfirmacion extends JFrame{
    private JPanel mainPanel1;
    private JButton cancelarPedidoButton;
    private JButton confirmarPedidoButton;

    private JLabel asignarNombreArticuloLabel;
    private JLabel asignarTipoArticuloLabel;
    private JLabel asignarCantidadLabel;
    private JLabel asignarProveedorLabel;
    private JLabel asignarSucursalLabel;

    public VentanaConfirmacion(){
        this.setContentPane(mainPanel1);
        this.setTitle("Abarrotes 'El Adrian' ");
        this.setSize(1300,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        cancelarPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = JOptionPane.showConfirmDialog(null, "¿DESEA SALIR?", "CONFIRMAR SALIDA", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                if(n == 0){
                    System.exit(0);
                }
            }
        });



        confirmarPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"SU PEDIDO HA SIDO REALIZADO");
                setVisible(false);
            }
        });

        copiarDatos();
    }

    public void copiarDatos(){
        asignarNombreArticuloLabel.setText(Productos.nombreArticulo);
        asignarTipoArticuloLabel.setText(Productos.tipoArticulo);
        asignarCantidadLabel.setText(String.valueOf(Productos.cantidadInt));
        asignarProveedorLabel.setText(Productos.proveedor);
        asignarSucursalLabel.setText(Productos.sucursal);

    }
}
