package wiproquestions1_2_3_4_8;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassKLM {

    @Autowired
    @Qualifier("classABC") // or use "classXYZ" to change the output
    private InterfacePQR pqr;

    public void callDisplay() {
        pqr.display();
    }
}