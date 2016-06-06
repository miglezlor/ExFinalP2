package examenfinalparte2;


import javax.swing.JOptionPane;

public class Principal {

    public static boolean nPrimo = false;

    public static void main(String arg[]) {
        
        int ndig = 0;
        int numDig = introdNumDig();
        
        for (int i = 1; i <= 99999; i++) {
            int aux = i;

            int contador = 0;

            while (aux != 0) {
                aux = aux / 10;
                contador++;
            }
            ndig = contador;
            comprobPrimos(ndig, numDig, i);
        }
    }

    public static void comprobPrimos(int ndig, int numDig, int i) {
        if (ndig == numDig) {
            if (i < 4) {
                nPrimo = true;
            } else {
                if (i % 2 == 0) {
                    nPrimo = false;
                } else {
                    int contador1 = 0;
                    int i1 = 1;
                    int k = (i - 1) / 2;
                    if (k % 2 == 0) {
                        k--;
                    }
                    
                    while (i1 <= k) {
                        if (i % i1 == 0) {
                            contador1++;
                        }
                        i1 += 2;
                        if (contador1 == 2) {
                            i1 = k + 1;
                        }
                    }
                    
                    if (contador1 == 1) {
                        nPrimo = true;
                    }
                }
            }
            
            if (nPrimo == true) {
                System.out.println(i);
            }
        }
    }
    /** Metodo para pedir al usuario el numero de digitos que quiere
     * @return El numero de digitos introducido
     */
    public static int introdNumDig(){
        int numDig = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero digitos"));
        if (numDig <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        return numDig;
    }

}
