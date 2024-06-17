# Análisis y Diseño de Sistemas Orientados a Objetos (Calculo Media y desviacion con LinkedList)


Este programa implementa una calculadora que calcula el promedio y la desviación estándar de un conjunto de datos. Los datos deben estar en un archivo con extensión .txt. 

## Cómo Ejecutar el Proyecto
Después de clonar el repositorio, ejecute el sigueinte comando para compilar y empaquetar el proyecto

```
    mvn package
```

Para ejecutar el programa, sitúese en la carpeta raíz del proyecto y utilice el siguiente comando. En este caso, se lee el archivo numeros.txt:
```
    java -cp target/Media-Desviacion-1.0-SNAPSHOT.jar edu.escuelaing.arsw.ASE.app.App numeros.txt
```


## Diagrama de Clase
La clase principal App en su método main llama a Reader para leer el archivo. La clase Reader invoca a Calculos para realizar las operaciones y utiliza LinkedList para la implementación de la estructura de datos, la cual a su vez utiliza la clase Node.


## Documentación

Para obtener la documentacion es requerido correr el siguiente comando:

```
    mvn javadoc:javadoc
```
## Repositorio de GitHub

