package deitel134.negocio;

public class Fecha {
    private int mes, dia, anio;

    public Fecha(int mes, int dia, int anio) {
        setMes(mes);
        setDia(dia);
        setAnio(anio);
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes=mes;
        }else{
            System.out.println("El mes ingresado no esta dentro del rango permitido (1-12)");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia >= 1 && dia <= 31){
            this.dia = dia;

        }else {
            System.out.println("El dia ingresado no esta dentro del rango permitido (1-31)");
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio >= 1900 && anio <= 2026) {
            this.anio = anio;
        }else {
            System.out.println("El anio ingresado no esta dentro del rango permitido (1900-2026)");
        }
    }

    public void mostrarFecha(int dia, int mes, int anio){
        System.out.println(getMes()+"/"+getDia()+"/"+getAnio());
    }
}
