import java.util.Arrays;
import java.util.Comparator; //Usamos comparator para ordenar. Using comparator to sort the 2D array using a column
import java.util.Scanner;


public class u4ea 
{

    //Creamos método cls para limpiar la pantalla cuando se invoque.
    //Creating method cls for cleaning the sreen when called.
    public static void cls() {  
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    //Creamos método enterContinuar para detener el programa hasta que se ingrese una línea.
    //Creating method enterContinuar to stop the program until an ENTER is captured.
    public static void enterContinuar(){
        System.out.println("Presione \"ENTER\" para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

    }

    //Creamos método resultados para imprimir en pantalla el Array capturado.
    //Creating a method resultados to print to screen the captured Array.
    //We use 2 for loops (one to iterate the rows, the other for columns)
    public static void resultados(String[][]ArregloDoble) {
        System.out.println("\n\nResultado de la captura\n");

        for (int fila = 0; fila < ArregloDoble.length; fila++) {
            System.out.printf("Cliente %2s", (fila+1));

            for (int col = 0; col < ArregloDoble[fila].length; col++) {
                System.out.printf("%20s", ArregloDoble[fila][col]);
            }

            System.out.println("\n");
        }
    }

    // Creamos método buscarID para buscar un valor en la columa Id.
    // Creating buscarID method to search for a value in Id column.
    // First, extract the ID array with help from a for loop.
    // Then, with another for loop, and an if statement we compare each element of the Id array with the search term. (using .equals)
    // In case we find the element in the array, we assign the value of i to a variable idx (this is the number of the file where the value was found)
    // 
    public static void buscarId(String[][]ArregloDoble) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-".repeat(45)+"\n"+" ".repeat(5)+"Búsqueda de clientes por Id."+" ".repeat(5));
        System.out.println("Ingrese el Id a buscar: ");
        String id = sc.nextLine();
        String[] arr = new String[10];

        int idx = -1;

        //Obtenemos el arreglo de los ID
        //Getting the Id array
        for(int i = 0; i < ArregloDoble.length;i++)  {
            arr[i] = ArregloDoble[i][0];
        }
        System.out.printf(Arrays.toString(arr));

        try {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i].equals(id)) {
                    System.out.println("\n¡Se encontró "+ (i+1) + " en el array!\n");
                    idx = i;
                    System.out.println("\nEl valor se encuentra en la posición: "+ idx);
                }
            }
    
            String [] encabeza = {"Id","Nombre","Domicilio","Edad","Teléfono"};
    
