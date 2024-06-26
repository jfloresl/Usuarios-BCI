# Usuarios-BCI
Springboot API creación Usuarios

Request y response solo en json

Emails habilitados solo del dominio "@dominio.cl"

Password minimo debe tener una mayuscula, tres letras minúsculas y dos numeros

## Endpoints


### Registrar usuarios
Al registrar usuario se entrega todos los datos mas un jwt para poder hacer consultas.

POST http://localhost:8082/api/auth/register
<details>
  <summary>request/response</summary>

#### Request
```json
{
  "name": "Juan Rodriguez",
  "email": "juan@dominio.cl",
  "password": "hunterA22",
  "phones": [
    {
      "number": "1234567",
      "citycode": "1",
      "countrycode": "57"
    }
  ]
}
```
#### Response
```json
{
  "message": {
    "id": "9264e940-5823-4fa2-aaf7-87c14ca4a75a",
    "name": "Juan Rodriguez",
    "email": "juan@dominio.cl",
    "password": "hunterA22",
    "created": "2024-05-02",
    "modified": "2024-05-02",
    "last_login": "2024-05-02",
    "token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqdWFuQGRvbWluaW8uY2wiLCJleHAiOjE3MTQ2OTEyNjYsImlhdCI6MTcxNDY4NzY2Nn0.7DA3EHyrzwGT-Z4xXx2Pto9p4fi7iZL7pDTl7wJ5o10",
    "isactive": "1",
    "phones": [
      {
        "id": 1,
        "number": "1234567",
        "citycode": "1",
        "countrycode": "57"
      }
    ]
  },
  "status": "200"
}
```
</details>

### Login usuarios
Al hacer login se retorna el jwt asociado al usuario, si esta caducada genera una nueva.

POST http://localhost:8082/api/auth/login
<details>
  <summary>request/response</summary>

#### Request
```json
{
  "email":"juan@dominio.cl",
  "password":"hunterA22"
}
```
#### Response
```json
{
  "message": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqdWFuQGRvbWluaW8uY2wiLCJleHAiOjE3MTQ2OTEyNjYsImlhdCI6MTcxNDY4NzY2Nn0.7DA3EHyrzwGT-Z4xXx2Pto9p4fi7iZL7pDTl7wJ5o10",
  "status": "200"
}
```
</details>


### Ver todos los usuarios 
endpoint extra para probar JWT

POST http://localhost:8082/api/users/all

<details>
  <summary>request/response</summary>

#### Request
```json
{"id":"all"}
```
#### Authorization
Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqdWFuQGRvbWluaW8uY2wiLCJleHAiOjE3MTQ2OTEyNjYsImlhdCI6MTcxNDY4NzY2Nn0.7DA3EHyrzwGT-Z4xXx2Pto9p4fi7iZL7pDTl7wJ5o10

#### Response
```json
{
  "message": [
    {
      "id": "93899638-4e82-4fe8-9470-8a4d53aff83c",
      "name": "Juan Rodriguez",
      "email": "juan@dominio.cl",
      "password": "hunterA22",
      "created": "2024-05-02",
      "modified": "2024-05-02",
      "last_login": "2024-05-02",
      "token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqdWFuQGRvbWluaW8uY2wiLCJleHAiOjE3MTQ3MTE2MTksImlhdCI6MTcxNDcwODAxOX0.7TscvO6-ywyXbAPLLtXoLKR0v2R8N3xE8DWwfdRVLuA",
      "isActive": "1",
      "phones": [
        {
          "id": 1,
          "number": "1234567",
          "citycode": "1",
          "countrycode": null,
          "userId": "93899638-4e82-4fe8-9470-8a4d53aff83c"
        },
        {
          "id": 2,
          "number": "155567",
          "citycode": "4",
          "countrycode": "56",
          "userId": "93899638-4e82-4fe8-9470-8a4d53aff83c"
        }
      ]
    },
    {
      "id": "046a9ef8-748f-4192-a82d-0f8b9c822efc",
      "name": "daniel soto",
      "email": "daniel@dominio.cl",
      "password": "passworA22",
      "created": "2024-05-02",
      "modified": "2024-05-02",
      "last_login": "2024-05-02",
      "token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYW5pZWxAZG9taW5pby5jbCIsImV4cCI6MTcxNDcxMTY4NSwiaWF0IjoxNzE0NzA4MDg1fQ.H9_JYQ0VPCQwrfCZZpB70S_4Ek4ITXnJzQn4seTdQTc",
      "isActive": "1",
      "phones": [
        {
          "id": 3,
          "number": "634353",
          "citycode": "1",
          "countrycode": null,
          "userId": "046a9ef8-748f-4192-a82d-0f8b9c822efc"
        },
        {
          "id": 4,
          "number": "99999",
          "citycode": "2",
          "countrycode": "56",
          "userId": "046a9ef8-748f-4192-a82d-0f8b9c822efc"
        }
      ]
    }
  ],
  "status": "200"
}
```
</details>

### Docs
http://localhost:8082/swagger-ui/index.html

### Diagrama
![img.png](img.png)