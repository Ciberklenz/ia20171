
import java.util.Arrays;
import java.util.Random;


public class Escenario {
    public int i,j,n=10,tipo;
    public Celda[][]  matriz;
    
    public Escenario(){
        matriz = new Celda[n][n];
        
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                matriz[i][j]= new Celda(numeroAleatorio(0,25));
               //System.out.print(matriz[i][j].toString());
            }
            //System.out.println("\n");
        }
        matriz[9][9]= new Celda(-1);
        matriz[8][9]= new Celda(6);
        matriz[9][8] =new Celda(6);
    }
    
    void imprimirMatriz(){
    for(i=0;i<n;i++){
            for(j=0;j<n;j++){
               System.out.print(matriz[i][j].toString());
            }
            System.out.println("\n");
        }
    }
static int numeroAleatorio(int minimo, int maximo) {
Random random = new Random();
int numero_aleatorio = random.nextInt((maximo - minimo) + 1) + minimo;
return numero_aleatorio;  
}
}
