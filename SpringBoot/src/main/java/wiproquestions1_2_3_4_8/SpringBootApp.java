package wiproquestions1_2_3_4_8;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp implements CommandLineRunner {

    @Autowired
    private ClassKLM klm;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }

   @Override
    public void run(String... args) {
        klm.callDisplay();
    }
}
