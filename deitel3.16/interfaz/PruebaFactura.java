package deitel316.interfaz;

import deitel316.negocio.Factura;

import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número de pieza: ");
        String num = sc.nextLine();

        System.out.print("Ingrese descripción: ");
        String desc = sc.nextLine();

        System.out.print("Ingrese cantidad: ");
        int cant = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese precio unitario: ");
        double precio = Double.parseDouble(sc.nextLine());

        // Crear objeto con los datos ingresados
        Factura f1 = new Factura(num, desc, cant, precio);

        // Mostrar resultados
        System.out.println("\n--- DETALLE DE FACTURA ---");
        System.out.println("Pieza #: " + f1.getNumeroPieza());
        System.out.println("Descripción: " + f1.getDescripcionPieza());
        System.out.println("Cantidad: " + f1.getCantidad());
        System.out.println("Precio Unitario: " + f1.getPrecioPorArticulo());
        System.out.println("Total a pagar: " + f1.obtenerMontoFactura());
    }
}