package deitel312.interfaz;

import deitel312.negocio.FrecuenciasCardiacas;

import javax.swing.JOptionPane;

public class PruebaFrecuencias {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
        String apellido = JOptionPane.showInputDialog("Ingrese apellido: ");
        int d = Integer.parseInt(JOptionPane.showInputDialog("Día de nacimiento: "));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Mes de nacimiento: "));
        int a = Integer.parseInt(JOptionPane.showInputDialog("Año de nacimiento: "));

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, d, m, a);

        System.out.println("\n----Datos de la Persona----");
        System.out.println("Nombre: " + persona.getNombre() + " " + persona.getApellido());
        System.out.println("Nacido el: " + persona.getDia() + "/" + persona.getMes() + "/" + persona.getAnio());
        System.out.println("Edad actual: " + persona.calcularEdad() + " años");
        System.out.println("Frecuencia Cardiaca Máxima: " + persona.calcularFrecuenciaMax());
        System.out.println("Rango de Frecuencia Esperada: " + persona.calcularFrecuenciaEsperada());
    }
}
