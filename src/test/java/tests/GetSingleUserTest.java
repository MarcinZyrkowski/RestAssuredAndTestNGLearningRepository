package tests;

import model.UserDTO;
import org.testng.annotations.Test;
import service.ClientServiceInterface;

public class GetSingleUserTest {

    ClientServiceInterface clientServiceInterface = new ClientServiceInterface();


    @Test
    public void getOneUserTest(){

        UserDTO user = clientServiceInterface.getSingleUser();
        System.out.println(user);

    }

}