            System.out.println();
            for(int k =0; k < ArregloDoble[0].length; k++) {
                System.out.printf(encabeza[k]+": "+ArregloDoble[idx][k]+"\n");
            }
            
        } catch (Exception e) {
            System.out.println("El valor no se encontró en la columna Id.");
        }
        
    }

    public static void buscarNombre(String[][]ArregloDoble) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-".repeat(45)+"\n"+" ".repeat(5)+"Búsqueda de clientes por Nombre."+" ".repeat(5));
        System.out.println("Ingrese el nombre a buscar: ");
        String nombre = sc.nextLine();
        String[] arr = new String[10];

        int idx = -1;

        //Obtenemos el arreglo de los ID
        //Getting the Id array
        for(int i = 0; i < ArregloDoble.length;i++)  {
            arr[i] = ArregloDoble[i][1];
        }
        System.out.printf(Arrays.toString(arr));

        //Usando try - catch, para evitar el error de excepción en caso de que no se encuentre el valor en el array.
        //Using try - catch, to deal with errors in case of exception error, when the value is nos found in the array.
        try {

            for(int i = 0; i < arr.length; i++) {
                //Esta es la búsqueda del valor
                //Searching for the value in the array
                if(arr[i].equals(nombre)) {
                    System.out.println("\n¡Se encontró "+ nombre + " en el array!\n");
                    idx = i;
                    System.out.println("\nEl valor se encuentra en la posición: "+ idx);
                }
            }


            //Imprimiendo la fila del resultado, usando idx (con el número de fila)
            //Printing the file, using idx (file number)
            String [] encabeza = {"Id","Nombre","Domicilio","Edad","Teléfono"};
    
            System.out.println();
            for(int k =0; k < ArregloDoble[0].length; k++) {
                System.out.printf(encabeza[k]+": "+ArregloDoble[idx][k]+"\n");
            }
            
        } catch (Exception e) {
            System.out.println("El valor no se encontró en la columna Id.");
        }
        
    }


    //Creando método captura para ingresar los datos al array.
    //Creating method captura, to input data into the array.
    //We use for loop to iterate over the array, and also the scanner to accept input through the keyboard.
    public static String[][] captura(String[][] ArregloDoble) {
        Scanner sc = new Scanner(System.in);

        String[][] ArrDoble = new String [10][5] ;
        for (int fila = 0; fila < ArregloDoble.length; fila++) {
            cls();
            System.out.println("-".repeat(30)+"\n DATOS DEL CLIENTE "+(fila+1)+"\n"+"-".repeat(30));
            for (int col = 0 ;col < ArregloDoble[fila].length; col++) {
                
                //Dependiendo del número de iteración en la columna (col) la instrucción de captura cambia
                //Depending on the iteration number in the column (col) the instruction to input data changes for the user.
                if (col == 0) {
                    ArregloDoble[fila][col] = Integer.toString(fila+1); 
                } else if (col == 1) {
                    System.out.printf("\nIngrese el nombre del cliente "+ (fila+1)+": ");
                    ArregloDoble[fila][col] = sc.nextLine();
                } else if (col == 2) {
                    System.out.printf("\nIngrese el domicilio del cliente "+ (fila+1)+": ");
                    ArregloDoble[fila][col] = sc.nextLine();
                } else if (col == 3) {
                    System.out.printf("\nIngrese la edad del cliente "+ (fila+1)+": ");
                    ArregloDoble[fila][col] = sc.nextLine();
                } else if (col == 4) {
                    System.out.printf("\nIngrese el teléfono del cliente "+ (fila+1)+": ");
                    ArregloDoble[fila][col] = sc.nextLine();
                }
            }
        }
        return ArrDoble;
    }

    
    //Creando el método ordena, para ordenar el array conforme a la edad de los clientes.
    //Creating method ordena, which orders the array according the age (column) of the clients.
    public static void Ordena(String[][] arr){

        //Usamos el método sort y comparator, para comparar y ordenar los elementos del array
        //Using sort method and comparator, to compare and order the elements of the array.
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(final String[] primero, final String[] segundo) {
                final String uno = primero[3];
                final String dos = segundo[3];
                return uno.compareTo(dos);
            }
        });

        //Imprimir el encabezado del array
        //Printing array headers
        System.out.printf("\n           Clientes ordenados por edad. \n");
        System.out.println("-".repeat(60)+"\n");
        String [] encabeza = {"Id","Nombre","Domicilio","Edad","Teléfono"};
        System.out.println();
            for(int k =0; k < encabeza.length; k++) {
                System.out.printf("%18s", encabeza[k]);
            }
        System.out.println();


        //Imprimir el array ordenado
        //Printing the array in order according to ages (col Edad)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%18s", arr[i][j]);
            }
            System.out.println();
        }
    }

    //Main class
    public static void main(String[] args) {

        String[][] ArregloDoble = new String[10][5];      

        System.out.println("*".repeat(55)+"\n        SISTEMA PARA CAPTURA DE DATOS DE CLIENTES        \n"+"*".repeat(55));

        System.out.println("\nCapturar los datos requeridos: \n");

        captura(ArregloDoble);

        Scanner sc = new Scanner(System.in);

        
        // MENÚ utilizando do-while y switch-case
        // MENU using do-while and switch-case
        int opcion = 0;

        do {
            cls();
            
            System.out.printf("*".repeat(45)+"\nSeleccione alguna de las opciones: \n\n");
            System.out.println("1. Mostrar datos capturados.");
            System.out.println("2. Buscar datos por Id del cliente.");
            System.out.println("3. Buscar datos por nombre del cliente.");
            System.out.println("4. Capturar datos de clientes (se reemplazarán).");
            System.out.println("5. Mostrar datos de clientes ordenados por edad.");
            System.out.println("\n6. Salir. \n");
            System.out.printf("*".repeat(45)+"\n\n");

            opcion = sc.nextInt();
            cls();


            switch (opcion) {
                case 1:
                    System.out.println("-".repeat(60)+"\n");
                    resultados(ArregloDoble);
                    System.out.println("-".repeat(60)+"\n");
                    enterContinuar();
                        break;

                case 2:
                    System.out.println("-".repeat(60)+"\n");
                    buscarId(ArregloDoble);
                    System.out.println("-".repeat(60)+"\n");
                    enterContinuar();
                        break;

                case 3:
                    System.out.println("-".repeat(60)+"\n");
                    buscarNombre(ArregloDoble);
                    System.out.println("-".repeat(60)+"\n");
                    enterContinuar();
                        break;
                case 4:
                    System.out.println("-".repeat(60)+"\n");
                    captura(ArregloDoble);
                    System.out.println("-".repeat(60)+"\n");
                    enterContinuar();
                    break;
                case 5:
                    System.out.println("-".repeat(60)+"\n");
                    Ordena(ArregloDoble);
                    System.out.println("-".repeat(60)+"\n");
                    enterContinuar();
                        break;
            } 
        } while (opcion != 6); //Se cierra el loop del menú.*/

    }
}