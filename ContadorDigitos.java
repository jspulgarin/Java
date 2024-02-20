import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Por favor, ingrese un número entero: ");


        int numero = scanner.nextInt();


        int numeroPositivo = Math.abs(numero);


        int contadorCifras = 0;


        while (numeroPositivo != 0) {
            numeroPositivo /= 10;
            contadorCifras++;
        }


        System.out.println("El número ingresado tiene " + contadorCifras + " cifras.");


        scanner.close();
    }
}
