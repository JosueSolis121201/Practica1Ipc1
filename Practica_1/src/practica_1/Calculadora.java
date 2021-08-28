package practica_1;

import java.text.DecimalFormat;
public class Calculadora {
    String reporte1;
    String reporte2;

    public Calculadora(){
        this.reporte1="";
        this.reporte2="";

    }
    public double leyDeCosenos() {
        int numero = (int) (Math.random() * 2 + 1);
        double respuesta = 0;
        switch (numero) {
            case 1:
                this.reporte2 = this.reporte2+" Entrando opcion 1 operacion facil" +"\n";
                respuesta = this.LeyDeCosenosopcion1();
                   
                break;

            case 2:
                this.reporte2 = this.reporte2+" Entrando opcion 2 operacion facil" +"\n";
                respuesta = this.LeyDeCosenosopcion2();

                break;

            case 3:
                this.reporte2 = this.reporte2+" Entrando opcion 3 operacion facil" +"\n";
                respuesta = this.LeyDeCosenosopcion3();

                break;
        }

        return respuesta;
    }

    public double SumaDeMatrices() {
        int numero = (int) (Math.random() * 2 + 1);
        double respuesta = 0;
        switch (numero) {
            case 1:
                this.reporte2 = this.reporte2+" Entrando opcion 1 operacion media" +"\n";
                this.sumaYRestaDeMatricesOpcion1();

                break;

            case 2:
                this.reporte2 = this.reporte2+" Entrando opcion 2 operacion media" +"\n";
                this.sumaYRestaDeMatricesOpcion2();

                break;

            case 3:
                this.reporte2 = this.reporte2+" Entrando opcion 3 operacion media" +"\n";
                this.sumaYRestaDeMatricesOpcion3();

                break;
        }

        return respuesta;
    }
    
    public double divisionElegir() {
        int numero = (int) (Math.random() * 2 + 1);
        double respuesta = 0;
        switch (numero) {
            case 1:
                this.reporte2 = this.reporte2+" Entrando opcion 1 operacion dificl" +"\n";
                this.divisionDeMatricesOpcion1();

                break;

            case 2:
                this.reporte2 = this.reporte2+" Entrando opcion 2 operacion dificl" +"\n";
                this.divisionDeMatricesOpcion2();

                break;

            case 3:
                this.reporte2 = this.reporte2+" Entrando opcion 3 operacion dificl" +"\n";
                this.divisionDeMatricesOpcion3();

                break;
        }

        return respuesta;
    }

    public double LeyDeCosenosopcion1() {
        int ladoA = 15;
        int ladoC = 20;
        double respuestaLadoB = (double) 0.0;
        int angulo = 25;
        double ladoB = 9.01;
        double respuestaBeta = (double) 0.0;
        double respuestaGamma = (double) 0.0;
        this.reporte1 = this.reporte1+" -------------Ley de cosenos opcion 1------------------" +"\n";

        
       
        System.out.println("Esta es la respuesta de la opcion 1");
//                 Operaciones para lado B
        double radian = Math.toRadians(angulo);
        System.out.println("Esta es lado B");
                this.reporte1 = this.reporte1+"Operaciones para encontrar lado B" +"\n";

                this.reporte1 = this.reporte1+"Este es el lado A"+"\n";
                this.reporte1 = this.reporte1+ladoA+"\n";
                

                this.reporte1 = this.reporte1+"Este es el lado C"+"\n";
                this.reporte1 = this.reporte1+ladoC+"\n";
                
                this.reporte1 = this.reporte1+"Este es el angulo"+"\n";
                this.reporte1 = this.reporte1+angulo+"\n";
               
            
        this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";
        this.reporte1 = this.reporte1+"Lado B = Math.sqrt(ladoA * ladoA + ladoC * ladoC - 2 * ladoC * ladoA * Math.cos(radian))"+"\n";
        this.reporte1 = this.reporte1+"Este es el resultado"+"\n";
           
                this.reporte1 = this.reporte1+" -------------Resultado------------------" +"\n";
                

        DecimalFormat df= new DecimalFormat ("#.000");
        respuestaLadoB = Math.sqrt(ladoA * ladoA + ladoC * ladoC - 2 * ladoC * ladoA * Math.cos(radian));
         System.out.println(df.format(respuestaLadoB));
                this.reporte1 = this.reporte1+respuestaLadoB+"\n";  
                

        System.out.println("Esta es angulo Beta");
//                 Operaciones para Beta
                this.reporte1 = this.reporte1+"Operaciones para encontrar angulo Beta" +"\n";

        this.reporte1 = this.reporte1+"Este es el lado A"+"\n";
        this.reporte1 = this.reporte1+ladoA+"\n";
        
        this.reporte1 = this.reporte1+"Este es el lado B"+"\n";
        this.reporte1 = this.reporte1+ladoB+"\n";
        
        
        this.reporte1 = this.reporte1+"Este es el lado C"+"\n";
        this.reporte1 = this.reporte1+ladoC+"\n";
        
        
        this.reporte1 = this.reporte1+"Este es el angulo"+"\n";
        this.reporte1 = this.reporte1+angulo+"\n";
        
        this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";
        
        this.reporte1 = this.reporte1+"Math.toDegrees(Math.acos((ladoA * ladoA - ladoC * ladoC - ladoB * ladoB) / (-2 * (ladoC) * (ladoB))))"+"\n";
           

        

        respuestaBeta = Math.toDegrees(Math.acos((ladoA * ladoA - ladoC * ladoC - ladoB * ladoB) / (-2 * (ladoC) * (ladoB))));
        System.out.println(df.format(respuestaBeta));
        
        this.reporte1 = this.reporte1+" -------------Resultado------------------" +"\n";
        this.reporte1 = this.reporte1+" Este es el angulo Beta" +"\n";

        
        this.reporte1 = this.reporte1+respuestaBeta+"\n"; 
        
        
        
        System.out.println("Esta es angulo Gamma");
//                 Operaciones para Gamma
                this.reporte1 = this.reporte1+"Operaciones para encontrar angulo Gamma" +"\n";

        this.reporte1 = this.reporte1+"Este es el lado A"+"\n"; 
        this.reporte1 = this.reporte1+ladoA+"\n";
        
        this.reporte1 = this.reporte1+"Este es el lado B"+"\n"; 
        this.reporte1 = this.reporte1+ladoB+"\n";
        
        this.reporte1 = this.reporte1+"Este es el lado C"+"\n"; 
        this.reporte1 = this.reporte1+ladoC+"\n";
        
        this.reporte1 = this.reporte1+"Este es angulo"+"\n"; 
        this.reporte1 = this.reporte1+angulo+"\n";
        
        this.reporte1 = this.reporte1+"----------------Ecuacion-----------------------"+"\n";
        this.reporte1 = this.reporte1+"Math.toDegrees(Math.acos((-ladoA * ladoA + ladoC * ladoC - ladoB * ladoB) / (-2 * (ladoA) * (ladoB))))"+"\n";




        respuestaGamma = Math.toDegrees(Math.acos((-ladoA * ladoA + ladoC * ladoC - ladoB * ladoB) / (-2 * (ladoA) * (ladoB))));
        System.out.println(df.format(respuestaGamma));
        
        this.reporte1 = this.reporte1+"----------------Respuesta--------------"+"\n"; 
                this.reporte1 = this.reporte1+" Este es el angulo Gamma" +"\n";

        this.reporte1 = this.reporte1+respuestaGamma+"\n";     


        return respuestaBeta;
    }

