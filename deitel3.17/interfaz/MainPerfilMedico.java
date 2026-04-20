package deitel317.interfaz;

import deitel317.negocio.PerfilMedico;
import javax.swing.JOptionPane;

public class MainPerfilMedico {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del paciente: ");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del paciente: ");
        int sexo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sexo del paciente, 1 para mujer y 0 para hombre"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dia de nacimiento del paciente: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento del paciente: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año en el que nacio el paciente"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del paciente en kg: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del paciente en cm: "));
        PerfilMedico persona1 = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        String informacion = ("Nombre del paciente: " + persona1.getPrimernombre() + " " +  persona1.getApellido() + "\nSexo: " + persona1.getSexo() + "\nFecha de nacimiento: " + persona1.getDia() + "/" + persona1.getMes()+ "/" + persona1.getAnio() + "\nEdad: " + persona1.calcularEdad() + "\nPeso: " + persona1.getPeso() + " Kg" + "\nAltura: " + persona1.getAltura());
        JOptionPane.showMessageDialog(null, informacion);
        String datosObtenidos = ("El paciente tiene " + persona1.calcularFrecuenciaMax() + " de frecuencia cardiaca maxima" + "\n" + persona1.calcularFrecuenciaEsperada() + "\nEl BMI del paciente es: " + persona1.masaCorporal());
        JOptionPane.showMessageDialog(null, datosObtenidos);
        System.out.println(informacion);
        System.out.println(datosObtenidos);
        String tablaValoresBMI = ("Bajo peso: menos de 18.5 Normal: entre 18.5 y 24.9 \nSobrepeso: entre 25 y 29.9 Obeso: 30 o más");
        JOptionPane.showMessageDialog(null, tablaValoresBMI);
        System.out.println(tablaValoresBMI);
    }
}
