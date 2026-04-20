package deitel315.negocio;

public class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;

        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }

        if (precioPorArticulo > 0.0) {
            this.precioPorArticulo = precioPorArticulo;
        } else {
            this.precioPorArticulo = 0.0;
        }
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }
    public String getNumeroPieza() {
        return numeroPieza;}

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }
    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setPrecioPorArticulo(double precio) {
        if (precio > 0.0) {
            this.precioPorArticulo = precio;
        } else {
            this.precioPorArticulo = 0.0;
        }
    }
    public double getPrecioPorArticulo() {
        return precioPorArticulo;}

    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }
}