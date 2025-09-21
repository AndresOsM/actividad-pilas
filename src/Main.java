import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> myStack = new Stack<>();
        Stack<String> mypila = new Stack<>();
        int op;
        String text;

        do {
            System.out.println("Bienvenido !!");

            System.out.println("Escoja la accion que desea realizar (1-5)");
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

                    myStack.push(text);
                    System.out.println(myStack);
                    break;

                case 2:
                    if (!myStack.isEmpty()){
                        mypila.push(myStack.pop());
                        System.out.println("Texto borrado");
                    } else{
                        System.out.println("No se encontro texto para borrar");
                    }
                    System.out.println(myStack);
                    break;

                case 3:
                    if (!myStack.isEmpty()){
                        myStack.push(mypila.pop());
                        System.out.println("Texto reconstruido");
                    } else{
                        System.out.println("No se encontro texto para rehacer");
                    }
                    System.out.println(myStack);
                    break;

                case 4:
                    if (!myStack.isEmpty()){
                        System.out.println("Este es el texto actual: " + myStack.peek());
                    } else{
                        System.out.println("No se encontro texto");
                    }
                    break;

            }
        }  while (op != 5);

    }
}