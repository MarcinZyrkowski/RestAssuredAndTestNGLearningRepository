package company.user;

import io.restassured.response.Response;

public interface UserClient {

    String baseURI = "https://reqres.in/api";

    String SINGLE_USER = "/users/2";

    Response sendGetOneUser();

}
