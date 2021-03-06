package challenge.mutantes.Controller;

import challenge.mutantes.Entity.Human;
import challenge.mutantes.Entity.HumanRequest;
import challenge.mutantes.Services.HumanService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MutantController.class)
@AutoConfigureMockMvc
public class MutantControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    HumanService humanService;

    @Test
    public void testMutantEndpointForbidden() throws Exception {
        Human human = new Human();
        human.setMutant(false);
        when(humanService.save(any(HumanRequest.class))).thenReturn(human);

        mockMvc.perform(post("/mutant/")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "\"dna\":[\"ATGCGA\", \"CAGTGC\", \"TTATTT\", \"AGACGG\", \"GCGTCA\", \"TCACTG\"]\n" +
                        "}")
        )
                .andExpect(status().isForbidden());
    }

    @Test
    public void testMutantEndpointSuccess() throws Exception {
        Human human = new Human();
        human.setMutant(true);
        when(humanService.save(any(HumanRequest.class))).thenReturn(human);

        mockMvc.perform(post("/mutant/")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "\"dna\":[\"ATGCGA\", \"CAGTGC\", \"TTATGT\", \"AGAAGG\", \"CCCCTA\", \"TCACTG\"]\n" +
                        "}")
        )
                .andExpect(status().isOk());
    }
}