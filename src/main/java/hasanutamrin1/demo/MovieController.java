package hasanutamrin1.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {
    @GetMapping ("/kea")
    public String movie(){
        return "movie";

        @GetMapping("/Gusse")
                public String gustav(){

            return "gustav";
        }
// dette er en kommentar
    }

    @GetMapping ("/kage")
    public String kage(){
        return "kage";
    }
    @GetMapping ("/hasan")
    public String hasan(){
        return "hasan";
}
