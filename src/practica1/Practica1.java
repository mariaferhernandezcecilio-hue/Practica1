package practica1;
import javax.swing.*;

/**
 *
 * @author maria
 */
public class Practica1 extends JFrame {
    JLabel Nombre, Edad, Correo, Usuario, Contrasena, Informacion;
    JTextField TNombre, TEdad, TCorreo, TUsuario;
    JPasswordField Contraseña;
    JTextArea TInformacion;
    JScrollBar Vertical;
    JScrollBar Horizontal;
    JButton Nuevo, Agregar;
    
    public Practica1() {
        setTitle("Práctica");
        setSize(800, 450);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        elementos();
        setVisible(true);
    }
    
    public void elementos() {
   
        Nombre = new JLabel("Nombre:");
        Nombre.setBounds(30, 40, 80, 25);
        Edad = new JLabel("Edad:");
        Edad.setBounds(30, 80, 80, 25);
        Correo = new JLabel("Correo:");
        Correo.setBounds(30, 120, 80, 25);
        Usuario = new JLabel("Usuario:");
        Usuario.setBounds(30, 160, 80, 25);
        Contrasena = new JLabel("Contraseña:");
        Contrasena.setBounds(30, 200, 80, 25);
        
        TNombre = new JTextField();
        TNombre.setBounds(120, 40, 180, 25); 
        TEdad = new JTextField();
        TEdad.setBounds(120, 80, 180, 25);
        TCorreo = new JTextField();
        TCorreo.setBounds(120, 120, 180, 25);
        TUsuario = new JTextField();
        TUsuario.setBounds(120, 160, 180, 25);
        
        Contraseña = new JPasswordField();
        Contraseña.setBounds(120, 200, 180, 25);
        
        Informacion = new JLabel("Informacion");
        Informacion.setBounds(350, 40, 100, 25);
        
        TInformacion = new JTextArea();
        TInformacion.setBounds(350, 75, 330, 130);
        
        Vertical = new JScrollBar(JScrollBar.VERTICAL,0, 10, 0, 100);
        Vertical.setBounds(680, 70, 20, 130);
        
        Horizontal = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 100);
        Horizontal.setBounds(350, 210, 330, 20);
        
        
        Nuevo = new JButton("Nuevo");
        Nuevo.setBounds(180, 265, 100, 35);
        Agregar = new JButton("Agregar");
        Agregar.setBounds(400, 265, 100, 35);
   
        add(Nombre);
        add(Edad);
        add(Correo);
        add(Usuario);
        add(Contrasena);
        
        add(TNombre);
        add(TEdad);
        add(TCorreo);
        add(TUsuario);
        
        add(Contraseña);
        add(TInformacion);
        add(Informacion);
        add(Vertical);
        add(Horizontal);
        add(Nuevo);
        add(Agregar);
    }
    
    public static void main(String args[]) {
    Practica1 Practica= new Practica1();
    }
}
