<h1 align="center"> CHALLENGE (BACK END) ALURA LATAM -ORACLE </h1>

<h2 align="center"> API REST FORO </h2>


<img src="https://www.comparahosting.com/wp-content/uploads/2020/06/Imagen-pincipal-foro-en-l%C3%ADnea.jpg">


<h2> Índice </h2>

* [Título e imagen de portada](#Título-e-imagen-de-portada)

* [Índice](#índice)

* [Descripción del proyecto](#descripción-del-proyecto)

* [Estado del proyecto](#Estado-del-proyecto)

* [Características de la aplicación y demostración](#Características-de-la-aplicación-y-demostración)

* [Acceso al proyecto](#acceso-proyecto)

* [Tecnologías utilizadas](#tecnologías-utilizadas)

* [Personas-Desarrolladores del Proyecto](#personas-desarrolladores)




<h2> Descripción del proyecto </h2>

Este proyecto fue elaborado para desarrollar un challenge (desafío) en Alura Latam de ORACLE, en la especialidad de Back End con Spring boot, el cual presenta una API REST con su respectivo CRUD.

El proyecto permite crear, listar todos, actualizar, eliminar y obtener un especifico tópico creado por el usuario, también se realiza la seguridad, el autenticado y la autorización de la api para que no le permita al personal que no este logeado realizar las operaciones, ya que al crear el JWT, nos permite validar y autorizar el acceso.



<h2> Estado del proyecto </h2>

🎯 Proyecto Completado!!, pero buscando mejoras (Generar un hash para que la clave del nuevo usuario brinde seguridad) 🎯



<h2> Características de la aplicación y demostración </h2>

🔨 Funcionalidades del proyecto 🔨 

* Se debe ver que usuario esta creado en la tabla de usuarios para poder logearse
* Se debe usar una herramienta donde se puedan consumir la api con sus distintas operaciones .
* El proyecto se realizo en intellij IDEA 2023 (preferiblemente corralo en ese IDE).
* AL tener corriendo el proyecto, realice las pruebas de POST, GET, PUT y DELETE para crear,obtener,actualizar y eliminar los respectivos topicos, para evidenciar que la API no te dejara hacerlo a menos que te logees, ya que al logearse generas un Token, que ayudará a evidenciar la autenticación y autorización del usuario para realizar las distintas operaciones.
* Prosigue realizando el login del usuario para evidenciar que si te permitira hacer las operaciones definidas.

Nota: el path para el CRUD de los topicos es: /topicos y el path para logearse es /login, recordar que:
* Los metodos obtener un topico y DELETE debes agregar ademas del path un numero (/topicos/3). 
* Se uso el algoritmo HMAC256
* El repositorio tiene dos Branch la main y julio, donde en la main solo se realizo el código para el CRUD y en la julio se protegio la API y se genera su respectivo JWT a cada usuario que se logea. 

<h2> 📁 Acceso al proyecto </h2>

Sólo desde GitHub


 <h2> 🛠️ Abre y ejecuta el proyecto</h2>

Preferiblemente desde Intellij IDEA 2023.1.2, ya uqe fue realizado desde este IDE, solo guardar y ejecutar, las tablas se crearan solas, pero debes agregar bien el puerto en la URL, ya que se uso en este proyecto el 3310.

* Para el servidor:
http://localhost:8080/topicos
* Para la conexión a la base de datos:
jdbc:mysql://localhost:3310/foro


<h2> 🎨 Tecnologías Utilizadas </h2>

* Java 17
* Spring Boot
* JPA (Para creación de tablas en base de datos)
* Lombok (PAra la generación de Getter, Setter, Constructores por defecto)
* auth0 (Para la autenticación y la generación del JWT)
* Security (Modulo para darle seguridad a la API)
* flywaydb (Para reallizar versiones nuevas de las tablas, si se desea agregar una nueva o un campo nuevo)



<h2> Autor y Desarrolador </h2>

| [<img src="https://avatars.githubusercontent.com/u/86208072?s=400&u=a20a9f53cf998859c38d855985b36bff673d281f&v=4" width=115><br><sub>Julio Castellón</sub>](https://github.com/juliocastellonmendoza)|
| :Julio Castellón: |

