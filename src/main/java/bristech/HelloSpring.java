package bristech;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bartoszjedrzejewski on 01/11/2016.
 */
@RestController
public class HelloSpring {

    @RequestMapping("/")
    public String index() {
        return "Hello Bristech!!";
    }

}
