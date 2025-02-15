package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};

        insert(arr);

        for (int num : arr){
            System.out.println(num);
        }
    }
    public static void bubble(int[] arr){
// Obtener la longitud del arreglo
        int n = arr.length;

// recorro el array
        for (int i = 0; i < n - 1; i++) {
            //comparar y ordenar los elementos
            for (int j = 0; j < n - i - 1; j++) {
                // Comparo el indice para ver si es mayor el indice siguiente si es mayor entra e intercambia las posiciones
                if (arr[j] > arr[j+1]) {
                    // Intercambiar los elementos si están en el orden incorrecto
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
            }
        }
    }
    public static void insert(int[] arr){
// Obtener la longitud del arreglo
        int n = arr.length;

// recorro el array
        for (int i = 1; i < n; i++) {

            //Guarda el valor del indice i
            int temp = arr[i];
            //Inicio el indice j en uno menos que i para que empiece en indice 0
            //Se compara que j no sea menor que 0 para que no de error y si j es mayor que el valor de temporal
            for (int j = i-1; j >= 0 && arr[j] > temp; j--) {
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
            System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]+" "+arr[6]+" "+arr[7]+" "+arr[8]);
        }
    }
}
