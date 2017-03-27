
import java.util.Scanner;


public class Main {
    public static void main(String[]args){
       System.out.println("MATRIZ DE BUSQUEDA \t");
        Escenario esc = new Escenario();
        esc.imprimirMatriz();
        boolean caca = false;
        Jugador player ;
        System.out.println("Ingrese la posicion donde se encuentra el jugador\n");
        do{
           Scanner scan= new Scanner(System.in);
           System.out.println("Ingrese la coordenada X no debe exceder a 10\n");
           int x= scan.nextInt()-1;
           System.out.println("Ingrese la coordenada Y no debe exceder a 10\n");
           int y= scan.nextInt()-1; 
           if(esc.matriz[x][y].tipocelda.equals("[ ]")){
            caca = true;
            // aqui define tu jugador 
            player = new Jugador(3);
            
            esc.matriz[x][y].tipocelda=player.tipocelda;
            esc.imprimirMatriz();
            }
        }while(!caca);
        
        
    }

    
}
