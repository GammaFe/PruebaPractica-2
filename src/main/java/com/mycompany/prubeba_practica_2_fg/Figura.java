package com.mycompany.prubeba_practica_2_fg;

public class Figura {

    public String forma;
    public double largo;
    public double ancho;
    public double alto;
    public double Area;
    public double Volumen;
    public int cont;

// mutadores/ getter y setters
    public double getLargo() {
        return largo;
    }

    public void setLargo(double Largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getArea() {
        return Area;
    }

    public double getVolumen() {
        return Volumen;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public void setVolumen(double Volumen) {
        this.Volumen = Volumen;
    }

// contructor vacio
    public Figura() {
    }
//contructor de los valores de la figura

    public Figura(int cont, String forma, double largo, double ancho, double alto, double Area, double Volumen) {
        this.forma = forma;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.Area = Area;
        this.Volumen = Volumen;
        this.cont = cont;
    }
// metodo para sacar el area

    public double Area(double b, double h) {
        double Area = b * h;
        return Area;
    }
//metodo para sacar el volumen

    public double Volumen(double A, double H) {
        double volumen = A * H;
        return volumen;
    }
// metodo mensaje final con el system override

    @Override
    public String toString() {
        return "Figura " + cont + ": " + forma + ", datos\n"
                + " Area: " + Area + " Volumen: " + Volumen + " \n"
                + "Largo " + largo + " Ancho " + ancho + " Alto " + alto + "\n";

    }
}
