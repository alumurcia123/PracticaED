public class Usuario {
    // Atributos de la clase Usuario
    public String nombre;
    public String apellidos;
    public String email;

    // Constructor de la clase Usuario
    public Usuario(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    // Método para mostrar los detalles de un usuario
    public void mostrarUsuario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Email: " + email);
    }
}

