/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Component.java to edit this template
 */
package HealthChain.project.blockchain;

import BlockchainProto.MainChain;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author VIVEK
 */
@Component
@Document(collection = "data")

public class Data {
     MainChain mc= new MainChain();
     int counter=1;
    @Autowired
    private PatientRepository patientRepository;
    @PostMapping("/form")
    @SuppressWarnings("empty-statement")
    public String submitForm(@RequestParam int text2,
                             @RequestParam String number1,
                             @RequestParam int number2,
                             @RequestParam String number3,
                             @RequestParam String number4,
                             @RequestParam String number5,
                             Model model) {
        String[] medData={number3, number4, number5};
       
        HashMap<Integer, Object[]> result = mc.MainChainNext(text2, number1, number2, medData);
        counter++;
        model.addAttribute("result", result.get(counter));
        return "result";
    }
}
