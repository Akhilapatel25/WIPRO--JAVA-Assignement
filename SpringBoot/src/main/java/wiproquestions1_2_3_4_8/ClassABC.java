package wiproquestions1_2_3_4_8;




import org.springframework.stereotype.Component;

@Component("classABC")
public class ClassABC implements InterfacePQR {
    public void display() {
        System.out.println("Hi, I am ClassABC");
    }
}