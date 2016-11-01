package bristech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bartoszjedrzejewski on 01/11/2016.
 */
@RestController
public class RecognitionController {

    @Autowired
    private ColleagueRepository repository;

    @RequestMapping("/colleagues/{name}")
    public List<Colleague> getRecognition(@PathVariable("name") String name){
        return repository.findByName(name);
    }

    @RequestMapping("/colleagues")
    public List<Colleague> getColleagues(){
        return repository.findAll();
    }

}
