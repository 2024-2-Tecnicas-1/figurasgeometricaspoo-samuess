package com.mycompany.figurasgeometricas;

public class FigurasGeometricas {
    private String nombreFigura;
    private String colorFigura;

    public FigurasGeometricas(String nombreFigura, String colorFigura) {
        this.nombreFigura = nombreFigura;
        this.colorFigura = colorFigura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public String getColorFigura() {
        return colorFigura;
    }

    public void setColorFigura(String colorFigura) {
        this.colorFigura = colorFigura;
    }
}
