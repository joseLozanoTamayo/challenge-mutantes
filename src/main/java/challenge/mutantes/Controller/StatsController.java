package challenge.mutantes.Controller;

import challenge.mutantes.Entity.Stats;
import challenge.mutantes.Services.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stats")
public class StatsController {
    private StatsService statsService;

    @Autowired
    public StatsController(StatsService statsService) {
        this.statsService = statsService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Stats getStats() {
        return statsService.getStats();
    }
}
