package bristech;

import org.springframework.data.annotation.Id;

/**
 * Created by bartoszjedrzejewski on 31/10/2016.
 */
public class Colleague {

    @Id
    public String id;

    public String firstName;
    public String lastName;

    public Colleague() {}

    public Colleague(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Colleague[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }


}
