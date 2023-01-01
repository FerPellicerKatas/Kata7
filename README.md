# Kata7

## Descripción
En este proyecto, se ha desarrollado un web service que exponga una API REST para consultar estadísticas de vuelos.

La base de datos "flights.db" no se ha podido adjuntar porque superaba el tamaño máximo permitido en github.

El web service espera tres parámetros que son los siguientes: dimensión (departureDelay, arrivalDelay, duration, distance), filtro (que en este caso acepta días de la semana), tamaño del bin.

Devuelve dimensión, filtro, la lista de los valores x e y.

## Ejemplo

Un ejemplo al ejecutar el programa es el siguiente:

Entrada:     http://localhost/histogram/distance/friday/300 (vuelos por distancia, los viernes, límite máximo de bin = 300)

Salida (simplificada, ya que el resultado tenía muchos elementos):

{ "dimension": "distance", "filter": "friday", "bin": "300", "map": { "2052": 236, "2065": 235, "2072": 300, "26": 1, "2075": 300, "2077": 215, "31": 102, "2079": 300, "2086": 58, "2089": 104, "41": 20, "2092": 203, "56": 87, "2105": 185, "2106": 300, "67": 300, "68": 222,

..........

"1986": 179, "1990": 300, "1995": 206, "1999": 300, "2007": 133, "2018": 40, "2021": 2, "2026": 154, "2036": 98, "2039": 242 } }
