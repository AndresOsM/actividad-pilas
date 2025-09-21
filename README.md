# OBJETIVO DEL PROYECTO

Desarrollar un editor de texto sencillo en consola utilizando el lenguaje Java, que permita al usuario escribir texto, deshacer (Undo) y rehacer (Redo) acciones mediante el uso de pilas (stacks) implementadas manualmente, con el fin de comprender su estructura y funcionamiento. Además, fomentar el trabajo colaborativo mediante el uso de GitHub para el control de versiones y la contribución activa de todos los integrantes del equipo.

## Intrucciones de ejecución.


Al ejecutar el proyecto inicalmente nos muestra un menú en consola.
<img width="1761" height="316" alt="image" src="https://github.com/user-attachments/assets/56126e5f-1b5d-4966-be71-9a6bdfa0fe4d" />
En este menu escogeremos la acción que queremos realizar.



<img width="1809" height="380" alt="image" src="https://github.com/user-attachments/assets/9eeecb2c-f2d3-4425-b888-8c46c8dee4b9" />
Escogemos la opcion 1 para insertar el texto "Hola".



<img width="1758" height="332" alt="image" src="https://github.com/user-attachments/assets/47b2c0c8-16c1-48c0-b451-f648ea807adb" />
Arriba observamos como se va llenando la pila inicial por cada texto que escribimos.



<img width="1379" height="299" alt="image" src="https://github.com/user-attachments/assets/9d243681-d8c7-4e66-a047-09122127380e" />
En total añadimos dos textos. "Hola" "Mundo"



<img width="1559" height="387" alt="image" src="https://github.com/user-attachments/assets/26d22796-a3f8-4929-82ea-eff46ef95717" />
Al entrar a la opción 2, deshacemos el utlimo texto (Texto en la cima de la pila) utilizando pop, y lo añadimos en la segunda pila usando push y nos muestra mensaje del texto borrado.



<img width="1249" height="368" alt="image" src="https://github.com/user-attachments/assets/50cef657-ad60-487b-a7a5-66209d9d3c22" />
Al entrar a la opción 3, rehacemos el texto, el cual quedó en la pila 2, haciendo el mismo proceso anterior, con el Pop eliminamos el texto de la pila 2 y con el Push lo añadimos en la pila 1.



<img width="1221" height="375" alt="image" src="https://github.com/user-attachments/assets/cf3aacb1-4f30-4c2a-a918-50cf39dc77d6" />
Al entrar en la opción 4, nos muestra el texto que se encuentra en la cima de la pila, es decir, el ultimo texto ingresado, en este caso nos muestra el texto "Mundo".



<img width="1145" height="383" alt="image" src="https://github.com/user-attachments/assets/de24abba-e092-4186-ad7a-2f75a7cfe49b" />
Se realizó una validación extra, en el caso que se ingrese un valor diferente al mostrado en el Menu en consola, donde nos muestra el mensaje de "Opcion Incorrecta" y muestra nuevamente el menu.



<img width="1086" height="354" alt="image" src="https://github.com/user-attachments/assets/83b3c8cb-6da0-48c6-9083-0901b1e59698" />
Por ultimo en la opción 5 finalizamos el programa con un mensaje de despedida.



# EQUIPO DE TRABAJO

 - Angie Paola Botero Agudelo
 - Andres Felipe Quiroz Agudelo
 - Andres Camilo Ospino Mejía
