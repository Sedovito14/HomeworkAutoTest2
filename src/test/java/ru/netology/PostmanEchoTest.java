package ru.netology;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class PostmanEchoTest {
    @Test
    void shouldReturnSendData(){
        String text = "Hello";
        given()
                .baseUri("https://postman-echo.com")
                .body("Hi") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo("Hello"));
        ;
    }
}
