package com.mycompany.prubeba_practica_2_fg;

import java.util.ArrayList;
import java.util.Scanner;

public class Prubeba_Practica_2_Fg {

    public static void main(String[] args) {
        Scanner CAT = new Scanner(System.in);
        ArrayList<Figura> fig = new ArrayList();
        //  Figura inicio = new Figura(0,null, 0, 0, 0, 0, 0);
        //  fig.add(inicio);
        int cont = 1;
        while (true) {
            System.out.println("Desea ingresar una figura? 1/si 2/no ");
            int resp = CAT.nextInt();
            if (resp == 1) {
                String forma = "";
                double Area;
                double Volumen;
                System.out.println("\n---Todas las figuras se asumiran como prismas---");
                CAT = new Scanner(System.in);
                System.out.println("Ingrese 1 para trangulo,2 para cuadrado y 3 para rectangulo");
                int caso = CAT.nextInt();
                System.out.println("Ingrese el Largo");
                double b = CAT.nextInt();
                System.out.println("Ingrese la altura");
                double H = CAT.nextInt();
                System.out.println("Ingrese el ancho");
                double h = CAT.nextInt();
                //Switch para para calcuar el area de las formas
                switch (caso) {
                    case 1:

                        forma = "Trinagulo";
                        Figura calc = new Figura();
                        Area = calc.Area(b, h) / 2;// se le divide por dos ya que es un triangulo
                        Volumen = calc.Volumen(Area, H);
                        Figura medidas = new Figura(cont, forma, b, h, H, Area, Volumen);// contructor cargado que asigna los valores
                        fig.add(medidas);
                        cont = cont + 1;

                        break;

                    case 2:

                        forma = "Cuadrado";
                        calc = new Figura();
                        Area = calc.Area(b, h);
                        if (b != h) {// los cuadrados tienen lados iguales
                            System.out.println("tecnicamente esto es un rectangulo pero igual lo vamos a calcular");
                            forma = "Rectangulo*";
                        }
                        Volumen = calc.Volumen(Area, H);
                        medidas = new Figura(cont, forma, b, h, H, Area, Volumen); // contructor cargado que asigna los valores
                        fig.add(medidas);
                        cont = cont + 1;

                        break;
                    case 3:

                        forma = "Rectangulo";
                        calc = new Figura();
                        Area = calc.Area(b, h);
                        Volumen = calc.Volumen(Area, H);
                        medidas = new Figura(cont, forma, b, h, H, Area, Volumen);// contructor cargado que asigna los valores
                        fig.add(medidas);
                        cont = cont + 1;

                        break;
                    default:
                        System.out.println("Figura no valida");
                        break;
                }
            } else {
                for (Figura i : fig) {
                    System.out.println(i);
                }
                System.exit(0);

            }
        }
    }
}
