package br.edu.ifpr.exercicio_02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EnderecosController {
    
    @GetMapping("/requisicao")
    @ResponseBody
    public String hello(HttpServletRequest request){

        String metodo = request.getMethod();
        String uri = request.getRequestURI();
        String protocolo = request.getProtocol();

        String resposta = "Método: " + metodo + "URI: " + uri +
            "Protocolo: " + protocolo;

        return resposta;
    }

    @GetMapping("/Cabecalhos")
    @ResponseBody
    public String cabecalhos(HttpServletRequest request){
        String host = request.getHeader("Host");
        String userAgent = request.getHeader("User-Agent");
        String accept = request.getHeader("Accept-encoding");
        String language = request.getHeader("Accept-language");

        return "Host: " + host + "User-Agent" + userAgent +
            "Accept-encoding: " + accept + "Accept-language: " + language;
        
    }


}
