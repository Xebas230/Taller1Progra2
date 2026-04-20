package deitel3_16.negocio;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int dia, mes, anio;

    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDia(int dia) {
        if(dia >= 1 && dia <= 31){
            this.dia = dia;

        }else {
            System.out.println("El día ingresado no esta dentro del rango permitido (1-31)");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes=mes;
        }else{
            System.out.println("El mes ingresado no esta dentro del rango permitido (1-12)");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setAnio(int anio) {
        if (anio >= 1900 && anio <= 2026) {
            this.anio = anio;
        }else {
            System.out.println("El año ingresado no esta dentro del rango permitido (1900-2026)");
        }
    }

    public int getAnio() {
        return anio;
    }

    public int calcularEdad() {
        if (anio<0){
            return 2026 - anio;
        }
        return  0;
    }

    public int calcularFrecuenciaMax() {
        if (calcularEdad()>0){
            return 220 - calcularEdad();
        }
        return 0;
    }

    public String calcularFrecuenciaEsperada() {
        int max = calcularFrecuenciaMax();
        if (max>0){
            return (max * 0.50) + " - " + (max * 0.85) + " pulsos por minuto";
        }
        return "";
    }
}