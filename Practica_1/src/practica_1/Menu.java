
package practica_1;

import java.util.Scanner;

/**
 *
 * @author Norki
 */
public class Menu {
    
    public void estructuradoMenu(){
        Tablero juego = new Tablero();
        while(true){
            System.out.println("======Menu Principal==========");
            System.out.println("1. Iniciar Juego");
            System.out.println("2. Retomar Juego");
            System.out.println("3. Generar Reportes");
            System.out.println("4. Salir");

            Scanner sn = new Scanner(System.in);
            String valor= sn.nextLine();

            if(valor.equals("1")){

             juego = new Tablero();
             juego.juego();

            }else if(valor.equals("2")){

             juego.juego();
            }

            else if(valor.equals("3")){
                juego.generarReporte2();

            }

            else if(valor.equals("4")){

                return ;    
            }

        
        
        
        }
    
    }
    
}
