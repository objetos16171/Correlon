import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que crea la entidad del item en el mundo
 * 
 * @author Carlos Antonio Aguiñaga Camacho
 * @version 120520160035
 */
public class Item extends Actor
{
    //guardan las coordenadas del item
    //el tipo determina que item es: si es un item "bueno" o "malo"
    /*
     * Tipo 0: extra punto
     * Tipo 1: bonus score
     * Tipo 2: invencible
     */
    int coordX, coordY, tipo, toma=0;
    
    //constructor debe recibir coordenadas para colocar los bloques
    public Item(int cX, int cY, int iTipo){
        coordX = cX;
        coordY = cY;
        tipo = iTipo;
        
        cambiaTipo();
    }
    
    /**
     * Metodo que asigna una imagen al item para cada tipo.
     * La imagen debe existir en la carpeta de imagenes del proyecto
     */
    public void cambiaTipo(){
        
        //inicializa la cadena que guardara las imagenes a usar
        String cad = "";
        
        //asigna imagen por tipo
        if ( tipo == 0 ){
           cad = "item1.png";
           //setImage(img);
        }
        else if ( tipo == 1 ){
            cad = "item2.png";
           //setImage(img);
        }
        else if ( tipo == 2 ){
           cad = "item3.png";
           //setImage(img);
        }
        
        //aplica la imagen
        setImage(cad);
    }
    
    /**
     * Metodo que regresa el tipo del item para generar el effecto deseado
     * @return int tipo
     */
    public int getTipo(){
        
        return tipo;
    }
    
    /**
     * Metodo que indica el item como tomado, evita su reaparicion en el mapa
     * 
     */
    public void setTomado(){
        toma=1;
    }
}
