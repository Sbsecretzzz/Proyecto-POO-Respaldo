package Personas;

public class Vendedor extends Empleado {

    

    public Vendedor(String dni, String nombres, String apellidoPaterno,
                    String apellidoMaterno, String direccion,
                    String telefono, String correo,
                    String usuario, String contrasena) {

        super(dni, nombres, apellidoPaterno, apellidoMaterno, direccion,
              telefono, correo, usuario, contrasena, "VENDEDOR");
    }

}
