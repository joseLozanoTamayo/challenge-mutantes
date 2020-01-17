/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge.mutantes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@AutoConfigureMockMvc
public class AppTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testMutantEndpoint() throws Exception {
        mvc.perform(post("/mutant/"))
                .andExpect(status().isOk());
    }
}
