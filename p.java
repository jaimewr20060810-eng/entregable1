package u4;
/**
* Clase que analiza un conjunto de números enteros.
* Funcionalidades:
* Comprueba si el valor máximo se repite
* Calcula la media del conjunto
* Evalúa si la media es suficiente
*/
public class p {
	
    public static void main(String[] args) {
    	// Array de números enteros
        int[] nuemros = {5, 7, 3, 7, 2, 9, 7};
     // Variables auxiliares
        int nemRepetido = 0;
        int repetidos = 0;
        int max= nuemros[0];
        /**
         * Busca el valor máximo del array
         */
        for (int i = 1; i < nuemros.length; i++) {
            if (nuemros[i] > max) {
                max = nuemros[i];
            }
        }
        /**
         * Cuenta cuántas veces se repite el número máximo
         */
        for (int i = 0; i < nuemros.length; i++) {
            if (nuemros[i] == max) {
                nemRepetido++;
            }
        }
        /**
         * Comprueba si el número máximo se repite más de una vez
         */
        if (nemRepetido > 1) {
            repetidos = 1;
        }
        /**
         * Muestra por pantalla si el número máximo está repetido
         */
        if (repetidos == 1) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        // Cálculo de la suma de los elementos del array
        int suma = 0;
        for (int i = 0; i < nuemros.length; i++) {
            suma += nuemros[i];
        }
        /**
         * Cálculo de la media del array
         */
        double media = (double) suma / nuemros.length;
        System.out.println(media);
        /**
         * Comprueba si la media es mayor o igual que 5
         */
        if (media >= 5) {
            System.out.println("BIEN");
        } else {
            System.out.println("MAL");
        }
    }
}

