package mtakil;

import com.fasterxml.jackson.databind.ObjectMapper;
import mtakil.model.RiskRequest;
import mtakil.model.TokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;


@Service
public class RiskRestClient {

    private static final String OAUTH_URL = "https://staging-auth.wallstreetdocs.com/oauth/token";

    private static final String RISK_URL = "https://staging-qlab-compute.priipcloud.com/v1.1/risk-measures";

    @Autowired
    private RestTemplate restTemplate;

    @Cacheable("tokens")
    public String getToken() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        LinkedMultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
        params.add("grant_type", "client_credentials");
        params.add("client_id", "coding_test");
        params.add("client_secret", "bwZm5XC6HTlr3fcdzRnD");

        HttpEntity<LinkedMultiValueMap<String, String>> request = new HttpEntity<LinkedMultiValueMap<String, String>>(params, headers);

        TokenResponse token = restTemplate.postForObject(OAUTH_URL, request, TokenResponse.class, new HashMap<String, String>());
        return token.getAccess_token();
    }

    public String calculateRisk(RiskRequest riskRequest, String token) {
        HttpHeaders headers = new HttpHeaders();
        //headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.add("Cache-Control", "no-cache");
        headers.add("Authorization", "Bearer " + token);
        headers.add("Content-Type", MediaType.APPLICATION_JSON_VALUE);
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<RiskRequest> request = new HttpEntity<RiskRequest>(riskRequest, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(RISK_URL, request, String.class);
        return response.getBody();
    }

}
