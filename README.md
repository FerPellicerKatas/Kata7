# Kata7

## Descripción
En este proyecto, se ha desarrollado un web service que exponga una API REST para consultar estadísticas de vuelos.

La base de datos "flights.db" no se ha podido adjuntar porque superaba el tamaño máximo permitido en github.

El web service espera tres parámetros que son los siguientes: dimensión (departureDelay, arrivalDelay, duration, distance), filtro (que en este caso acepta días de la semana), tamaño del bin.

Devuelve dimensión, filtro, la lista de los valores x e y.

## Ejemplo

Un ejemplo al ejecutar el programa es el siguiente:

Entrada:     http://localhost/histogram/distance/monday/200 (vuelos por distancia, los lunes, límite máximo de bin = 200)

Salida (simplificada, ya que el resultado tenía muchos elementos):

{ "dimension": "distance", "filter": "monday", "bin": "200", "map": { "31": 103, "41": 14, "56": 90, "67": 1555, "68": 217, "69": 23, "73": 624, "74": 455, "76": 70, "77": 366, "78": 122, "80": 3, "82": 103, "83": 552, "84": 638, "86": 1407, "89": 1211, "90": 203, 

..........

"189": 1186, "190": 3125, "191": 938, "192": 3211, "193": 50, "195": 98, "196": 1313, "197": 1024, "198": 267, "199": 1121, "200": 1890 } }
