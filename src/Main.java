import javax.lang.model.SourceVersion;
import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Inicialización de pilas y variables
        Stack<String> myStackOne = new Stack<>(); //Pila inicial
        Stack<String> myStackTwo = new Stack<>(); //Pila secundaria
        int op = 0;
        String text;

        // Implementación de do while
        do {
            // Creación de menú consola
            System.out.println("Bienvenido !!\n");

            System.out.println("Escoja la accion que desea realizar (1-5)\n");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar texto");
            System.out.println("5. Salir");

            if (sc.hasNextInt()){
                op = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer después de leer un entero

            } else {
                System.out.println("Por favor ingrese solo numeros 1-5\n"); //Mensaje de error
                sc.next(); // Limpiar la entrada no válida
                continue; // Volver al inicio del bucle
            }


            // Implementación para entrar a cada caso del menú consola
            switch (op) {
                case 1: //Ingresar por consola el texto
                    System.out.println("Escribir texto");
                    text = sc.nextLine();

                    myStackOne.push(text); //Agregar el texto ingresado a la pila 1
                    System.out.println(myStackOne); //Imprime la pila 1
                    break;

                case 2: //Borra el último texto de la pila 1
                    if (!myStackOne.isEmpty()){ //Valida sí la pila 1 tiene datos
                        myStackTwo.push(myStackOne.pop()); //.pop elimina pila 1 y .push añade a pila 2
                        System.out.println("Texto borrado");
                    } else{
                        System.out.println("No se encontro texto para borrar"); //Sí la pila vacía muestra mensaje
                    }
                    System.out.println(myStackOne); //Imprime pila 1
                    System.out.println(myStackTwo); //Imprime pila 2
                    break;

                case 3: //Rehace el texto de la pila 1
                    if (!myStackTwo.isEmpty()){ //Valida sí la pila 2 tiene datos
                        myStackOne.push(myStackTwo.pop()); //.pop elimina la pila 2 y .push inserta la pila 1
                        System.out.println("Texto reconstruido");
                    } else{
                        System.out.println("No se encontro texto para rehacer"); //Sí la pila vacía muestra mensaje
                    }
                    System.out.println(myStackOne); //Imprime pila 1
                    System.out.println(myStackTwo); //Imprime pila 2
                    break;

                case 4: //Muestra el texto actual
                    if (!myStackOne.isEmpty()){//Valida sí la pila 1 tiene datos
                        System.out.println("Este es el texto actual: " + myStackOne.peek()); //.peek muestra el último dato de la pila 1 y se concatena con el mensaje
                    } else{
                        System.out.println("No se encontro texto");//Sí la pila vacía muestra mensaje
                    }
                    break;

                case 5://Salir del programa
                    System.out.println("Gracias, vuelva pronto!");//Mensaje de despedida
                    break;

                default://Valida que la opción ingresada sea correcta
                    System.out.println("Opcion incorrecta\n");//Mensaje de error
                    break;
            }
        }  while (op != 5);//Sí la opción es diferente de 5 se repite el menú
        sc.close(); //Cierra el scanner

    }
}