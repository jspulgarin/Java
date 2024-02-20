import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese su nombre: ");


        String nombre = scanner.nextLine();


        System.out.println("¡Hola, " + nombre + "! Bienvenido.");


        scanner.close();
    }
}
