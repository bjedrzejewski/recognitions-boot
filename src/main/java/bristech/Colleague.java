package bristech;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bartoszjedrzejewski on 31/10/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Colleague {

    @Id
    public String id;

    public String name;
    public List<Recognition> recognitions;

    public Colleague() {
        this.recognitions = new ArrayList<>();
    }

    public Colleague(String name) {
        this.name = name;
        this.recognitions = new ArrayList<>();
    }

    public Colleague(String name, List<Recognition> recognitions) {
        this.name = name;
        this.recognitions = recognitions;
    }

    @Override
    public String toString() {
        return "Colleague{" +
                ", name='" + name + '\'' +
                ", recognitions=" + recognitions +
                '}';
    }


}
