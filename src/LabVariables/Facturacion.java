package LabVariables;

import java.util.Scanner;

public class Facturacion {
    public static void main(String [] args) {

        //! 1. Definicion de variables
        String nombreProducto;
        double precioProducto;
        int cantidadComprar;
        final double impuesto = 0.21;
        double dineroCliente;

        //! Entrada de datos

        Scanner scanner = new Scanner(System.in);

        // Nombre cliente

        System.out.println("\n Escribe tu nombre ");
        String nombreCliente = scanner.nextLine();

        // Nombre producto
        System.out.println("\n Que producto deseas comprar ");
        nombreProducto = scanner.nextLine();

        // Precio del producto
        System.out.println("\n Cual es precio del producto que desea comprar: ");
        precioProducto = scanner.nextDouble();
        scanner.nextLine();

        // Cantidad de productos
        System.out.println("\n Cuantos productos desea comprar: ");
        cantidadComprar = scanner.nextInt();
        scanner.nextLine();

        // Dinero del cliente
        System.out.println("\n Digite la cantidad de dinero que trae en el bolsillo: ");
        dineroCliente = scanner.nextDouble();
        scanner.close();

        //! 3. Logica de negocio

        double subtotal = (precioProducto*cantidadComprar);
        double totalaPagar = (subtotal + (subtotal * impuesto));

        int totalRedondeado = (int) totalaPagar;

        //! 4. Validacion

        boolean compraAprobada = dineroCliente >= totalRedondeado;

        //! 5 Salida
        System.out.println("\nSeñor " + nombreCliente);
        System.out.println("\nUsted realizo la compra de " +nombreProducto);
        System.out.println("\nPor un valor de " + totalRedondeado);
        System.out.println("\n ¿ La compra ha sido aprobada ? " + compraAprobada);

    }
}
