package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class mainMethod6 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc6.xml");
        personDao6 dao = (personDao6) context.getBean(personDao6.class);

        List<person6> people = dao.getAllPersons();
        for (person6 person : people) {
            System.out.println(person.getId() + " | " + person.getFirstName() + " " + person.getLastName() + " | Age: " + person.getAge());
        }
    }
}
