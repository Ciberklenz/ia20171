
public class Celda{
 public String tipocelda ;
 
    public Celda(int tipo){
        if (tipo>5){
             tipocelda = "[ ]";
        }
         if(tipo <=5){
             tipocelda = "[#]";
            }
         if(tipo == -1){
             tipocelda ="[F]";
         }
       
    }

   
 @Override
        public String toString(){
            return tipocelda;
            
        }
     
}