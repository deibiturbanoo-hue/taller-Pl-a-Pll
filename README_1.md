# Taller de Nivelación PI a PII

**Estudiante:** deibit urbano
**Curso:** Programación II
**Grupo*:** 412



**1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto "normal"?**

Un repositorio en Git es una carpeta de proyecto a la que Git le hace seguimiento de todos los
cambios que ocurren en sus archivos a lo largo del tiempo. La diferencia con un proyecto "normal"
(una carpeta cualquiera sin control de versiones) es que el repositorio guarda un historial
completo de quién hizo qué cambio, cuándo y por qué (a través de los commits), permite volver a
versiones anteriores, crear ramas para probar cosas sin dañar el código principal, y colaborar con
otras personas sin que los cambios de unos sobrescriban los de otros.

**2. ¿Cuáles son las tres áreas principales de Git y qué papel cumple cada una?**

- **Working directory:** la carpeta del proyecto tal como la veo y edito en mi computador.
- **Staging area / index:** una zona intermedia donde coloco los cambios que quiero incluir en el
  próximo commit (usando `git add`).
- **Repository (.git):** donde Git guarda de forma permanente el historial de commits ya
  confirmados.

**3. ¿Cómo representa Git los cambios internamente?**

Git guarda la información como una base de datos de objetos identificados por un hash:

- **Blob:** el contenido de un archivo.
- **Tree:** representa un directorio; apunta a blobs y a otros trees (subcarpetas).
- **Commit:** apunta a un tree (una "foto" del proyecto en ese momento), a su commit padre (o
  padres), y guarda metadatos como autor, fecha y mensaje.
- **Tag:** una referencia fija que le pone nombre a un commit específico, normalmente para marcar
  versiones (por ejemplo v1.0).

**4. ¿Cómo se crea un commit y qué información almacena?**

Un commit se crea con `git commit` después de haber agregado los cambios al staging con `git add`.
El objeto commit almacena el snapshot del proyecto (a través de un tree), la referencia al commit
padre, el autor y la fecha, y el mensaje descriptivo que explica qué cambió y por qué.

**5. ¿Cuál es la diferencia entre `git pull` y `git fetch`?**

`git fetch` descarga los cambios del repositorio remoto pero no los mezcla con mi rama local; solo
actualiza las referencias remotas para que yo pueda revisarlos antes de integrarlos. `git pull` hace
lo mismo que `fetch`, pero además intenta automáticamente hacer merge (o rebase) de esos cambios en
mi rama actual.

**6. ¿Qué es un branch (rama) y cómo Git gestiona los punteros a commits?**

Un branch es básicamente un puntero que apunta a un commit específico. Cuando hago commits nuevos
estando en una rama, ese puntero se mueve automáticamente hacia el commit más reciente. Esto permite
trabajar en varias líneas de desarrollo en paralelo (por ejemplo una rama para probar una función
nueva) sin afectar la rama principal (`main`).

**7. ¿Cómo se realiza un merge y qué conflictos pueden surgir?**

Se hace con `git merge nombre-rama` estando ubicado en la rama que va a recibir los cambios. Git
intenta combinar automáticamente los cambios de ambas ramas. Puede haber conflictos cuando dos
ramas modificaron las mismas líneas de un mismo archivo de forma distinta; en ese caso Git marca el
archivo con marcas de conflicto y yo debo editar manualmente el archivo para decidir qué contenido
se queda, y luego hacer `git add` y un commit para cerrar el merge.

**8. ¿Cómo funciona el área de staging (`git add`) y qué pasa si lo omito?**

`git add` mueve los cambios del working directory al staging area, indicándole a Git cuáles cambios
quiero incluir en el siguiente commit. Si omito este paso, `git commit` no encontrará los cambios
nuevos preparados, por lo que esas modificaciones no quedarían registradas en el commit (solo se
confirmaría lo que ya estaba en staging previamente).

**9. ¿Qué es el archivo `.gitignore` y cómo influye en el seguimiento de archivos?**

Es un archivo de texto donde se listan patrones de archivos o carpetas que no quiero que Git
rastree ni suba al repositorio (por ejemplo archivos compilados `.class`, carpetas como `bin/` o
`.idea/`, o archivos con datos sensibles). Los archivos que coincidan con esos patrones son
ignorados por `git status` y `git add`, evitando que terminen en el historial del proyecto.

**10. ¿Cuál es la diferencia entre `commit --amend` y un nuevo commit?**

`git commit --amend` modifica el último commit (puedo cambiar el mensaje o añadirle cambios que
olvidé) en lugar de crear uno nuevo; en la práctica reemplaza el commit anterior por uno nuevo con
un hash distinto. Un commit normal, en cambio, se agrega al historial como un paso adicional sin
tocar los commits anteriores.

