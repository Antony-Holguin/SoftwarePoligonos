
package mainPaquete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    
    //Array de objetos. Un poligono puede ser varias cosas (Triangulo, rectangulo)
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
    
    public static void main(String[] args) {
        llenarArreglo();
        mostrarDatos();   
    }
    
    //Metodo que va a llenar el objeto
    
    static void llenarArreglo(){
        char respuesta;
        int opcion;
        do{
            do{
            System.out.println("---Vas a llenar el arreglo pepu---");
            System.out.println("Elige una opcion: ");
            System.out.println("1.-Guardar triangulo");
            System.out.println("2.- Guardar cuadrilatero: ");
            opcion= entrada.nextInt();
                
            }while(opcion <1  || opcion > 2 );
            
            switch(opcion){
                case 1:
                    llenarTriangulo();
                    break;
                case 2:
                    llenarRectangulo();
                
            }
            System.out.println("Desea seguir ingresando mas objetos? S/N");
            respuesta = entrada.next().charAt(0);
      
        }while(respuesta == 's' || respuesta == 'S');
    }
    
    //Metodo que va a llenar el poligono
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        System.out.println("Ingrese el lado 1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("Ingrese el lado 2 del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.println("Ingrese el lado 3 del triangulo: ");
        lado3 = entrada.nextDouble();
        
        //Creacion de objeto triangulo
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        poligonos.add(triangulo);
        
        
    }
    public static void llenarRectangulo(){
        double lado1,lado2;
        System.out.println("Ingrese el lado 1 del rectangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("Ingrese el lado 2 del rectangulo: ");
        lado2 = entrada.nextDouble();
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        
        //Anadir el objeto rectangulo
        poligonos.add(rectangulo);
    }
    public static void mostrarDatos(){
         for(Poligono poli: poligonos){
            System.out.println(poli.toString());
            System.out.println("El area es: " + poli.obtenerArea());
            System.out.println("");
            
        }
    }
        
    
}
