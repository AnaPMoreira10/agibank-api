package base;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiClient {

    public ApiClient(){
        RestAssured.baseURI="https://dog.ceo/api";
    }

    Response response;

    public void getRequest(String endpoint){
        response = RestAssured
                .given()
                .when()
                .get(endpoint);
    }

    public Response getResponse() {
        return response;
    }
}