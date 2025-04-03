import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definición de las variables
        Scanner sc = new Scanner(System.in);

        // Variables para almacenar la información del empleado
        String nombreEmpleado = "";
        String documentoIdentidad = "";
        String diaDescanso = "";
        String usuarioEmpleado = "";
        String contrasenaUsuario = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double retencionSalud = 0;
        double retencionPension = 0;
        double valorHora = 0;
        double cantidadHora = 0;
        double bonificacionEmpleado = 0;
        int auxilioTransporte = 200000;

        System.out.println("Ingrese su usuario:");
        usuarioEmpleado = sc.nextLine();
        System.out.println("Ingrese su contraseña:");
        contrasenaUsuario = sc.nextLine();

        if (usuarioEmpleado.equals("admin") && contrasenaUsuario.equals("admin123")) {
            System.out.println("Ha ingresado de forma correcta.");
            } else {
            System.out.println("Error de credenciales");
        }
        sc.close();
    }
}