**11. ¿Cómo se utiliza `git stash` y en qué escenarios es útil?**

`git stash` guarda temporalmente los cambios que tengo sin confirmar (en working directory y
staging) en una especie de "pila", dejando el working directory limpio como si no hubiera tocado
nada. Es útil cuando necesito cambiar de rama rápidamente para atender algo urgente sin perder mi
trabajo en progreso; después, con `git stash pop`, puedo recuperar esos cambios.

**12. ¿Qué mecanismos ofrece Git para deshacer cambios?**

- `git reset`: mueve el puntero de la rama a otro commit, y según el modo (`--soft`, `--mixed`,
  `--hard`) también puede modificar el staging y/o el working directory.
- `git revert`: crea un nuevo commit que deshace los cambios de un commit anterior, sin borrar el
  historial (es más seguro cuando se trabaja en ramas compartidas).
- `git checkout` (o `git restore` en versiones más recientes): permite descartar cambios locales en
  un archivo, volviendo a la versión que hay en el último commit o en el staging.

**13. ¿Cómo funciona la configuración de remotos (origin, upstream)?**

`origin` es el nombre por defecto que se le da al repositorio remoto del cual clono o al que subo
mis cambios. `upstream` normalmente se usa para referirse al repositorio original cuando trabajo
sobre un fork (una copia propia de un repositorio ajeno), de manera que pueda traer las
actualizaciones del proyecto original. Comandos como `git remote add upstream <url>`,
`git fetch upstream` y `git merge upstream/main` permiten mantener mi fork sincronizado con el
proyecto original.

**14. ¿Cómo puedo inspeccionar el historial de commits?**

`git log` muestra el historial de commits (autor, fecha, mensaje, hash). `git diff` muestra las
diferencias línea a línea entre el working directory, el staging o distintos commits. `git show`
muestra el detalle completo de un commit específico, incluyendo los cambios que introdujo.

### Programación

**15. ¿Cuáles son los tipos de datos primitivos en Java?**

`byte`, `short`, `int`, `long`, `float`, `double`, `char` y `boolean`.

**16. ¿Cómo funcionan las estructuras de control de flujo como `if`, `else`, `switch` y bucles?**

`if`/`else` evalúan una condición booleana y ejecutan un bloque de código u otro según el resultado.
`switch` compara una variable contra varios valores posibles y ejecuta el caso correspondiente, lo
cual es más ordenado que muchos `if/else` encadenados cuando hay varias opciones sobre una misma
variable. Los bucles (`for`, `while`, `do-while`) repiten un bloque de código mientras se cumpla una
condición o un número determinado de veces.

**17. ¿Por qué es importante usar nombres significativos para variables y métodos?**

Usar nombres descriptivos hace que el código sea más fácil de leer, entender y mantener, tanto para
mí mismo en el futuro como para otras personas que trabajen en el proyecto. Además reduce la
necesidad de comentarios adicionales y ayuda a evitar errores por confusión entre variables
parecidas.

**18. ¿Qué es la Programación Orientada a Objetos (POO)?**

Es un paradigma de programación que organiza el código en "objetos" que combinan datos (atributos)
y comportamiento (métodos), modelando el problema como una interacción entre esos objetos en lugar
de una simple secuencia de instrucciones.

**19. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?**

Encapsulamiento, herencia, polimorfismo y abstracción.

**20. ¿Qué es la herencia en POO y cómo se utiliza en Java?**

Es el mecanismo que permite que una clase (subclase) herede atributos y métodos de otra clase
(superclase), reutilizando código y estableciendo una relación de tipo "es un". En Java se
implementa con la palabra clave `extends`.

**21. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?**

Los modificadores de acceso controlan la visibilidad de clases, atributos y métodos. Los más
comunes en Java son `public` (accesible desde cualquier lugar), `private` (solo dentro de la misma
clase), `protected` (accesible dentro del mismo paquete y por subclases) y el modificador por
defecto o *package-private* (accesible solo dentro del mismo paquete).

**22. ¿Qué es una variable de entorno y por qué son importantes para Java?**

Una variable de entorno es un valor configurado a nivel del sistema operativo que los programas
pueden leer para saber cómo comportarse (por ejemplo, dónde encontrar ciertos programas o
librerías). En el caso de Java, la variable `JAVA_HOME` le indica al sistema dónde está instalado el
JDK, y agregar la carpeta `bin` de Java al `PATH` permite ejecutar comandos como `java` y `javac`
desde cualquier carpeta en la terminal. Son importantes porque permiten que las herramientas de
desarrollo funcionen correctamente sin tener que especificar rutas completas cada vez.