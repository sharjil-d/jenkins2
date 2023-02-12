package capstonedome.demoCRUDcapstone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerl {
    @GetMapping("/api/welcome")
    public String welcome(){
        return "hii";
    }
}
