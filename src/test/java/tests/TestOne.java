package tests;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class TestOne {

    @Test
    public void testFirst() {
        Response response;
        response = get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
    }

    @Test
    public void test2() {

        baseURI = "https://reqres.in/api";

        given()
                .get("/users?page=2")
                .then()
                .statusCode(200)
                .body("data[4].first_name", equalTo("George"));
    }

    @Test
    public void test3() {
        JSONObject request = new JSONObject();
        request.put("name", "Marcin");
        request.put("job", "QA");
        System.out.println(request);
    }

}
