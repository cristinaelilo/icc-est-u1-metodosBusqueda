public class MetodosBusqueda {

    public int busquedaSecuencial(int[] arreglo, int valorBuscado){
        //int pos = -1;
        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i] == valorBuscado){
                return i;
            }
        }
        return -1;
    }

    public int busquedaBinaria(int[] arr, int value){
        int inicio = 0;
        int fin = arr.length -1;

        while (inicio <= fin){
            int medio = inicio + (fin - inicio) /2;

            if(arr[medio] == value){
                //Elemento encontrado
                return medio;
            }
            if(arr[medio] < value){
                //Buscar en la mitad de la derecha
                inicio = medio +1;
            }else{
                fin = medio -1; //Buscar en la mitad de la izquierda
            }
        }
        return -1;
    }

    public void printArreglo(int[] arreglo){
        for (int elem : arreglo)
        {
            System.out.println(elem + " ");
        }
    }
}
