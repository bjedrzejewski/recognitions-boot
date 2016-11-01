package bristech;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by bartoszjedrzejewski on 31/10/2016.
 */
public class Colleague {

    @Id
    public String id;

    public String name;
    public List<Recognition> recognitions;

    public Colleague() {}

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
