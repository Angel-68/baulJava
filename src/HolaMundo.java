import otrasClases.Animal;
import otrasClases.Persona;

// En Java un programa es un conjunto de definiciones de clases que están dispuestas en uno o más archivos.

// Este es mi primer programa Java formado por una sola class llamada HolaMundo

// El archivo que contiene la class se tiene que llamar exactamente igual que la class. (HolaMundo.java)

// Los comentarios en java son cualquier texto despues de dos barras

/* Java tambien admite comentarios multilínea como en C
   Otra línea del comentario
   Otra línea
 */

public class HolaMundo {

	public static void main(String[] args) {
	// Método main, es el punto de entrada a la aplicación java, por eso se llama "principal" es el primer método que se ejecuta
	// La forma (String[] args) es la definición de los argumentos que recibe el método main. 
	// En este caso se recibe un  solo argumento llamado args. Los paréntesis [] indican que el argumento es un arreglo o array y la palabra String indica que cada elemento del array es una cadena de caracteres.
    
		System.out.println("Hola Mundo");
		
		 if (args.length > 1) { //si hay más de 1 argumento
	            System.out.println("Hay demasiados argumentos. Debe escribir: HolaMundo nombre");
	        } else if (args.length == 0) { //si no hay argumentos      
	            System.out.println("Hola Mundo");
	        } else {
	            System.out.println("Hola Mundo, soy " + args[0]);
	        }
		 
		 Persona p1=new Persona ("alba");
		 Persona p2=new Persona ("Maria");
		 
		 System.out.println("Estas son las personas instanciadas:");
		 System.out.println(p1.toString());
		 System.out.println(p2.toString());
		 
		 Animal a1=new Animal("Mamifero");
		 Animal a2=new Animal("Reptil");
		 
		 System.out.println("Estas son los animales instanciados:");
		 System.out.println(a1.toString());
		 System.out.println(a2.toString());
		 
		 
		 

	}

}

/* Para ejecutar esta clase desde línea de comandos:
	1º Abrimos un editor de línea de comandos, podemos usar el Símbolo del sistema (CMD) o el Power Shell.
	2º En ambos estaremos colocados en la carpeta (Directorio) de nuestro usuario, en el ordenador ASUS será C:\Users\bartolin>
	3º Usando los comandos DIR (ver el contenido del directorio) y CD (CambioDirectirio) nis vamos hasta el lugar donde está el archivo HolaMundo.java
	   en el ASUS está en D:\Datos Alba\INGENIERIA_MATEMATICA\HERRAMIENTAS\CURSO_JAVA>
	4º Ya colocados en D:\Datos Alba\INGENIERIA_MATEMATICA\HERRAMIENTAS\CURSO_JAVA>
		4.1 Compilamos D:\Datos Alba\INGENIERIA_MATEMATICA\HERRAMIENTAS\CURSO_JAVA>javac HolaMUndo.java
		4.2 Si no ha dado errores se habrá creado un nuevo archivo HolaMundo.class (podemos comprobarlo con un DIR)
		4.3 Ejecutamos la clase HolaMundo.class D:\Datos Alba\INGENIERIA_MATEMATICA\HERRAMIENTAS\CURSO_JAVA>java HolaMundo
		4.4 Si queremos pasar argumentos los escribimos detras del nombre de la clase D:\Datos Alba\INGENIERIA_MATEMATICA\HERRAMIENTAS\CURSO_JAVA>java HolaMundo Alba
	*/
/* Para ejecutar esta clase desde el IDE Eclipse:
	Hacemos clic en la flecha verde de la barra de herramientas "Run HolaMundo", si no hemos guardado el archivo HolaMundo.java primero lo guarda.
	Si queremos pasarle argumentos, desplegamos la flecha negra junto al "Run HolaMundo" y elegimos "Run Configurations"
	Se abre un formulario, pinchamos en la pestaña "Arguments"
	En el campo "Program Arguments" escribimos los argumentos separados por un espacio y clicamos en el botón "RUN"
	Estos argumentos quedan grabados, si no los queremos en otras ejecuciones solo con flecha verde hay que borrarlos de ese campo
*/
