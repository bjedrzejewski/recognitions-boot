package bristech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by bartoszjedrzejewski on 31/10/2016.
 */
@Component
public class MongoExample implements CommandLineRunner {

    @Autowired
    private ColleagueRepository repository;

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of colleagues
        repository.save(new Colleague("Alice", "Smith"));
        repository.save(new Colleague("Bob", "Smith"));

        // fetch all colleagues
        System.out.println("Colleagues found with findAll():");
        System.out.println("-------------------------------");
        for (Colleague colleague : repository.findAll()) {
            System.out.println(colleague);
        }
        System.out.println();

        // fetch an individual colleague
        System.out.println("Colleague found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Alice"));

        System.out.println("Colleagues found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (Colleague colleague : repository.findByLastName("Smith")) {
            System.out.println(colleague);
        }

    }

}
