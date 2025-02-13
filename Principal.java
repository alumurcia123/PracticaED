#Hola mundo
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}

import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        // Mostrar el saludo y la fecha/hora actual
        System.out.println("Hola Mundo");
        System.out.println("La fecha y hora actual es: " + obtenerFechaHoraActual());
    }

    // Método que devuelve la fecha y hora actual
    public static String obtenerFechaHoraActual() {
        // Obtener la fecha y hora actual
        Date ahora = new Date();
        
        // Formatear la fecha y hora en un formato legible
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        // Retornar la fecha y hora como una cadena de texto
        return formato.format(ahora);
    }
}


