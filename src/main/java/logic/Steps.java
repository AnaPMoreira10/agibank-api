package logic;

import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Então;

public class Steps {

Action api = new Action();
    @Dado("que usuario acesse api")
    public void que_usuario_acesse_api() {
        api.apiBase("/breeds/list/all");
    }
    @Então("valido retorno e statusCode {string} e {string} e {int}")
    public void valido_retorno_e_status_code_e_e(String raca,String sub, Integer status) {
       api.validarRaca(raca,sub,status);
    }
//02
    @Dado("que usuario acesse api random")
    public void que_usuario_acesse_api_random() {
        api.apiBase("/breeds/image/random");
    }
    @Então("valido retorno da api random e statusCode {string} e {string} e {int}")
    public void valido_retorno_da_api_random_e_status_code_e_e(String msg, String status, Integer statusCode) {
        api.validarRetornoApiRandom(msg,status, String.valueOf(statusCode));
    }
    //03
    @Dado("que usuario acesse api hound imagem")
    public void que_usuario_acesse_api_hound_imagem() {
        api.apiBase("/breed/hound/images");
    }
    @Então("valido retorno da api hound e statusCode {string} e {int}")
    public void valido_retorno_da_api_hound_e_status_code_e(String msg, Integer statusCode) {
        api.validarRetornoApiHoundImagens(msg,String.valueOf(statusCode));
    }
}
