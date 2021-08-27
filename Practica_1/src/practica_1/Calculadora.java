
package practica_1;
import java.text.DecimalFormat;
public class Calculadora {
    public double leyDeCosenos (){
    int numero = (int)(Math. random()*3+1);
    double respuesta=0;
    switch(numero){
        case 1:
            respuesta = this.LeyDeCosenosopcion1();
            
            
        break;
    }
           

     return respuesta;   
    }
    
    public double LeyDeCosenosopcion1 (){
        int ladoA =15;
        int ladoC=20;
        double respuestaLadoB=(double) 0.0;
        int angulo=25;
        double ladoB=9.01;
        double respuestaBeta=(double) 0.0;
         double respuestaGamma=(double) 0.0;
        
//                 Operaciones para lado B
        double radian = Math.toRadians(angulo);
        respuestaLadoB=  Math.sqrt(ladoA*ladoA+ladoC*ladoC-2*ladoC*ladoA*Math.cos(radian));
//                 Operaciones para Beta
        respuestaBeta=Math.toDegrees(Math.acos((ladoA*ladoA-ladoC*ladoC-ladoB*ladoB)/(-2*(ladoC)*(ladoB))));
//                 Operaciones para Gamma
        respuestaGamma=Math.toDegrees(Math.acos((-ladoA*ladoA+ladoC*ladoC-ladoB*ladoB)/(-2*(ladoA)*(ladoB))));
        
     return respuestaBeta;   
    }
       public double LeyDeCosenosopcion2 (){
        double ladoA =17.09;
        double ladoC=25;
        double respuestaLadoA=(double) 0.0;
        double angulo=30;
        double ladoB=10;
        double respuestaAlfa=(double) 0.0;
         double respuestaGamma=(double) 0.0;
        
//                 Operaciones para lado A
        double radian = Math.toRadians(angulo);
        respuestaLadoA=  Math.sqrt(ladoB*ladoB+ladoC*ladoC-2*ladoC*ladoB*Math.cos(radian));
//                 Operaciones para Alfa
        respuestaAlfa=Math.toDegrees(Math.acos((-ladoA*ladoA-ladoC*ladoC+ladoB*ladoB)/(-2*(ladoC)*(ladoA))));
             System.out.println(respuestaAlfa);    
//                 Operaciones para Gamma
        respuestaGamma=Math.toDegrees(Math.acos((-ladoA*ladoA+ladoC*ladoC-ladoB*ladoB)/(-2*(ladoA)*(ladoB))));
     return respuestaGamma;   
    } 
  public double LeyDeCosenosopcion3 (){
    
 
        double ladoA =18;
        double ladoB=25;
        double ladoC=13.02;
        double respuestaLadoC=(double) 0.0;
        double angulo=30;
       
        double respuestaAlfa=(double) 0.0;
         double respuestaBeta=(double) 0.0;
        
//                 Operaciones para lado C
        double radian = Math.toRadians(angulo);
        respuestaLadoC=  Math.sqrt(ladoB*ladoB+ladoA*ladoA-2*ladoA*ladoB*Math.cos(radian));
//                 Operaciones para Alfa
        respuestaAlfa=Math.toDegrees(Math.acos((-ladoA*ladoA-ladoC*ladoC+ladoB*ladoB)/(-2*(ladoC)*(ladoA))));
             System.out.println(respuestaLadoC);    
//                 Operaciones para Beta
        respuestaBeta=Math.toDegrees(Math.acos((-ladoA*ladoA+ladoC*ladoC-ladoB*ladoB)/(-2*(ladoA)*(ladoB))));
     return respuestaBeta;   
    } 
  
  
 
  
  public int[][] sumaDeMatrices (int[][] matrizA,int [][] matrizB){
  
      int [][] matriz1  = matrizA;
      int [][] matriz2 = matrizB;
      int [][] resultado = new int [5][5];
      
      for(int i=0;i<matriz1.length;i++){
        for(int j=0;j<matriz1.length;j++){
            
            resultado[i][j]= matriz1[i][j]+matriz2[i][j];
      
         }
      }
       return resultado;   
  }
  
  public int[][] RestaDeMatrices (int[][] matrizA,int [][] matrizB){
  
      
       int [][] matriz1  = matrizA;
      int [][] matriz2 = matrizB;
      int [][] resultado = new int [5][5];
      
      for(int i=0;i<matriz1.length;i++){
        for(int j=0;j<matriz1.length;j++){
            
            resultado[i][j]= matriz1[i][j]-matriz2[i][j];
      
         }
      }
       return resultado;   
  }
   
   public void sumaYRestaDeMatricesOpcion1 (){
  
      
       int [][] matriz1  = new int [5][5];
      int [][] matriz2 = new int [5][5];
     
     
     //             Matriz A
        matriz1[0][0]=7;
        matriz1[0][1]=48;
        matriz1[0][2]=5;
        matriz1[0][3]=0;
        matriz1[0][4]=1;
        
        matriz1[1][0]=57;
        matriz1[1][1]=8;
        matriz1[1][2]=4;
        matriz1[1][3]=6;
        matriz1[1][4]=14;
        
        matriz1[2][0]=0;
        matriz1[2][1]=5;
        matriz1[2][2]=6;
        matriz1[2][3]=78;
        matriz1[2][4]=15;
        
        matriz1[3][0]=21;
        matriz1[3][1]=14;
        matriz1[3][2]=8;
        matriz1[3][3]=19;
        matriz1[3][4]=54;
        
        matriz1[4][0]=32;
        matriz1[4][1]=20;
        matriz1[4][2]=26;
        matriz1[4][3]=47;
        matriz1[4][4]=12;
        
        // Matriz B
        matriz2[0][0]=9;
        matriz2[0][1]=5;
        matriz2[0][2]=2;
        matriz2[0][3]=1;
        matriz2[0][4]=8;
        
        matriz2[1][0]=4;
        matriz2[1][1]=2;
        matriz2[1][2]=3;
        matriz2[1][3]=47;
        matriz2[1][4]=8;
        
        matriz2[2][0]=48;
        matriz2[2][1]=55;
        matriz2[2][2]=32;
        matriz2[2][3]=19;
        matriz2[2][4]=6;
        
        matriz2[3][0]=7;
        matriz2[3][1]=56;
        matriz2[3][2]=32;
        matriz2[3][3]=14;
        matriz2[3][4]=8;
       
        matriz2[4][0]=32;
        matriz2[4][1]=87;
        matriz2[4][2]=2;
        matriz2[4][3]=1;
        matriz2[4][4]=7;
        
        int [][] resultadoSuma=this.sumaDeMatrices(matriz1, matriz2);
        int [][] resultadoresta=this.RestaDeMatrices(matriz1, matriz2);
        System.out.println("Esta es la matriz A");
        this.impresion(matriz1);
        System.out.println("Esta es la matriz B");
        this.impresion(matriz2);
        System.out.println("Esta es la suma de A y B");
        this.impresion(resultadoSuma);
        System.out.println("Esta es la resta de A y B");
        this.impresion(resultadoresta);
        
  }
   public void impresion(int [][] matrizA){
       int [][] sumaDeMatrices= matrizA;
       int largo =sumaDeMatrices.length;
       
       
       for (int i=0;i<largo;i++){
           
           
        for (int j=0;j<largo;j++){
       
           System.out.print("|"+sumaDeMatrices [i][j] );
           String salto= "  ";
            System.out.print(salto);
        }
         System.out.println("|");   
     }

       
       
   }
}

