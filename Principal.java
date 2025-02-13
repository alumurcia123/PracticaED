import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de usuarios que desea ingresar
        System.out.print("Introduce el número de usuarios: ");
        int numeroUsuarios = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer después de nextInt()

        // Crear el array de usuarios
        Usuario[] usuarios = crearArrayUsuarios(numeroUsuarios, scanner);

        // Mostrar los usuarios creados
        System.out.println("\nUsuarios introducidos:");
        for (Usuario usuario : usuarios) {
            usuario.mostrarUsuario(); // Mostrar cada usuario
            System.out.println();
        }

        scanner.close();
    }

    // Método para crear un array de usuarios
    public static Usuario[] crearArrayUsuarios(int numeroUsuarios, Scanner scanner) {
        Usuario[] usuarios = new Usuario[numeroUsuarios];

        // Crear cada usuario a partir de los datos introducidos por el usuario
        for (int i = 0; i < numeroUsuarios; i++) {
            System.out.println("Usuario " + (i + 1));

            // Pedir los datos del usuario
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            // Crear el objeto Usuario y asignarlo al array
            usuarios[i] = new Usuario(nombre, apellidos, email);
        }

        return usuarios;
    }
}
