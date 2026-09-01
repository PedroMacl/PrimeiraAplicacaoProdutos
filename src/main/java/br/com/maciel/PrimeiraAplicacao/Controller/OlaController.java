package br.com.maciel.PrimeiraAplicacao.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ola")
public class OlaController {

    @GetMapping
    public String olaController(){
        return "Olá,Cliente";
    }
}
