package bristech;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bartoszjedrzejewski on 01/11/2016.
 */
@RestController
public class MyErrorController implements ErrorController {

    @Override
    @RequestMapping("/error")
    public String getErrorPath() {
        return "Unknown error occured";
    }
}
