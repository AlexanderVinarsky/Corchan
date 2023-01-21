package corchan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class bController {
    @GetMapping("/b")
    public String sayHello() {
        return "b";
    }
}
