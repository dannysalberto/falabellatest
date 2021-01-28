# falabellatest

Se trata de un componente spring boot, el cual cuenta con dos endpoints básicos, uno para almacenar productos en la bd y otro para consultarlos

básicamente se utiliza una base de datos en memoria H2, la cual se borra al finalizar la ejecución del componente

para compilar se debe descargar el código del siguiente repositorio

https://github.com/dannysalberto/falabellatest.git

asegurese ejecutar los siguientes comandos desde la carpeta principal del componente

mvn clear
mvn compile
mvn package

posteriormente dirijase  a la carpeta target que está en un nivel interior a la carpeta principal del componente

ejemplo: cd /workspace/falabellatest/target

una vez allí puede ejecutar el componente con el siguiente comando

java -jar FalabellaTestApplication-0.0.1.jar

luego haga las pruebas desde la página de documentación del servicio

http://localhost:8888/products-ws/swagger-ui.html

