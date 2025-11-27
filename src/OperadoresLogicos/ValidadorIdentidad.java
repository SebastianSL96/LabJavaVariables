package OperadoresLogicos;

import java.util.Scanner;

public class ValidadorIdentidad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //! Declarar variables

        String nombreUsuario;
        int edad;
        double saldoCuenta;
        boolean premium;

        //! Establecer valores con inputs

        System.out.println("Digite su nombre: ");
        nombreUsuario = scanner.nextLine();

        System.out.println("Digite su edad: ");
        edad = scanner.nextInt();

        System.out.println("Digite el saldo de su cuenta");
        saldoCuenta = scanner.nextDouble();

        System.out.println("¿ Usted tiene su cuenta premium activa? (Escriba si o no segun el caso)");
        String respuestaPremium = scanner.next();
        boolean esPremium = respuestaPremium.equalsIgnoreCase("si");

        scanner.close();

        //! Validacion

        boolean accesoExculsivo = (edad >= 18) && esPremium;

        boolean calificaPromocion = (saldoCuenta > 1000) || (edad < 25);

        boolean perfilIncompleto = (saldoCuenta == 0 ) || !nombreUsuario.equals(("invitado"));

        boolean perfilActivo = (!perfilIncompleto && accesoExculsivo) || calificaPromocion;

        System.out.println("\nUsted tiene acceso exclusivo: " + accesoExculsivo);
        System.out.println("\nCalifica la promoción: " + calificaPromocion);
        System.out.println("\nPerfil incompleto: " + perfilIncompleto);
        System.out.println("\nPerfil activo total: " + perfilActivo);

















    }
}
