import otrasClases.Animal;
import otrasClases.Persona;

// En Java un programa es un conjunto de definiciones de clases que est�n dispuestas en uno o m�s archivos.

// Este es mi primer programa Java formado por una sola class llamada HolaMundo

// El archivo que contiene la class se tiene que llamar exactamente igual que la class. (HolaMundo.java)

// Los comentarios en java son cualquier texto despues de dos barras

/* Java tambien admite comentarios multil�nea como en C
   Otra l�nea del comentario
 */

public class HolaMundo {

	public static void main(String[] args) {
	// M�todo main, es el punto de entrada a la aplicaci�n java, por eso se llama "principal" es el primer m�todo que se ejecuta
	// La forma (String[] args) es la definici�n de los argumentos que recibe el m�todo main. 
	// En este caso se recibe un  solo argumento llamado args. Los par�ntesis [] indican que el argumento es un arreglo o array y la palabra String indica que cada elemento del array es una cadena de caracteres.
    
		System.out.println("Hola Mundo");
		
		 if (args.length > 1) { //si hay m�s de 1 argumento
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

/* Para ejecutar esta clase desde l�nea de comandos:
	1� Abrimos un editor de l�nea de comandos, podemos usar el S�mbolo del sistema (CMD) o el Power Shell.
	2� En ambos estaremos colocados en la carpeta (Directorio) de nuestro usuario, en el ordenador ASUS ser� C:\Users\bartolin>
	3� Usando los comandos DIR (ver el contenido del directorio) y CD (CambioDirectirio) nis vamos hasta el lugar donde est� el archivo HolaMundo.java
	   en el ASUS est� en D:\Datos Alba\INGENIERIA_MATEMATICA\HERRAMIENTAS\CURSO_JAVA>
	4� Ya colocados en D:\Datos Alba\INGENIERIA_MATEMATICA\HERRAMIENTAS\CURSO_JAVA>
		4.1 Compilamos D:\Datos Alba\INGENIERIA_MATEMATICA\HERRAMIENTAS\CURSO_JAVA>javac HolaMUndo.java
		4.2 Si no ha dado errores se habr� creado un nuevo archivo HolaMundo.class (podemos comprobarlo con un DIR)
		4.3 Ejecutamos la clase HolaMundo.class D:\Datos Alba\INGENIERIA_MATEMATICA\HERRAMIENTAS\CURSO_JAVA>java HolaMundo
		4.4 Si queremos pasar argumentos los escribimos detras del nombre de la clase D:\Datos Alba\INGENIERIA_MATEMATICA\HERRAMIENTAS\CURSO_JAVA>java HolaMundo Alba
	*/
/* Para ejecutar esta clase desde el IDE Eclipse:
	Hacemos clic en la flecha verde de la barra de herramientas "Run HolaMundo", si no hemos guardado el archivo HolaMundo.java primero lo guarda.
	Si queremos pasarle argumentos, desplegamos la flecha negra junto al "Run HolaMundo" y elegimos "Run Configurations"
	Se abre un formulario, pinchamos en la pesta�a "Arguments"
	En el campo "Program Arguments" escribimos los argumentos separados por un espacio y clicamos en el bot�n "RUN"
	Estos argumentos quedan grabados, si no los queremos en otras ejecuciones solo con flecha verde hay que borrarlos de ese campo
*/
