# Participantes
- Juan Andrés Valderrama
- Julián Pulido
- Sebastián Guevara

# Comportamiento - Strategy

Se desea crear el concepto de un videojuego donde en el "Mundo" te puedes encontrar con "Monstruos" los cuales son de un tipo de "elemento" . Como el "Mago" de este juego, puedes usar tus ataques con algún tipo de "magia"  pero si tu tipo de magia coincide con el tipo de elemento no le harás daño al Monstruo. La idea es que uses estratégicamente tu tipo de magia para combatir a los Monstruos.Para realizar esto se uso el patrón de diseño de comportamiento Strategy, donde nuestra estrategias u objetos intercambiables es el tipo de magia que usaremos para combatir enemigos.

# Creacional - Prototype

Prototype es un patrón de diseño creacional el cual permite crear nuevos objetos a partir de una copia de objetos ya existentes. Esto se hace para evitar crear objetos desde 0 cuando ya hay un objeto que tiene las características que necesitas. Este patrón se implementa creando una interfaz la cual únicamente tiene el método clonar(), el cual es implementado por las clases “Prototipo”. Entonces en vez de crear otro objeto, se crea un clon del prototipo.<br><br>
En este caso se uso el ejemplo de un juego, el cual tiene como problema que  tiene que crear varios enemigos de la misma clase. Para evitar que se tengan que crear objetos del tipo de enemigo desde 0, se crearon prototipos de enemigos los cuales se clonan cada uno al momento de ser necesitados.

# Estructural - Bridge

El patron estructural Bridge te permite dividir una clase grande en dos jerarquias separadas (Abstracción e implementacion). En este diseño se construyeron 7 clases, donde hay una interfaz (IElegir) que se encarga de hacer el puente entre los tres tipos de rines y la clase abstracta Forma. Donde la clase abstracta Forma utiliza la Interfaz y la Interfaz implementa las clases de los diferentes tipos de rines (RinAcero, RinAluminio y RinAleacion), en estas clases hay un metodo que recibe los atributos y muestra toda la informacion debida en consola. La clase abstracta Forma se utiliza para poder ver la eleccion que fue pasada por parametro de la interfaz. Luego tambien existe la clase Rin que contiene todas las propiedades y atributos de los diferentes rines, un constructor y un metodo de eleccion del rin. Ademas, esta clase se encuetra extendida por la clase Forma. Finalmente en el metodo main se declaran tres variables como ejemplo del tipo Forma con todas las caracteristicas dadas y se llama al metodo elegir para que este muestre por consola todos los atributos y el tipo de Rin a elección.
