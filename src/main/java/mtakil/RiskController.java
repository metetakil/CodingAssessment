package mtakil;

import mtakil.model.RiskRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RiskController {

    @Autowired
    private RiskRestClient riskRestClient;

    @RequestMapping(method = RequestMethod.POST, value = "/api/v1.0/risk")
    public String risk(@RequestBody RiskRequest riskRequest) {
        String token = riskRestClient.getToken();

        String response = riskRestClient.calculateRisk(riskRequest, token);
        return response;
    }

}
