package hasanutamrin1.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {
    @GetMapping ("/kea")
    public String movie(){
        return "movie";


    }
}
