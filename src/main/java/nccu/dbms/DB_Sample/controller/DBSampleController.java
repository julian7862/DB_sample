package nccu.dbms.DB_Sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBSampleController {
    @GetMapping("/hello")
    public String Hello() {
        return "Hellooo";
    }
}