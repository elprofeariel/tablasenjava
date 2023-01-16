package com.mycompany.prytablas;

/**
 *
 * @author guio
 */
public class CuadradoMagico {

    private int[][] matriz;
    private int n;

    public CuadradoMagico(int n) {
        this.n = n;
        matriz = new int[n][n];
    }

    public void generar() {
        int fila, poio, valor = 1;
        fila = 0;
        poio = n / 2;
        System.out.println("COLUMNA=" + poio);
        do {
            if (matriz[fila][poio] != 0) {
                poio--;
                fila = fila + 2;
            }
            matriz[fila][poio] = valor;
            //REVISAR SI ES ESQUINA
            if(fila==0 && poio==(n-1)){
                fila=1;                
            }else{
                fila--;
                if (fila < 0) {
                    fila = n - 1;
                }
                poio++;
                if (poio >= n) {
                    poio = 0;
                }
            }
            valor++;
        } while (valor <= n * n);
    }
    
    public int[][] getMatriz(){
        return matriz;
    }
}
