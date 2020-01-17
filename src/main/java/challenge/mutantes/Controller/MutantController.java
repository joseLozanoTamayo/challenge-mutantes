package challenge.mutantes.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mutant")
public class MutantController {

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String mutant() {
        return "Mutant Controller -> mutant() method";
    }

}