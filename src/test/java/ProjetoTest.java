import org.hamcrest.CoreMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

public class ProjetoTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testeIntegracao() throws Exception {
        this.mockMvc.perform(
                get("/integracao")).andDo(print()).andExpect(
                status().isOk()).andExpect(
                content().string(
                        CoreMatchers.containsString("{read}")
                )
        );
    }
}
