package spring.cadrastrodeninja;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("hello")
    public String boasvindas(){
        return "boasvindas";
    }
}
