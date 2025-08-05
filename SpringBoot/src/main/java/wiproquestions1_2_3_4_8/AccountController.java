package wiproquestions1_2_3_4_8; // or your package

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class AccountController {

    @GetMapping("/users/{id}/accounts")
    public List<Account4> getAccounts(
            @PathVariable String id,
            @RequestParam String type,
            @RequestParam String status) {

        List<Account4> accounts = new ArrayList<>();
        accounts.add(new Account4(id, type, status));
        return accounts;
    }
}

//http://localhost:8080/users/101/accounts?type=current&status=active
