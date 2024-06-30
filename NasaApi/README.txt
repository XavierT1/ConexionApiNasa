NasaApi - Mars Rover Photo Viewer
=================================

Descripción:
-------------
NasaApi es una aplicación Java que se conecta a la API de la NASA para obtener y mostrar fotos tomadas por las cámaras del rover Curiosity en Marte. La aplicación permite buscar fotos según el número de sol (día marciano) y mostrar los resultados en una interfaz gráfica.

Requisitos:
-----------
- JDK 21
- Maven 3.6.3 o superior
- Conexión a Internet

Configuración:
--------------
1. Clona el repositorio del proyecto.

git clone 

2. Configura la clave de API de la NASA:
- Regístrate en [api.nasa.gov](https://api.nasa.gov/) para obtener tu clave API personal.
- Abre el archivo 'src/service/NasaApiService'.
- Reemplaza en `API_KEY` tu clave API:
  ```
  API_KEY ="YOUR_API_KEY"
  ```
Notas:
Asegúrate de tener conexión a Internet para que la aplicación pueda conectarse a la API de la NASA.

Gracias.

