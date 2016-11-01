package bristech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/colleagues")
    public ResponseEntity<String> addColleague(@RequestBody Colleague colleague){
        repository.save(colleague);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/colleagues/{name}")
    public ResponseEntity<String> deleteColleague(@PathVariable  String name){
        List<Colleague> colleagues = repository.findByName(name);
        if(colleagues.size() == 1) {
            Colleague colleague = colleagues.get(0);
            repository.delete(colleague);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
