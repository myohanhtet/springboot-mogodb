# Spring Boot, MongoDB CRUD Rest API

## Requirements

1. Java - 11

2. Maven - 3.x.x

3. MongoDB - 4.x.x

## Explore Rest APIs

    GET /getall

    ```javascript
    http://localhost:8102/getall
    ```
    POST /create
    http://localhost:8102/create

    ```javascript
    [
        {
            "id": 1,
            "name": "1 Updated Phyo",
            "designation": "ddlfasdf"
        },
        {
            "id": 2,
            "name": "2Phyo",
            "designation": "ddlfasdf"
        },
        {
            "id": 3,
            "name": "3Phyo",
            "designation": "ddlfasdf"
        },
        {
            "id": 4,
            "name": "4Phyo",
            "designation": "ddlfasdf"
        },
        {
            "id": 5,
            "name": "5Phyo",
            "designation": "ddlfasdf"
        }
    ]
    ```

    GET /employee/{id}

    ```javascript
    http://localhost:8102/employee/1
    ```

    PUT /update/{id}
    http://localhost:8102/update/1

    ```javascript
    {
        "id": 1,
        "name": "1 Updated Phyo",
        "designation": "ddlfasdf"
    }
    ```

    DELETE /delete/{1}

    ```javascript
    http://localhost:8102/delete/1
    ```

    DELETE /delete/all

    ```javascript
    http://localhost:8102/delete/all
    ```