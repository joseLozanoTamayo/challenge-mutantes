package challenge.mutantes.Services;

import challenge.mutantes.Entity.Stats;
import challenge.mutantes.Repository.HumanRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class StatsServiceTest {
    StatsService statsService;

    @MockBean
    HumanRepository humanRepository;

    @Before
    public void setUp() {
        statsService = new StatsService(humanRepository);
    }

    @Test public void testGetStats() {
        Integer humans = 100;
        Integer mutants = 40;
        Stats stats = new Stats(40, 100);

        when(humanRepository.countAllByMutantIsFalse()).thenReturn(humans);
        when(humanRepository.countAllByMutantIsTrue()).thenReturn(mutants);

        assertEquals(stats, statsService.getStats());
    }
}