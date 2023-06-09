package ejercicio1;

import java.awt.*;

public class Ej91Main extends Frame {

    public Ej91Main() {
    Frame login = new Frame("Login");
        login.setSize(400,350);
        login.setVisible(true);
        login.setLayout(null);


    Label usuario = new Label("usuario: ");
        usuario.setBounds(90,100,50,32);
        usuario.setBackground(Color.white);
        usuario.setVisible(true);
        login.add(usuario);

    Label contrasena = new Label("Contraseña: ");
        contrasena.setBounds(80,170,70,32);
        contrasena.setBackground(Color.white);
        contrasena.setVisible(true);
        login.add(contrasena);


    TextField nombre = new TextField("");
        nombre.setBounds(170,105,90,22);
        nombre.setVisible(true);
        login.add(nombre);

    TextField contrasena2 = new TextField("");
        contrasena2.setBounds(170,175,90,22);
        contrasena2.setVisible(true);
        login.add(contrasena2);


    Button acceso = new Button("Aceptar");
        acceso.setBounds(90,255,70,22);
        acceso.setVisible(true);
        login.add(acceso);

    Button cancelar = new Button("Cancelar");
        cancelar.setBounds(190,255,70,22);
        cancelar.setVisible(true);
        login.add(cancelar);
}


    public static void main(String[] args) {

        Ej91Main prueba = new Ej91Main();
    }
}
