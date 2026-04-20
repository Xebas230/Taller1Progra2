package deitel313.interfaz;

import deitel313.negocio.Empleado;

import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        String nombre, apellido;
        double salario;
        Empleado em1;
        Empleado em2;
        Scanner sc = new Scanner(System.in);

        //leer variables
        System.out.print("Ingrese nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido = sc.nextLine();
        System.out.print("Ingrese el salario: ");
        salario = Double.parseDouble(sc.nextLine());
        //crear objeto
        em1 = new Empleado(nombre, apellido, salario);
        System.out.println("El salario anual del empleado em1 es: "+ em1.getSalario()*12);
        double nuevoSalario1 = em1.getSalario()*1.10;
        em1.setSalario(nuevoSalario1);
        em1.setSalario(em1.getSalario()*1.10);
        System.out.println("Aumento del 10% en el salario anual de em1: "+nuevoSalario1*12);

        //copiar la lectura variables
        System.out.print("Ingrese nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido = sc.nextLine();
        System.out.print("Ingrese el salario: ");
        salario = Double.parseDouble(sc.nextLine());

        em2 = new Empleado(nombre, apellido, salario);
        System.out.println("El salario anual del empleado em2 es: "+ em2.getSalario()*12);
        //aumento del 10%
        double nuevoSalario2 = em2.getSalario()*1.10;

        em2.setSalario(nuevoSalario2);
        em2.setSalario(em2.getSalario()*1.10*12);
        System.out.println("Aumento del 10% en el salario anual em2: "+ nuevoSalario2*12);
    }
}
