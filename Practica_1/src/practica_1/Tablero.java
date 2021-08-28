
package practica_1;

import java.util.Scanner;



public class Tablero {
    int [][] enumerado ;
    char [] jugador  ;    
    char [] penalizacion  ;
    int pocicion;
    public Tablero(){
        
         this.jugador   = new char[64];
         this.penalizacion   = new char [64];
         this.jugadorYPenalizaciones();
         this.operacionesFacil();
         this.operacionesFaci2();
         this.operacionesFaci3();
       
       
     
         
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
               System.out.print("│"+jugador[this.convertirPosicion(i, j)]+this.penalizacion[this.convertirPosicion(i, j)] +"│");
            
               
         }
    }
                   System.out.println("");
                   System.out.print("-------------------------------------------");

    }
    public int convertirPosicion(int x, int y){
        switch(x){
             case 0:
                switch(y){
                    case 0:
                         return 56;
                    case 1:
                         return 57;          
                    case 2:
                         return 58;  
                    case 3:
                         return 59;     
                    case 4:
                         return 60;     
                    case 5:
                         return 61;     
                    case 6:
                         return 62;     
                    case 7:
                         return 63;     
              }
                
                case 1:
                switch(y){
                    case 0:
                         return 55;
                    case 1:
                         return 54;          
                    case 2:
                         return 53;  
                    case 3:
                         return 52;     
                    case 4:
                         return 51;     
                    case 5:
                         return 50;     
                    case 6:
                         return 49;     
                    case 7:
                         return 48;     
              }
                case 2:
                switch(y){
                    case 0:
                         return 40;
                    case 1:
                         return 41;          
                    case 2:
                         return 42;  
                    case 3:
                         return 43;     
                    case 4:
                         return 44;     
                    case 5:
                         return 45;     
                    case 6:
                         return 46;     
                    case 7:
                         return 47;
                }    
                case 3:
                switch(y){
                    case 0:
                         return 39;
                    case 1:
                         return 38;          
                    case 2:
                         return 37;  
                    case 3:
                         return 36;     
                    case 4:
                         return 35;     
                    case 5:
                         return 34;     
                    case 6:
                         return 33;     
                    case 7:
                         return 32;              
              }
               
                 case 4:
                switch(y){
                    case 0:
                         return 24;
                    case 1:
                         return 25;          
                    case 2:
                         return 26;  
                    case 3:
                         return 27;     
                    case 4:
                         return 28;     
                    case 5:
                         return 29;     
                    case 6:
                         return 30;     
                    case 7:
                         return 31;              
              }
                  case 5:
                switch(y){
                    case 0:
                         return 23;
                    case 1:
                         return 22;          
                    case 2:
                         return 21;  
                    case 3:
                         return 20;     
                    case 4:
                         return 19;     
                    case 5:
                         return 18;     
                    case 6:
                         return 17;     
                    case 7:
                         return 16;              
              }
                             
                   case 6:
                switch(y){
                    case 0:
                         return 8;
                    case 1:
                         return 9;          
                    case 2:
                         return 10;  
                    case 3:
                         return 11;     
                    case 4:
                         return 12;     
                    case 5:
                         return 13;     
                    case 6:
                         return 14;     
                    case 7:
                         return 15;              
              }
                             
                    case 7:
                switch(y){
                    case 0:
                         return 7;
                    case 1:
                         return 6;          
                    case 2:
                         return 5;  
                    case 3:
                         return 4;     
                    case 4:
                         return 3;     
                    case 5:
                         return 2;     
                    case 6:
                         return 1;     
                    case 7:
                         return 0;              
              }
                             
                                                                               
                
              break;
      }
      
      return 0;
    
    }
    public void jugadorYPenalizaciones (){
        
    
       for(int i=0;i<64;i++){
       this.penalizacion[i]=' ';
       this.jugador[i]= ' ';
       }
       
       this.jugador[this.pocicion]='@';
       for( int i=0;i<64;i++){
       
           this.penalizacion[i]= ' ';
       }
         
          
       
       
       
    
    }
    public int dado(){
        
        int numero = (int)(Math. random()*6+2);
        
        
        return numero;
    }
    public void juego (){
        Scanner sn = new Scanner(System.in);
        while(true){
              this.dibujadoTablero();
              this.jugador[pocicion]=' '; 
              this.pocicion = this.dado()+pocicion ;
              if (pocicion>=63){
                     pocicion=63;
                     this.jugador[pocicion]='@';
                     System.out.println("  ");
                     System.out.println("Felicidades Ganaste");
                     this.dibujadoTablero();
                     break;
        }
              this.jugador[pocicion]='@';
              sn.nextLine();
        }
        
        
        
        
        
    
    
    }
    public void operacionesFacil(){
        int generador = (int)(Math. random()*2+2); 

          while(true){
              int contador =0;

              int pocicion = (int)(Math. random()*13+2);
              this.penalizacion[pocicion]='#';
             for(int i=0;i<16;i++){

                 if(this.penalizacion[i]=='#'){

                     contador++;
                 }
             }
             if(contador>=generador){

             break;
             }
          }
          }
    
     public void operacionesFaci2(){
        int generador = (int)(Math. random()*2+2); 

          while(true){
              int contador =0;

              int pocicion = (int)(Math. random()*23+16);
              this.penalizacion[pocicion]='#';
             for(int i=16;i<40;i++){

                 if(this.penalizacion[i]=='#'){

                     contador++;
                 }
             }
             if(contador>=generador){

             break;
             }
          }
          }
    
    public void operacionesFaci3(){
        int generador = (int)(Math. random()*2+2); 

          while(true){
              int contador =0;

              int pocicion = (int)(Math. random()*23+40);
              this.penalizacion[pocicion]='#';
             for(int i=40;i<64;i++){

                 if(this.penalizacion[i]=='#'){

                     contador++;
                 }
             }
             if(contador>=generador){

             break;
             }
          }
          }
    
}
