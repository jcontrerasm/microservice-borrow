Microservice Borrow
=====

**Stack del proyecto:**

* Spring Boot
* SQL Server
* Kafka
* Docker

## Pre-Requisitos

* Tener java configurado.
* Tener docker y docker-compose instalados.
* En SQL Server, crear una base de datos llamada **`db_borrow`**.

## Ejecución del proyecto en local

* Construir imagen ejecutando **`make build`** en linux y **`docker build -t microservice-borrow:1.0.0`** en windows.
* Levantar los servicios ejecutando **`make up`** en linux y **`docker-compose up`** en windows.
* Obtener detalle de la cuenta: **` Tipo GET - http://localhost:8088/v1/borrow/{borrowId}`**.
* Listar todas las cuentas: **`Tipo GET - http://localhost:8088/v1/borrow`**.
