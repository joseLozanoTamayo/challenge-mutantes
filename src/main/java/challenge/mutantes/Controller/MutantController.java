package challenge.mutantes.Controller;

import challenge.mutantes.Services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/mutant")
public class MutantController {
    private final HumanService humanService;

    @Autowired
    public MutantController(HumanService humanService) {
        this.humanService = humanService;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity mutant(@RequestBody Map<String, String[]> request) {
        if (humanService.isMutant(request.get("dna"))) {
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }

}