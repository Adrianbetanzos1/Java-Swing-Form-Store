import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Productos extends JFrame{

    private JPanel mainPanel;
    private JTextField nombreTextField;

    private JComboBox tipoArticuloComboBox;
    private JComboBox cantidadComboBox;

    private JRadioButton superAlimentosRadioButton;
    private JRadioButton tienditaRadioButton;
    private JRadioButton MercadoRadioButton;

    private JCheckBox coatzacoalcosCheckBox;
    private JCheckBox villahermosaCheckBox;
    private JCheckBox chiapasCheckBox;
    private JCheckBox oaxacaCheckBox;
    private JCheckBox MinatitlaCheckBox;
    private JCheckBox CiudadMexicoCheckBox;
    private final ButtonGroup botones;


    private JLabel sucursalLabel;
    private JLabel proveedorLabel;
    private JLabel cantidadLabel;
    private JLabel ArticuloLabel;
    private JLabel tipoArticuloLabel;

    private JButton borrarButton;
    private JButton confirmarButton;

    public static String nombreArticulo = "";
    public static String tipoArticulo = "";
    public static String cantidadInt = " ";
    public static String proveedor = "";
    public static String sucursal = "";




    public Productos(){
        this.setContentPane(mainPanel);
        this.setTitle("Abarrotes 'El Adrian' ");
        this.setSize(1300,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        botones = new ButtonGroup();
        botones.add(superAlimentosRadioButton);
        botones.add(tienditaRadioButton);
        botones.add(MercadoRadioButton);


        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obtenerNombreArticulo(e);
                obtenerTipoArticulo(e);
                obtenerCantidad(e);
                verificarProveedor(e);
                verificarSucursal(e);
                mostrarDatos();
            }
        });

        MercadoRadioButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                obtenerProveedor(MercadoRadioButton.getLabel());
            }
        });
        superAlimentosRadioButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                obtenerProveedor(superAlimentosRadioButton.getLabel());
            }
        });
        tienditaRadioButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                obtenerProveedor(tienditaRadioButton.getLabel());
            }
        });


        coatzacoalcosCheckBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                obtenerSucursal(coatzacoalcosCheckBox.getLabel());
            }
        });
        chiapasCheckBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                obtenerSucursal(chiapasCheckBox.getLabel());
            }
        });
        villahermosaCheckBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                obtenerSucursal(villahermosaCheckBox.getLabel());
            }
        });
        oaxacaCheckBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                obtenerSucursal(oaxacaCheckBox.getLabel());
            }
        });
        MinatitlaCheckBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                obtenerSucursal(MinatitlaCheckBox.getLabel());
            }
        });
        CiudadMexicoCheckBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                obtenerSucursal(CiudadMexicoCheckBox.getLabel());
            }
        });

        //BORRAR DATOS
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borrarDatos(e);
            }
        });
    }

    public void obtenerNombreArticulo(ActionEvent evt){
        if(nombreTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese un producto...", "ARTÍCULO", JOptionPane.WARNING_MESSAGE);
        }
        nombreArticulo = nombreTextField.getText();
    }

    public void obtenerCantidad(ActionEvent evet){
        cantidadInt = cantidadComboBox.getSelectedItem().toString();
        switch (cantidadInt) {
            case "1":

                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;
            case "5":

                break;
            case "6":

                break;
            case "7":

                break;
            case "8":

                break;
            case "9":

                break;
            case "10":

                break;
            default:
                JOptionPane.showMessageDialog(null, "Seleccione una opción...", "CANTIDAD", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }

    public void obtenerTipoArticulo(ActionEvent evt){
        tipoArticulo = tipoArticuloComboBox.getSelectedItem().toString();
        switch (tipoArticulo) {
            case "Carnes":
                break;
            case "Frutas":
                break;
            case "Verduras":
                break;
            case "Pescado":
                break;
            case "Dulces":
                break;
            default:
                JOptionPane.showMessageDialog(null, "Selecciona una opción...", "PRODUCTO", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }


    public void obtenerProveedor(String nombreProveedor){
        proveedor = nombreProveedor;
    }

    public void verificarProveedor(ActionEvent evt){
        if(proveedor.equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione una opción...",  "PROVEEDOR", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void obtenerSucursal(String nombreSucursal){
        if(sucursal.equals("")){
            sucursal = nombreSucursal;
        }else{
            sucursal +=  ", " + nombreSucursal;
        }
    }

    public void verificarSucursal(ActionEvent evt){
        if(sucursal.equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione una opción...", "SUCURSAL", JOptionPane.WARNING_MESSAGE);
        }
    }

    //MOSTRAR DATOS
    public void mostrarDatos(){
        if(nombreArticulo.isEmpty() || tipoArticulo.isEmpty() || cantidadInt.isEmpty() || proveedor.isEmpty() || sucursal.isEmpty()){
            JOptionPane.showMessageDialog(null, "DATOS INCOMPLETOS, RELLENAR...", "NO SE PUEDE CONTINUAR" , JOptionPane.INFORMATION_MESSAGE);
        }else{
           VentanaConfirmacion pantallaSiguiente = new VentanaConfirmacion();
            setVisible(false);

        }
    }

    public void borrarDatos(ActionEvent evt){
        nombreTextField.setText("");
        tipoArticuloComboBox.setSelectedItem("Seleccione una opción");
        cantidadComboBox.setSelectedItem("1");
        cantidadInt = " ";
        botones.clearSelection();
        coatzacoalcosCheckBox.setSelected(false);
        villahermosaCheckBox.setSelected(false);
        MinatitlaCheckBox.setSelected(false);
        chiapasCheckBox.setSelected(false);
        oaxacaCheckBox.setSelected(false);
        CiudadMexicoCheckBox.setSelected(false);
        JOptionPane.showMessageDialog(null, "Se han eliminado los datos", "DATOS ELIMINADOS", JOptionPane.INFORMATION_MESSAGE);
    }
}