    public double LeyDeCosenosopcion2() {
        double ladoA = 17.09;
        double ladoC = 25;
        double respuestaLadoA = (double) 0.0;
        double angulo = 30;
        double ladoB = 10;
        double respuestaAlfa = (double) 0.0;
        double respuestaGamma = (double) 0.0;
        System.out.println("Esta es la respuesta de la opcion 2");
                this.reporte1 = this.reporte1+" -------------Operacion opcion 2------------------" +"\n";

                this.reporte1 = this.reporte1+"Operaciones para encontrar lado A" +"\n";

//                 Operaciones para lado A


                this.reporte1 = this.reporte1+"Este es el ladoB"+"\n";
                this.reporte1 = this.reporte1+ladoB+"\n";
                

                this.reporte1 = this.reporte1+"Este es el ladoC"+"\n";
                this.reporte1 = this.reporte1+ladoC+"\n";
               
            
                this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";

        this.reporte1 = this.reporte1+"Lado A = Math.sqrt(ladoA * ladoA + ladoC * ladoC - 2 * ladoC * ladoA * Math.cos(radian))"+"\n";
        this.reporte1 = this.reporte1+"Este es el resultado"+"\n";
        

        System.out.println("Esta es el lado A");
        DecimalFormat df= new DecimalFormat ("#.000");
        
        double radian = Math.toRadians(angulo);
        respuestaLadoA = Math.sqrt(ladoB * ladoB + ladoC * ladoC - 2 * ladoC * ladoB * Math.cos(radian));
        System.out.println(df.format(respuestaLadoA));
    this.reporte1 = this.reporte1+" -------------Resultado------------------" +"\n";
                    this.reporte1 = this.reporte1+" Este es el lado A" +"\n";


        this.reporte1 = this.reporte1+respuestaLadoA+"\n";  

        
        
        
        
        
//                 Operaciones para Alfa
        System.out.println("Este es el angulo Alfa");
                        this.reporte1 = this.reporte1+"Operaciones para encontrar angulo Alfa" +"\n";

                this.reporte1 = this.reporte1+"Este es el ladoB"+"\n";
                this.reporte1 = this.reporte1+ladoB+"\n";
                

                this.reporte1 = this.reporte1+"Este es el ladoA"+"\n";
                this.reporte1 = this.reporte1+ladoA+"\n";
               
                this.reporte1 = this.reporte1+"Este es el ladoC"+"\n";
                this.reporte1 = this.reporte1+ladoC+"\n";
               
                this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";

        this.reporte1 = this.reporte1+"Math.toDegrees(Math.acos((-ladoA * ladoA - ladoC * ladoC + ladoB * ladoB) / (-2 * (ladoA) * (ladoB))));"+"\n";
        this.reporte1 = this.reporte1+"--------------Respuesta-------------------"+"\n"; 
        this.reporte1 = this.reporte1+" Este es el angulo Alfa" +"\n";
        

        respuestaAlfa = Math.toDegrees(Math.acos((-ladoA * ladoA - ladoC * ladoC + ladoB * ladoB) / (-2 * (ladoC) * (ladoA))));
        System.out.println(df.format(respuestaAlfa));
                this.reporte1 = this.reporte1+respuestaAlfa+"\n";  

//                 Operaciones para Gamma
        System.out.println("Este es el aunglo Gamma");
       this.reporte1 = this.reporte1+"Operaciones para encontrar angulo Gamma" +"\n";

        
        
                this.reporte1 = this.reporte1+"Este es el ladoB"+"\n";
                this.reporte1 = this.reporte1+ladoB+"\n";
                

                this.reporte1 = this.reporte1+"Este es el ladoA"+"\n";
                this.reporte1 = this.reporte1+ladoA+"\n";
               
                this.reporte1 = this.reporte1+"Este es el ladoC"+"\n";
                this.reporte1 = this.reporte1+ladoC+"\n";
               
                this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";

        this.reporte1 = this.reporte1+"Math.toDegrees(Math.acos((-ladoA * ladoA + ladoC * ladoC - ladoB * ladoB) / (-2 * (ladoA) * (ladoB))));"+"\n";
                this.reporte1 = this.reporte1+" -------------Respuesta------------------" +"\n";
       
        this.reporte1 = this.reporte1+"Este es la respuesta del angulo Gamma"+"\n";  

        
        respuestaGamma = Math.toDegrees(Math.acos((-ladoA * ladoA + ladoC * ladoC - ladoB * ladoB) / (-2 * (ladoA) * (ladoB))));
        System.out.println(df.format(respuestaGamma));
                this.reporte1 = this.reporte1+respuestaGamma+"\n";  

        return respuestaGamma;
    }

