
import java.lang.*;

public class Main {
    static int [][] Multiplicar_Matrices(int [][]matrizA, int [][]matrizB){
        int ColA = matrizA[0].length; // Columnas de la matriz A
        int FilA = matrizA.length; // Filas de la matriz A
        int ColB = matrizB[0].length; // Columnas de la matriz B
        int FilB = matrizB.length; // Filas de la matriz B
        int [][] resultado_multiplicacion = new int [FilA][ColB]; // Matriz Resultado
        int i,j,k =0;
        if (ColA==FilB) {
            for (i=0; i<resultado_multiplicacion.length;i++) {
                for (j=0; j<resultado_multiplicacion[i].length;j++) {
                    for (k=0; k<matrizA.length;k++) {
                        resultado_multiplicacion[i][j]+= matrizA[i][k]*matrizB[k][j];
                    }
                }
            }
        }
        return resultado_multiplicacion;
    }

    public static void main(String[] args) {
        int n=150;
        long Ti,Tf;
        double tiempo_total;
        double [] tiempos = new double[n-1];
        double aux = 0;

        // Declarar matrices
        for(int i=2; i<n+1; i++) {
            int matrizA[][] = new int[i][i];
            int matrizB[][] = new int[i][i];
            int resultado[][] = new int[i][i];

            // Llenar matrices
            for (int k = 0; k < i; k++) {
                for (int j = 0; j < i; j++) {
                    matrizA[k][j] = 1;
                    matrizB[k][j] = 2;
                }
            }

            for(int j=0; j<10;j++){
                Ti = System.nanoTime();
                resultado = Multiplicar_Matrices(matrizA,matrizB);
                Tf = System.nanoTime();
                tiempo_total = ((Tf - Ti)/(2*(Math.pow((double)i, 3.0))));
                aux += tiempo_total;
            }
            tiempos[i-2]=  ((aux/10.0)*0.000000001);

        }

        for(int count =0; count<tiempos.length; count++){
            System.out.println("Tamaño de la matriz: " + (count+2) + "  Tiempo multiplicacion: " + tiempos[count]);
        }
    }
}
