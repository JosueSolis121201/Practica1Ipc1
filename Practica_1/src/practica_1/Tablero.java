
package practica_1;


public class Tablero {
    int [][] enumerado ;
    int [][] jugador  ;    
    int [][] penalizacion  ;

    public Tablero(){
        
        
         enumerado   = new int [8][8];
         enumerado   = new int [8][8];
         enumerado   = new int [8][8];
         enumerado[0][0]=57;
         enumerado[0][1]=58;
         enumerado[0][2]=59;
         enumerado[0][3]=60;
         enumerado[0][4]=61;
         enumerado[0][5]=62;
         enumerado[0][6]=63;
         enumerado[0][7]=64;
         
         enumerado[1][0]=56;
         enumerado[1][1]=55;
         enumerado[1][2]=54;
         enumerado[1][3]=53;
         enumerado[1][4]=52;
         enumerado[1][5]=51;
         enumerado[1][6]=50;
         enumerado[1][7]=49;
         
         enumerado[2][0]=41;
         enumerado[2][1]=42;
         enumerado[2][2]=43;
         enumerado[2][3]=44;
         enumerado[2][4]=45;
         enumerado[2][5]=46;
         enumerado[2][6]=47;
         enumerado[2][7]=48;

         enumerado[3][0]=40;
         enumerado[3][1]=39;
         enumerado[3][2]=38;
         enumerado[3][3]=37;
         enumerado[3][4]=36;
         enumerado[3][5]=35;
         enumerado[3][6]=34;
         enumerado[3][7]=33;

         enumerado[4][0]=25;
         enumerado[4][1]=26;
         enumerado[4][2]=27;
         enumerado[4][3]=28;
         enumerado[4][4]=29;
         enumerado[4][5]=30;
         enumerado[4][6]=31;
         enumerado[4][7]=32;

         enumerado[5][0]=24;
         enumerado[5][1]=23;
         enumerado[5][2]=22;
         enumerado[5][3]=21;
         enumerado[5][4]=20;
         enumerado[5][5]=19;
         enumerado[5][6]=18;
         enumerado[5][7]=17;

         enumerado[6][0]=9;
         enumerado[6][1]=10;
         enumerado[6][2]=11;
         enumerado[6][3]=12;
         enumerado[6][4]=13;
         enumerado[6][5]=14;
         enumerado[6][6]=15;
         enumerado[6][7]=16;

         enumerado[7][0]=8;
         enumerado[7][1]=7;
         enumerado[7][2]=6;
         enumerado[7][3]=5;
         enumerado[7][4]=4;
         enumerado[7][5]=3;
         enumerado[7][6]=2;
         enumerado[7][7]=1;   
    }
    
    public void dibujadoTablero (){
    
        
        for(int i=0;i<8;i++){
           
           System.out.println("");
            System.out.println("-------------------------------------------------");
           for(int j=0;j<8;j++){
               if(enumerado[i][j]<10){
                    System.out.print("│"+ enumerado[i][j] +" │");
                    
             }else{
               
               System.out.print("│"+ enumerado[i][j] +"│");
               }
            
           }
            System.out.println("");
           for(int j=0;j<8;j++){
               System.out.print("│  │");
               
         }
    }
                   System.out.println("");
                   System.out.print("-------------------------------------------");

    }
    

    
    
    public void jugadorYPenalizaciones (){
        
        for(int i=0;i<8;i++){
            
             for(int j=0;j<8;j++){
                 
        
             }
        
        
        }
        
        
    
    
    }
    
    
    
    
    
}
