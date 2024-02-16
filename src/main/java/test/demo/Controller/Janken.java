package test.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Janken {
    @GetMapping("/jankenHome")
    public String jankenHome() {
        return "home.html";
    }
    
}
