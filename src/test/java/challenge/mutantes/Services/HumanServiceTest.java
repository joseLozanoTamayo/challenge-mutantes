package challenge.mutantes.Services;

import challenge.mutantes.Entity.Human;
import challenge.mutantes.Repository.HumanRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class HumanServiceTest {
    HumanService humanService;

    @MockBean
    HumanRepository humanRepository;

    @Before
    public void setUp() {
        humanService = new HumanService(humanRepository);
    }

    @Test
    public void testIsMuntantFalse() {
        String[] dna = {"ATGCGA","CAGTGC","TTATTT","AGGGGA","GCGTCA","TCACTG"};
        assertFalse(humanService.isMutant(dna));
    }

    @Test
    public void testIsMuntantTrue() {
        String[] dna = {"ATGCGA","AAGTGC","ATATTT","AGGGGA","GCGTCA","TCACTG"};
        assertTrue(humanService.isMutant(dna));
    }
}