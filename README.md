# Microservicios - Reto # 2

* Detalles técnicos :
  * La app esta desarrollada en spring boot 3.2.4, gradle y java 17
  * Para acceder a los microservicios, se utilizó API GATEWAY
  * El motor de la base de datos es MARIADB
  * La aplicación cuenta con siguientes servicios:
    * Creación y modificación de información de usuarios (User)
    * Los endpoint para usuarios son:
      * http://localhost:9090/user/create (crear usuarios)
      * http://localhost;9090/user/update/{id} (actualizar usuarios)
    * Creación y modificación de información de cuentas (Account)
      * http://localhost:9090/account/create (crear cuentas)
      * http://localhost;9090/account/update/{id} (actualizar cuentas)
  * La rama donde está alojada es la MASTER
  * 
    

## Nota: Este desarrollo no lo pude adaptar para docker