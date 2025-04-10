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
        double valorSalarioMinimo = 0;
        int auxilioTransporte = 200000;

        System.out.println("Ingrese su usuario:");
        usuarioEmpleado = sc.nextLine();
        System.out.println("Ingrese su contraseña:");
        contrasenaUsuario = sc.nextLine();

        if (usuarioEmpleado.equals("admin") && contrasenaUsuario.equals("admin123")) {
            System.out.println("Ha ingresado de forma correcta.");
            System.out.println("Ingrese el nombre del empleado");
            nombreEmpleado = sc.nextLine();
            System.out.println("Ingrese su documento de identidad");
            documentoIdentidad = sc.nextLine();
            System.out.println("Ingrese su dia de descanso (Lunes a Viernes): ");
            diaDescanso = sc.nextLine();
            System.out.println("Ingrese el valor de la hora");
            valorHora = sc.nextDouble();
            System.out.println("Ingrese la cantidad de horas trabajadas");
            cantidadHora = sc.nextDouble();
            salarioBruto = valorHora * cantidadHora;
            System.out.println("Ingrese el valor del salario minimo para este año: ");
            valorSalarioMinimo = sc.nextDouble();
            if (salarioBruto > (valorSalarioMinimo*2)){
                bonificacionEmpleado = 0;
                auxilioTransporte = 0;
            }
            else {
                bonificacionEmpleado = salarioBruto*0.1;
                auxilioTransporte = 200000;
            }
            retencionSalud = salarioBruto * 0.04;
            retencionPension = salarioBruto * 0.04;
            salarioNeto = salarioBruto + retencionPension + retencionSalud + bonificacionEmpleado + auxilioTransporte;
            System.out.println("Detalle de nómina empleado");
            System.out.println("El empleado" + nombreEmpleado + " con documento de identidad " + documentoIdentidad + " tiene el siguiente detalle :\nSalario Bruto: " + salarioBruto + "\nDeduccion por salud: " + retencionSalud + "\nDeduccion por pension: " + retencionPension + "\nAuxilio Transporte: " + auxilioTransporte + "\nBonificación " + bonificacionEmpleado);            }
            else {
            System.out.println("Error de credenciales");
        }
        sc.close();
        /*Otra Forma de aplicar condicionales **/       
    }
}
