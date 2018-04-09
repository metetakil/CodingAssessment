package mtakil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;


@RunWith(SpringJUnit4ClassRunner.class)
public class Tester {

    private MockMvc mockMvc;

    @Autowired
    private RiskRestClient riskRestClientMock;

    @Test
    public void test() {

        when(riskRestClientMock.getToken()).thenReturn("this is a token");


    }

}
