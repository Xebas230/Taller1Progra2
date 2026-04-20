package deitel134.interfaz;

import deitel134.negocio.Fecha;

import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {
        int mes, dia, anio;
        Fecha f1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese mes: ");
        mes = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el día: ");
        dia = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el año: ");
        anio = Integer.parseInt(sc.nextLine());

        f1 = new Fecha(mes, dia, anio);
        f1.mostrarFecha(mes, dia, anio);
    }
}
