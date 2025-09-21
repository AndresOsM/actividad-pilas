import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> myStackOne = new Stack<>();
        Stack<String> myStackTwo = new Stack<>();
        int op;
        String text;

        do {
            System.out.println("Bienvenido !!\n");

            System.out.println("Escoja la accion que desea realizar (1-5)\n");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar texto");
            System.out.println("5. Salir");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Escribir texto");
                    text = sc.nextLine();

                    myStackOne.push(text);
                    System.out.println(myStackOne);
                    break;

                case 2:
                    if (!myStackOne.isEmpty()){
                        myStackTwo.push(myStackOne.pop());
                        System.out.println("Texto borrado");
                    } else{
                        System.out.println("No se encontro texto para borrar");
                    }
                    System.out.println(myStackOne);
                    System.out.println(myStackTwo);
                    break;

                case 3:
                    if (!myStackTwo.isEmpty()){
                        myStackOne.push(myStackTwo.pop());
                        System.out.println("Texto reconstruido");
                    } else{
                        System.out.println("No se encontro texto para rehacer");
                    }
                    System.out.println(myStackOne);
                    break;

                case 4:
                    if (!myStackOne.isEmpty()){
                        System.out.println("Este es el texto actual: " + myStackOne.peek());
                    } else{
                        System.out.println("No se encontro texto");
                    }
                    break;

                case 5:
                    System.out.println("Gracias, vuelva pronto!");
                    break;

                default:
                    System.out.println("Opcion incorrecta\n");
            }
        }  while (op != 5);

    }
}