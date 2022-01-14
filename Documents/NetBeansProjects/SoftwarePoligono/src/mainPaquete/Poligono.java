
package mainPaquete;

//Creacion de la super clase (abstracta)
public abstract class Poligono {
    protected int nlados;
    
    //Constructor
    public Poligono(int nlados){
        this.nlados = nlados;
        
    }

    public int getNlados() {
        return nlados;
    }
    
    //Metodo abstracto para obtener el area
    protected abstract double obtenerArea();
    
    //Metodo toString
    
    @Override
    public String toString(){
        return "El numero de lados es: " + nlados;
    }
    
 
}
