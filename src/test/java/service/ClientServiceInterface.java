package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import company.user.UserRestClient;
import io.restassured.response.Response;
import lombok.SneakyThrows;
import model.UserDTO;

public class ClientServiceInterface {

    ObjectMapper mapper = new ObjectMapper();
    UserRestClient userRestClient = new UserRestClient();

    @SneakyThrows({
            JsonProcessingException.class
    })
    public UserDTO getSingleUser(){
        Response response = userRestClient.sendGetOneUser();
        return mapper.readValue(response.getBody().asString(), UserDTO.class);

    }


}
