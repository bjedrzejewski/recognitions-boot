package bristech;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by bartoszjedrzejewski on 31/10/2016.
 */
public class Colleague {

    @Id
    public String id;

    public String firstName;
    public String lastName;
    public List<Recognition> recognitions;

    public Colleague() {}

    public Colleague(String firstName, String lastName, List<Recognition> recognitions) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.recognitions = recognitions;
    }

    @Override
    public String toString() {
        return "Colleague{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", recognitions=" + recognitions +
                '}';
    }
}
