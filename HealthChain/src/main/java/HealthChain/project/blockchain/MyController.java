/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package HealthChain.project.blockchain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import lombok.Data;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestBody;


/**
 *
 * @author VIVEK
 */
@Controller
public class MyController {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/form")
    public String showForm() {
        return "form";
    }

    @Autowired
private MongoTemplate mongoTemplate;

@PostMapping("/saveData")
public void saveData(@RequestBody Data data) {
    mongoTemplate.save(data);
}
    /*private int processData(String text1, String text2, int number1, int number2, int number3, int number4) {
        // Your processing logic here
        return result;
    }*/
}
