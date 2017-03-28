
public class Jugador extends Celda{    
 
    /**
     *
     * @param tipo
     */
    public Jugador(int tipo){
        super(tipo);
       this.tipocelda = "[J]";
       
    }   
    
    
    public void MoverArriba(){
        if(esc.matriz[x-1][y].tipocelda.equals("[#]")){
            System.out.println("Posicion ocupada Mueva en otra direccion");
        }else{
            if(vacio=)
            {
            esc.matriz[x][y].tipocelda= "[ ]";
            esc.matriz[x-1][y].tipocelda= "[J]";
            }
            if(esc.matriz[x-1][y].tipocelda.equals("[F]")){
            esc.matriz[x][y].tipocelda= "[ ]";
            esc.matriz[x-1][y].tipocelda= "[J]";
            //FUNCION IMPRIMIR MATRIZ
            System.out.println("TERMINASTE GANASTE WENA COMPARE");
            }
            
        }
    }

    public void MoverAbajo(){
        if(esc.matriz[x+1][y].tipocelda.equals("[#]")){
            System.out.println("Posicion ocupada Mueva en otra direccion");
        }else{
            if(vacio=)
            {
            esc.matriz[x][y].tipocelda= "[ ]";
            esc.matriz[x+1][y].tipocelda= "[J]";
            }
            if(esc.matriz[x+1][y].tipocelda.equals("[F]")){
            esc.matriz[x][y].tipocelda= "[ ]";
            esc.matriz[x+1][y].tipocelda= "[J]";
            //FUNCION IMPRIMIR MATRIZ
            System.out.println("TERMINASTE GANASTE WENA COMPARE");
        }
    }

    public void MoverDerecha(){
        if(esc.matriz[x][y+1].tipocelda.equals("[#]")){
            System.out.println("Posicion ocupada Mueva en otra direccion");
        }else{
            if(esc.matriz[x][y].tipocelda.equals("[ ]"))
            {
            esc.matriz[x][y].tipocelda= "[ ]";
            esc.matriz[x][y+1].tipocelda= "[J]";
            }
            if(esc.matriz[x][y+1].tipocelda.equals("[F]")){
            esc.matriz[x][y].tipocelda= "[ ]";
            esc.matriz[x][y+1].tipocelda= "[J]";
            //FUNCION IMPRIMIR MATRIZ
            System.out.println("TERMINASTE GANASTE WENA COMPARE");
        }
    }
    
    public void MoverIzquierda(){
        if(esc.matriz[x][y-1].tipocelda.equals("[#]")){
            System.out.println("Posicion ocupada Mueva en otra direccion");
        }else{
            if(vacio=)
            {
            esc.matriz[x][y].tipocelda= "[ ]";
            esc.matriz[x][y-1].tipocelda= "[J]";
            }
            if(esc.matriz[x][y-1].tipocelda.equals("[F]")){
            esc.matriz[x][y].tipocelda= "[ ]";
            esc.matriz[x][y-1].tipocelda= "[J]";
            //FUNCION IMPRIMIR MATRIZ
            System.out.println("TERMINASTE GANASTE WENA COMPARE");
        }
    }


}

