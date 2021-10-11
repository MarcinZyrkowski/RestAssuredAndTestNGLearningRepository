package company.user;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserRestClient implements UserClient {

    @Override
    public Response sendGetOneUser() {
        return given()
                .get(baseURI + SINGLE_USER);
    }
}
