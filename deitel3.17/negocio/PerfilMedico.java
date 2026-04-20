package deitel317.negocio;

public class PerfilMedico {
    private String Primernombre, apellido, sexo;
    private int dia, mes, anio;
    private double altura, peso;

    public PerfilMedico(String primernombre, String apellido, int sexo, int dia, int mes, int anio, double altura, double peso) {
        Primernombre = primernombre;
        this.apellido = apellido;
        setSexo(sexo);
        setDia(dia);
        setMes(mes);
        setAnio(anio);
        setPeso(peso);
        setAltura(altura);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0){
            this.peso = peso;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0 && altura < 300){
            this.altura = altura;
        }
    }

    public int getAnio() {
        return anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String getSexo() {
        return sexo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPrimernombre() {
        return Primernombre;
    }

    public void setPrimernombre(String primernombre) {
        Primernombre = primernombre;
    }

    public void setSexo(int sexo) {
        if (sexo == 1){
            System.out.println("Femenino");
            this.sexo = "femenino";
        }else if (sexo == 0){
            System .out.println("Masculino");
            this.sexo = "masculino";
        }else{
            System.out.println("Numero invalido");
        }
    }

    public void setDia(int dia) {
        if(dia >= 1 && dia <= 31){
            this.dia = dia;

        }else {
            System.out.println("El dia ingresado no esta dentro del rango permitido (1-31)");
        }
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes=mes;
        }else{
            System.out.println("El mes ingresado no esta dentro del rango permitido (1-12)");
        }
    }

    public void setAnio(int anio) {
        if (anio >= 1900 && anio <= 2026) {
            this.anio = anio;
        }else {
            System.out.println("El anio ingresado no esta dentro del rango permitido (1900-2026)");
        }
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

    public double masaCorporal(){
        double alturaMetros = altura / 100;
        double alturaCuadrado = alturaMetros * alturaMetros;
        return (peso/alturaCuadrado);
    }
}

