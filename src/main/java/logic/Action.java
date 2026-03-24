package logic;

import base.ApiClient;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.*;

public class Action {
    ApiClient action = new ApiClient();

    public void apiBase(String endpoint) {
         action.getRequest(endpoint);
    }

    public void validarRaca(String raca, String subRaca, Integer status) {
        action.getResponse()
                .then()
                .statusCode(status);

        Map<String, Object> message = action.getResponse()
                .jsonPath()
                .getMap("message");

        if (!message.containsKey(raca)) {
            throw new AssertionError("Raça não encontrada: " + raca);
        }
        List<String> subRacas = (List<String>) message.get(raca);


        if (!subRacas.contains(subRaca)) {
            throw new AssertionError("Sub-raça não encontrada: " + subRaca);
        }

    }
//02
    public void validarRetornoApiRandom(String msg, String status,String statusCode){
        action.getResponse()
                .then()
                .statusCode(Integer.parseInt(statusCode))
                .body("status", equalTo(status))
                .body("message", containsString(msg));
    }
//03
    public void validarRetornoApiHoundImagens(String msg, String statusCode){
        action.getResponse()
                .then()
                .statusCode(Integer.parseInt(statusCode))
                .body("message.size()", greaterThan(0))
                .body("message", everyItem(containsString(msg)));
    }
}