    public double LeyDeCosenosopcion3() {

        double ladoA = 18;
        double ladoB = 25;
        double ladoC = 13.02;
        double respuestaLadoC = (double) 0.0;
        double angulo = 30;
        

        double respuestaAlfa = (double) 0.0;
        double respuestaBeta = (double) 0.0;
        System.out.println("Esta es la respuesta de la opcion 3");
                this.reporte1 = this.reporte1+" -------------Operacion opcion 3------------------" +"\n";
       this.reporte1 = this.reporte1+"Operaciones para encontrar el lado C" +"\n";

//                 Operaciones para lado C

                this.reporte1 = this.reporte1+"Este es el ladoB"+"\n";
                this.reporte1 = this.reporte1+ladoB+"\n";
                

                this.reporte1 = this.reporte1+"Este es el ladoA"+"\n";
                this.reporte1 = this.reporte1+ladoA+"\n";
               
            
                this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";

        this.reporte1 = this.reporte1+"Lado C = Math.sqrt(ladoA * ladoA + ladoC * ladoC - 2 * ladoC * ladoA * Math.cos(radian))"+"\n";
          this.reporte1 = this.reporte1+" -------------Resultado------------------" +"\n";

        this.reporte1 = this.reporte1+"Este es el resultado lado C"+"\n";
         

      DecimalFormat df= new DecimalFormat ("#.000");
     System.out.println("Este es el lado C");
        double radian = Math.toRadians(angulo);
        respuestaLadoC = Math.sqrt(ladoB * ladoB + ladoA * ladoA - 2 * ladoA * ladoB * Math.cos(radian));
         System.out.println(df.format(respuestaLadoC));
         this.reporte1 = this.reporte1+respuestaLadoC+"\n"; 
//                 Operaciones para Alfa


       this.reporte1 = this.reporte1+"Operaciones para encontrar el angulo Alfa" +"\n";

                this.reporte1 = this.reporte1+"Este es el ladoB"+"\n";
                this.reporte1 = this.reporte1+ladoB+"\n";
                

                this.reporte1 = this.reporte1+"Este es el ladoA"+"\n";
                this.reporte1 = this.reporte1+ladoA+"\n";
               
                this.reporte1 = this.reporte1+"Este es el ladoC"+"\n";
                this.reporte1 = this.reporte1+ladoC+"\n";
               
                this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";

        this.reporte1 = this.reporte1+"Math.toDegrees(Math.acos((-ladoA * ladoA - ladoC * ladoC + ladoB * ladoB) / (-2 * (ladoA) * (ladoB))));"+"\n";
        
                this.reporte1 = this.reporte1+" -------------Resultado------------------" +"\n";
        
        this.reporte1 = this.reporte1+"Este es la respuesta del angulo Alfa"+"\n";  
        
        
         
  

        System.out.println("Este es en angulo Alfa");
        respuestaAlfa = Math.toDegrees(Math.acos((-ladoA * ladoA - ladoC * ladoC + ladoB * ladoB) / (-2 * (ladoC) * (ladoA))));
         System.out.println(df.format(respuestaAlfa));
          this.reporte1 = this.reporte1+respuestaAlfa+"\n";
//                 Operaciones para Beta

       this.reporte1 = this.reporte1+"Operaciones para encontrar el angulo Beta" +"\n";

                this.reporte1 = this.reporte1+"Este es el ladoB"+"\n";
                this.reporte1 = this.reporte1+ladoB+"\n";
                

                this.reporte1 = this.reporte1+"Este es el ladoA"+"\n";
                this.reporte1 = this.reporte1+ladoA+"\n";
               
                this.reporte1 = this.reporte1+"Este es el ladoC"+"\n";
                this.reporte1 = this.reporte1+ladoC+"\n";
               
                this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";

        this.reporte1 = this.reporte1+"Math.toDegrees(Math.acos((-ladoA * ladoA + ladoC * ladoC - ladoB * ladoB) / (-2 * (ladoA) * (ladoB))));"+"\n";
        
                        this.reporte1 = this.reporte1+" -------------Resultado------------------" +"\n";

        this.reporte1 = this.reporte1+"Este es la respuesta del angulo Beta"+"\n";  
         
  
        respuestaBeta = Math.toDegrees(Math.acos((-ladoA * ladoA + ladoC * ladoC - ladoB * ladoB) / (-2 * (ladoA) * (ladoB))));
         System.out.println(df.format(respuestaBeta));
         this.reporte1 = this.reporte1+respuestaBeta+"\n"; 
        return respuestaBeta;
    }
   public int[][] sumaDeMatrices(int[][] matrizA, int[][] matrizB) {


        int[][] matriz1 = matrizA;
        int[][] matriz2 = matrizB;
        int[][] resultado = new int[5][5];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {

                resultado[i][j] = matriz1[i][j] + matriz2[i][j];

            }
        }
        return resultado;
    }

    public int[][] RestaDeMatrices(int[][] matrizA, int[][] matrizB) {

        int[][] matriz1 = matrizA;
        int[][] matriz2 = matrizB;
        int[][] resultado = new int[5][5];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {

                resultado[i][j] = matriz1[i][j] - matriz2[i][j];

            }
        }
        return resultado;
    }

    public void sumaYRestaDeMatricesOpcion1() {

        int[][] matriz1 = new int[5][5];
        int[][] matriz2 = new int[5][5];

        //             Matriz A
        matriz1[0][0] = 7;
        matriz1[0][1] = 48;
        matriz1[0][2] = 5;
        matriz1[0][3] = 0;
        matriz1[0][4] = 1;

        matriz1[1][0] = 57;
        matriz1[1][1] = 8;
        matriz1[1][2] = 4;
        matriz1[1][3] = 6;
        matriz1[1][4] = 14;

        matriz1[2][0] = 0;
        matriz1[2][1] = 5;
        matriz1[2][2] = 6;
        matriz1[2][3] = 78;
        matriz1[2][4] = 15;

        matriz1[3][0] = 21;
        matriz1[3][1] = 14;
        matriz1[3][2] = 8;
        matriz1[3][3] = 19;
        matriz1[3][4] = 54;

        matriz1[4][0] = 32;
        matriz1[4][1] = 20;
        matriz1[4][2] = 26;
        matriz1[4][3] = 47;
        matriz1[4][4] = 12;

        // Matriz B
        matriz2[0][0] = 9;
        matriz2[0][1] = 5;
        matriz2[0][2] = 2;
        matriz2[0][3] = 1;
        matriz2[0][4] = 8;

        matriz2[1][0] = 4;
        matriz2[1][1] = 2;
        matriz2[1][2] = 3;
        matriz2[1][3] = 47;
        matriz2[1][4] = 8;

        matriz2[2][0] = 48;
        matriz2[2][1] = 55;
        matriz2[2][2] = 32;
        matriz2[2][3] = 19;
        matriz2[2][4] = 6;

        matriz2[3][0] = 7;
        matriz2[3][1] = 56;
        matriz2[3][2] = 32;
        matriz2[3][3] = 14;
        matriz2[3][4] = 8;

        matriz2[4][0] = 32;
        matriz2[4][1] = 87;
        matriz2[4][2] = 2;
        matriz2[4][3] = 1;
        matriz2[4][4] = 7;

        int[][] resultadoSuma = this.sumaDeMatrices(matriz1, matriz2);
        int[][] resultadoresta = this.RestaDeMatrices(matriz1, matriz2);
       this.reporte1 = this.reporte1+"Suma y resta de matrices opcion 1" +"\n";

        this.reporte1 = this.reporte1+"Esta es la matriz A" +"\n";
        this.impresionMatrices(matriz1);
        
        System.out.println("Esta es la matriz A");
        this.impresion(matriz1);
        
        this.reporte1 = this.reporte1+"Esta es la matriz B" +"\n";
        this.impresionMatrices(matriz2);
        System.out.println("Esta es la matriz B");
        
       this.impresion(matriz2);
         this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";
         this.reporte1 = this.reporte1+" resultado[i][j] = matrizA[i][j] + matrizB[i][j];" +"\n";
                        
        this.reporte1 = this.reporte1+" -------------Resultado------------------" +"\n";

       this.reporte1 = this.reporte1+"Esta es la suma de A y B" +"\n";
        this.impresionMatrices(resultadoSuma);

        
        System.out.println("Esta es la suma de A y B");
        this.impresion(resultadoSuma);
        
        this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";
        this.reporte1 = this.reporte1+" resultado[i][j] = matrizA[i][j] - matrizB[i][j];" +"\n";
              
        this.reporte1 = this.reporte1+" -------------Resultado------------------" +"\n";
        this.reporte1 = this.reporte1+"Esta es la resta de B y A" +"\n";
        this.impresionMatrices(resultadoresta);
        System.out.println("Esta es la resta de A y B");
        this.impresion(resultadoresta);

    }

    public void sumaYRestaDeMatricesOpcion2() {

        int[][] matriz1 = new int[5][5];
        int[][] matriz2 = new int[5][5];

        //             Matriz A
        matriz1[0][0] = 4;
        matriz1[0][1] = 9;
        matriz1[0][2] = 7;
        matriz1[0][3] = 15;
        matriz1[0][4] = 18;

        matriz1[1][0] = 7;
        matriz1[1][1] = 51;
        matriz1[1][2] = 26;
        matriz1[1][3] = 8;
        matriz1[1][4] = 38;

        matriz1[2][0] = 48;
        matriz1[2][1] = 26;
        matriz1[2][2] = 37;
        matriz1[2][3] = 21;
        matriz1[2][4] = 19;

        matriz1[3][0] = 1;
        matriz1[3][1] = 0;
        matriz1[3][2] = 6;
        matriz1[3][3] = 8;
        matriz1[3][4] = 1;

        matriz1[4][0] = 2;
        matriz1[4][1] = 19;
        matriz1[4][2] = 55;
        matriz1[4][3] = 25;
        matriz1[4][4] = 15;

        // Matriz B
        matriz2[0][0] = 0;
        matriz2[0][1] = 2;
        matriz2[0][2] = 15;
        matriz2[0][3] = 1;
        matriz2[0][4] = 66;

        matriz2[1][0] = 21;
        matriz2[1][1] = 48;
        matriz2[1][2] = 62;
        matriz2[1][3] = 7;
        matriz2[1][4] = 33;

        matriz2[2][0] = 4;
        matriz2[2][1] = 88;
        matriz2[2][2] = 0;
        matriz2[2][3] = 68;
        matriz2[2][4] = 4;

        matriz2[3][0] = 25;
        matriz2[3][1] = 18;
        matriz2[3][2] = 24;
        matriz2[3][3] = 7;
        matriz2[3][4] = 55;

        matriz2[4][0] = 24;
        matriz2[4][1] = 15;
        matriz2[4][2] = 36;
        matriz2[4][3] = 5;
        matriz2[4][4] = 98;

        int[][] resultadoSuma = this.sumaDeMatrices(matriz1, matriz2);
        int[][] resultadoresta = this.RestaDeMatrices(matriz1, matriz2);
       this.reporte1 = this.reporte1+"Suma y resta de matrices opcion 2" +"\n";

        this.reporte1 = this.reporte1+"Esta es la matriz A" +"\n";
        this.impresionMatrices(matriz1);
        
        System.out.println("Esta es la matriz A");
        this.impresion(matriz1);
        
        this.reporte1 = this.reporte1+"Esta es la matriz B" +"\n";
        this.impresionMatrices(matriz2);
        System.out.println("Esta es la matriz B");
        
       this.impresion(matriz2);
         this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";
         this.reporte1 = this.reporte1+" resultado[i][j] = matrizA[i][j] + matrizB[i][j];" +"\n";
                        
        this.reporte1 = this.reporte1+" -------------Resultado------------------" +"\n";

       this.reporte1 = this.reporte1+"Esta es la suma de A y B" +"\n";
        this.impresionMatrices(resultadoSuma);

        
        System.out.println("Esta es la suma de A y B");
        this.impresion(resultadoSuma);
        
        this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";
        this.reporte1 = this.reporte1+" resultado[i][j] = matrizA[i][j] - matrizB[i][j];" +"\n";
              
        this.reporte1 = this.reporte1+" -------------Resultado------------------" +"\n";
        this.reporte1 = this.reporte1+"Esta es la resta de B y A" +"\n";
        this.impresionMatrices(resultadoresta);
        System.out.println("Esta es la resta de A y B");
        this.impresion(resultadoresta);

    }

    public void sumaYRestaDeMatricesOpcion3() {

        int[][] matriz1 = new int[5][5];
        int[][] matriz2 = new int[5][5];

        //             Matriz A
        matriz1[0][0] = 0;
        matriz1[0][1] = 1;
        matriz1[0][2] = 15;
        matriz1[0][3] = 5;
        matriz1[0][4] = 36;

        matriz1[1][0] = 1;
        matriz1[1][1] = 78;
        matriz1[1][2] = 65;
        matriz1[1][3] = 32;
        matriz1[1][4] = 4;

        matriz1[2][0] = 48;
        matriz1[2][1] = 66;
        matriz1[2][2] = 39;
        matriz1[2][3] = 0;
        matriz1[2][4] = 55;

        matriz1[3][0] = 14;
        matriz1[3][1] = 98;
        matriz1[3][2] = 63;
        matriz1[3][3] = 20;
        matriz1[3][4] = 15;

        matriz1[4][0] = 11;
        matriz1[4][1] = 39;
        matriz1[4][2] = 84;
        matriz1[4][3] = 7;
        matriz1[4][4] = 1;

        // Matriz B
        matriz2[0][0] = 78;
        matriz2[0][1] = 25;
        matriz2[0][2] = 66;
        matriz2[0][3] = 48;
        matriz2[0][4] = 98;

        matriz2[1][0] = 0;
        matriz2[1][1] = 45;
        matriz2[1][2] = 2;
        matriz2[1][3] = 3;
        matriz2[1][4] = 1;

        matriz2[2][0] = 2;
        matriz2[2][1] = 9;
        matriz2[2][2] = 14;
        matriz2[2][3] = 10;
        matriz2[2][4] = 20;

        matriz2[3][0] = 35;
        matriz2[3][1] = 87;
        matriz2[3][2] = 65;
        matriz2[3][3] = 2;
        matriz2[3][4] = 32;

        matriz2[4][0] = 25;
        matriz2[4][1] = 8;
        matriz2[4][2] = 4;
        matriz2[4][3] = 9;
        matriz2[4][4] = 39;

        int[][] resultadoSuma = this.sumaDeMatrices(matriz1, matriz2);
        int[][] resultadoresta = this.RestaDeMatrices(matriz1, matriz2);
       this.reporte1 = this.reporte1+"Suma y resta de matrices opcion 3" +"\n";

        this.reporte1 = this.reporte1+"Esta es la matriz A" +"\n";
        this.impresionMatrices(matriz1);
        
        System.out.println("Esta es la matriz A");
        this.impresion(matriz1);
        
        this.reporte1 = this.reporte1+"Esta es la matriz B" +"\n";
        this.impresionMatrices(matriz2);
        System.out.println("Esta es la matriz B");
        
       this.impresion(matriz2);
         this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";
         this.reporte1 = this.reporte1+" resultado[i][j] = matrizA[i][j] + matrizB[i][j];" +"\n";
                        
        this.reporte1 = this.reporte1+" -------------Resultado------------------" +"\n";

       this.reporte1 = this.reporte1+"Esta es la suma de A y B" +"\n";
        this.impresionMatrices(resultadoSuma);

        
        System.out.println("Esta es la suma de A y B");
        this.impresion(resultadoSuma);
        
        this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";
        this.reporte1 = this.reporte1+" resultado[i][j] = matrizA[i][j] - matrizB[i][j];" +"\n";
              
        this.reporte1 = this.reporte1+" -------------Resultado------------------" +"\n";
        this.reporte1 = this.reporte1+"Esta es la resta de B y A" +"\n";
        this.impresionMatrices(resultadoresta);
        System.out.println("Esta es la resta de A y B");
        this.impresion(resultadoresta);

    }

    public void divisionDeMatricesOpcion1() {

        float[][] matriz1 = new float[4][4];
        float[][] matriz2 = new float[4][4];

        //             Matriz A
        matriz1[0][0] = 5;
        matriz1[0][1] = 10;
        matriz1[0][2] = 1;
        matriz1[0][3] = 3;

        matriz1[1][0] = 9;
        matriz1[1][1] = 14;
        matriz1[1][2] = 2;
        matriz1[1][3] = 6;

        matriz1[2][0] = 7;
        matriz1[2][1] = 8;
        matriz1[2][2] = 15;
        matriz1[2][3] = 3;

        matriz1[3][0] = 6;
        matriz1[3][1] = 8;
        matriz1[3][2] = 9;
        matriz1[3][3] = 2;

        // Matriz B
        matriz2[0][0] = 5;
        matriz2[0][1] = 13;
        matriz2[0][2] = 9;
        matriz2[0][3] = 4;

        matriz2[1][0] = 1;
        matriz2[1][1] = 9;
        matriz2[1][2] = 6;
        matriz2[1][3] = 3;

        matriz2[2][0] = 8;
        matriz2[2][1] = 11;
        matriz2[2][2] = 69;
        matriz2[2][3] = 33;

        matriz2[3][0] = 25;
        matriz2[3][1] = 6;
        matriz2[3][2] = 7;
        matriz2[3][3] = 4;
        
        
        
                this.reporte1 = this.reporte1+" -------------Division Opcion 1------------------" +"\n";
        System.out.println("Esta es la divicion 1");
        
        float[][] respuesta = this.divisionMatrices(matriz1, matriz2);
        

        this.reporte1 = this.reporte1+" Esta es la matriz A" +"\n";

        System.out.println("Esta es la amtriz A");
        this.impresion(matriz1);
        this.impresionMatrices(matriz1);

        
        this.reporte1 = this.reporte1+" Esta es la matriz B" +"\n";

         System.out.println("Esta es la amtriz B");
        this.impresion(matriz2);
        this.impresionMatrices(matriz2);
                   this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";
                   this.reporte1 = this.reporte1+" A/B^-1 " +"\n";

        
        
         this.reporte1 = this.reporte1+" -------------Resultado------------------" +"\n";
         this.reporte1 = this.reporte1+" Respuesta A/B" +"\n";
       
        System.out.println("Respuesta matriz A/B");
        this.impresion(respuesta);
        this.impresionMatrices(respuesta);

    }

    public void divisionDeMatricesOpcion2() {

        float[][] matriz1 = new float[4][4];
        float[][] matriz2 = new float[4][4];

        //             Matriz A
        matriz1[0][0] = 1;
        matriz1[0][1] = 12;
        matriz1[0][2] = 9;
        matriz1[0][3] = 8;

        matriz1[1][0] = 7;
        matriz1[1][1] = 6;
        matriz1[1][2] = 3;
        matriz1[1][3] = 2;

        matriz1[2][0] = 0;
        matriz1[2][1] = 5;
        matriz1[2][2] = 6;
        matriz1[2][3] = 14;

        matriz1[3][0] = 6;
        matriz1[3][1] = 9;
        matriz1[3][2] = 6;
        matriz1[3][3] = 10;

        // Matriz B
        matriz2[0][0] = 8;
        matriz2[0][1] = 19;
        matriz2[0][2] = 20;
        matriz2[0][3] = 4;

        matriz2[1][0] = 12;
        matriz2[1][1] = 33;
        matriz2[1][2] = 6;
        matriz2[1][3] = 8;

        matriz2[2][0] = 4;
        matriz2[2][1] = 5;
        matriz2[2][2] = 9;
        matriz2[2][3] = 7;

        matriz2[3][0] = 8;
        matriz2[3][1] = 22;
        matriz2[3][2] = 14;
        matriz2[3][3] = 6;

                this.reporte1 = this.reporte1+" -------------Division Opcion 2------------------" +"\n";
        System.out.println("Esta es la divicion 1");
        
        float[][] respuesta = this.divisionMatrices(matriz1, matriz2);
        

        this.reporte1 = this.reporte1+" Esta es la matriz A" +"\n";

        System.out.println("Esta es la amtriz A");
        this.impresion(matriz1);
        this.impresionMatrices(matriz1);

        
        this.reporte1 = this.reporte1+" Esta es la matriz B" +"\n";

         System.out.println("Esta es la amtriz B");
        this.impresion(matriz2);
        this.impresionMatrices(matriz2);
                  this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";
                   this.reporte1 = this.reporte1+" A/B^-1 " +"\n";

          this.reporte1 = this.reporte1+" -------------Resultado------------------" +"\n";
       
         this.reporte1 = this.reporte1+" Respuesta A/B" +"\n";
       
        System.out.println("Respuesta matriz A/B");
        this.impresion(respuesta);
        this.impresionMatrices(respuesta);

    }

    public void divisionDeMatricesOpcion3() {

        float[][] matriz1 = new float[4][4];
        float[][] matriz2 = new float[4][4];

        //             Matriz A
        matriz1[0][0] = 5;
        matriz1[0][1] = 9;
        matriz1[0][2] = 14;
        matriz1[0][3] = 5;

        matriz1[1][0] = 6;
        matriz1[1][1] = 0;
        matriz1[1][2] = 5;
        matriz1[1][3] = 3;

        matriz1[2][0] = 1;
        matriz1[2][1] = 14;
        matriz1[2][2] = 68;
        matriz1[2][3] = 8;

        matriz1[3][0] = 7;
        matriz1[3][1] = 5;
        matriz1[3][2] = 3;
        matriz1[3][3] = 9;

        // Matriz B
        matriz2[0][0] = 0;
        matriz2[0][1] = 9;
        matriz2[0][2] = 7;
        matriz2[0][3] = 19;

        matriz2[1][0] = 2;
        matriz2[1][1] = 30;
        matriz2[1][2] = 5;
        matriz2[1][3] = 48;

        matriz2[2][0] = 1;
        matriz2[2][1] = 31;
        matriz2[2][2] = 2;
        matriz2[2][3] = 5;

        matriz2[3][0] = 15;
        matriz2[3][1] = 8;
        matriz2[3][2] = 4;
        matriz2[3][3] = 3;

                this.reporte1 = this.reporte1+" -------------Division Opcion 3------------------" +"\n";
        System.out.println("Esta es la divicion 1");
        
        float[][] respuesta = this.divisionMatrices(matriz1, matriz2);
        

        this.reporte1 = this.reporte1+" Esta es la matriz A" +"\n";

        System.out.println("Esta es la amtriz A");
        this.impresion(matriz1);
        this.impresionMatrices(matriz1);

        
        this.reporte1 = this.reporte1+" Esta es la matriz B" +"\n";

         System.out.println("Esta es la amtriz B");
        this.impresion(matriz2);
        this.impresionMatrices(matriz2);
        
             this.reporte1 = this.reporte1+" -------------Ecuacion------------------" +"\n";
             this.reporte1 = this.reporte1+" A/B^-1 " +"\n";

           this.reporte1 = this.reporte1+" -------------Resultado------------------" +"\n";
     
         this.reporte1 = this.reporte1+" Respuesta A/B" +"\n";
       
        System.out.println("Respuesta matriz A/B");
        this.impresion(respuesta);
        this.impresionMatrices(respuesta);

    }

    public float[][] cofactores(float matriz[][]) {

        float[][] matrizC = new float[4][4];

        for (int j = 0; j < 4; j++) {

            for (int i = 0; i < 4; i++) {

                float[][] subMatriz = new float[3][3];
                int posY = 0;
                for (int b = 0; b < 4; b++) {
                    int posX = 0;
                    for (int a = 0; a < 4; a++) {
                        if (i != a && j != b) {
                            subMatriz[posX][posY] = matriz[a][b];
                            posX++;
                        }
                    }
                    if (j != b) {
                        posY++;
                    }
                }

                float subDeterminante = this.determinante3x3(subMatriz);

                if ((i + j) % 2 == 0) {

                    subDeterminante = subDeterminante * 1;
                } else {

                    subDeterminante = subDeterminante * -1;
                }
                matrizC[i][j] = subDeterminante;
            }
        }

        return matrizC;
    }

    public float determinante4x4(float matriz[][]) {

        float resultado = 0;

        float ter1 = matriz[0][0] * matriz[1][1] * matriz[2][2] * matriz[3][3];
        float ter2 = matriz[0][0] * matriz[1][1] * matriz[3][2] * matriz[2][3];
        float ter3 = matriz[0][0] * matriz[2][1] * matriz[1][2] * matriz[3][3];
        float ter4 = matriz[0][0] * matriz[2][1] * matriz[3][2] * matriz[1][3];
        float ter5 = matriz[0][0] * matriz[3][1] * matriz[1][2] * matriz[2][3];
        float ter6 = matriz[0][0] * matriz[3][1] * matriz[2][2] * matriz[1][3];
        float ter7 = matriz[1][0] * matriz[0][1] * matriz[2][2] * matriz[3][3];
        float ter8 = matriz[1][0] * matriz[0][1] * matriz[3][2] * matriz[2][3];
        float ter9 = matriz[1][0] * matriz[2][1] * matriz[0][2] * matriz[3][3];
        float ter10 = matriz[1][0] * matriz[2][1] * matriz[3][2] * matriz[0][3];
        float ter11 = matriz[1][0] * matriz[3][1] * matriz[0][2] * matriz[2][3];
        float ter12 = matriz[1][0] * matriz[3][1] * matriz[2][2] * matriz[0][3];
        float ter13 = matriz[2][0] * matriz[0][1] * matriz[1][2] * matriz[3][3];
        float ter14 = matriz[2][0] * matriz[0][1] * matriz[3][2] * matriz[1][3];
        float ter15 = matriz[2][0] * matriz[1][1] * matriz[0][2] * matriz[3][3];
        float ter16 = matriz[2][0] * matriz[1][1] * matriz[3][2] * matriz[0][3];
        float ter17 = matriz[2][0] * matriz[3][1] * matriz[0][2] * matriz[1][3];
        float ter18 = matriz[2][0] * matriz[3][1] * matriz[1][2] * matriz[0][3];
        float ter19 = matriz[3][0] * matriz[0][1] * matriz[1][2] * matriz[2][3];
        float ter20 = matriz[3][0] * matriz[0][1] * matriz[2][2] * matriz[1][3];
        float ter21 = matriz[3][0] * matriz[1][1] * matriz[0][2] * matriz[2][3];
        float ter22 = matriz[3][0] * matriz[1][1] * matriz[2][2] * matriz[0][3];
        float ter23 = matriz[3][0] * matriz[2][1] * matriz[0][2] * matriz[1][3];
        float ter24 = matriz[3][0] * matriz[2][1] * matriz[1][2] * matriz[0][3];

        resultado = ter1 - ter2 - ter3 + ter4 + ter5 - ter6 - ter7 + ter8 + ter9 - ter10 - ter11 + ter12 + ter13 - ter14 - ter15 + ter16 + ter17 - ter18 - ter19 + ter20 + ter21 - ter22 - ter23 + ter24;
        return resultado;
    }

    public float determinante3x3(float matriz[][]) {

        float suma = 0;
        int dimension = matriz.length;

        for (int i = 0; i < dimension; i++) {
            int posX = 0;
            int posY = i;
            float acumulador = 1;
            for (int j = 0; j < dimension; j++) {
                acumulador = acumulador * matriz[posX][posY];
                posX++;
                posY++;
                if (posY > dimension - 1) {
                    posY = 0;
                }
            }
            suma = suma + acumulador;
        }
        float resta = 0;
        int auxiliar = 0;
        for (int i = 0; i < dimension; i++) {
            int posX = dimension - 1;
            int posY = auxiliar;
            float acumulador = 1;
            for (int j = 0; j < dimension; j++) {
                acumulador = acumulador * matriz[posX][posY];
                posX--;
                posY++;
                if (posY > dimension - 1) {
                    posY = 0;
                }
            }
            resta = resta + acumulador;
            auxiliar++;
        }
        float resultado = suma - resta;

        return resultado;
    }

    public float[][] traspuesta(float matriz[][]) {

        float matrizT[][] = new float[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }
        return matrizT;
    }

    public float[][] inversa(float matriz[][]) {

        float matrizDet = this.determinante4x4(matriz);
        float[][] matrizAdj = this.adjunta(matriz);
        float[][] resultado = new float[4][4];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                resultado[i][j] = ((float) matrizAdj[i][j]) / matrizDet;

            }
        }

        return resultado;
    }

    public float[][] adjunta(float matriz[][]) {
        float[][] matrizC = this.cofactores(matriz);
        float[][] matrizT = this.traspuesta(matrizC);
        return matrizT;
    }

    public float[][] divisionMatrices(float[][] matrizA, float matrizB[][]) {

        float[][] valInversa = this.inversa(matrizB);
        float[][] valMultiplicacion = this.multiplicacion(matrizA, valInversa);

        return valMultiplicacion;

    }

    public float[][] multiplicacion(float matrizA[][], float matrizB[][]) {
        float resultado[][] = new float[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                float[] columnaB = this.devolverColumna(matrizA, j);
                resultado[i][j] = this.miniMulti(matrizB[i], columnaB);
            }
        }

        return resultado;
    }

    public float[] devolverColumna(float[][] matriz, int columna) {
        float[] retorno = new float[4];
        int indice = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                if (j == columna) {
                    retorno[indice] = matriz[i][j];
                    indice++;
                }
            }
        }
        return retorno;
    }

    public float miniMulti(float[] fila, float[] columna) {

        float acumulador = 0;
        for (int j = 0; j < 4; j++) {
            acumulador = acumulador + fila[j] * columna[j];
        }

        return acumulador;
    }

    public void impresion(int[][] matrizA) {
        int[][] sumaDeMatrices = matrizA;
        int largo = sumaDeMatrices.length;

        for (int i = 0; i < largo; i++) {

            for (int j = 0; j < largo; j++) {

                System.out.print("|" + sumaDeMatrices[i][j]);
                String salto = "  ";
                System.out.print(salto);
            }
            System.out.println("|");
        }

    }

    public void impresion(float[][] matrizA) {
        float[][] sumaDeMatrices = matrizA;
        DecimalFormat df= new DecimalFormat ("#.000");
        int largo = sumaDeMatrices.length;


        for (int i = 0; i < largo; i++) {

            for (int j = 0; j < largo; j++) {

                System.out.print("|" + df.format(sumaDeMatrices[i][j]));
                String salto = "  ";
                System.out.print(salto);
            }
            System.out.println("|");
        }

    }
    
     public void impresionMatrices(float[][] matrizA) {
        float[][] sumaDeMatrices = matrizA;
        int largo = sumaDeMatrices.length;
        DecimalFormat df= new DecimalFormat ("#.000");
 
        String mat = "<table style=\"width:100%\">";

        for (int i = 0; i < largo; i++) {
             mat = mat +"<tr>";
            for (int j = 0; j < largo; j++) {
                 mat = mat +"<td>";
                 mat = mat +df.format(sumaDeMatrices[i][j]);
                 mat = mat +"</td>";
            }
            mat = mat +"</tr>";
        }
        
        mat = mat +"</table>\n";
        
        this.reporte1 = this.reporte1 + mat;

    }
     
      public void impresionMatrices(int[][] matrizA) {
        int[][] sumaDeMatrices = matrizA;
        int largo = sumaDeMatrices.length;
 
        String mat = "<table style=\"width:100%\">";

        for (int i = 0; i < largo; i++) {
             mat = mat +"<tr>";
            for (int j = 0; j < largo; j++) {
                 mat = mat +"<td>";
                 mat = mat +(sumaDeMatrices[i][j]);
                 mat = mat +"</td>";
            }
            mat = mat +"</tr>";
        }
        
        mat = mat +"</table>\n";
        
        this.reporte1 = this.reporte1 + mat;

    }
    
    

}
