package org.browniesygalletas.modelo;

public class Domicilio {
    private int idDomicilio;
    private SectoresDomicilios sector;
    private double precioSector;
    public static int ultimoIdDomicilio;

    public Domicilio(){
        this.idDomicilio= ++ultimoIdDomicilio;
    }

    public Domicilio(SectoresDomicilios sector, double precioSector) {
        this();
        this.sector = sector;
        this.precioSector = precioSector;
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public SectoresDomicilios getSector() {
        return sector;
    }

    public void setSector(SectoresDomicilios sector) {
        this.sector = sector;
    }

    public double getPrecioSector() {
        return precioSector;
    }

    public void setPrecioSector(double precioSector) {
        this.precioSector = precioSector;
    }
}
