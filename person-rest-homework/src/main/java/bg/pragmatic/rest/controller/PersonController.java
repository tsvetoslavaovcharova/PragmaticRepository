package bg.pragmatic.rest.controller;


import bg.pragmatic.rest.models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/getperson")
    public Person getPerson(){

        Person person = new Person("Ivan", "Ivanov", 20, "ivan,ivanow@gmail.com", 'M',"Developer");
        return  person;
    }

}
