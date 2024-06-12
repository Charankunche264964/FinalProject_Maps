package Autocomplete.autocomplete.Service;

import Autocomplete.autocomplete.Model.MyRequestData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

@Service
public class AutocompleteService implements Externalapi {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${autocomplete.api.url}")
    private String url;

    @Value("${autocomplete.api.key}")
    private String apiKey;

    @Override
    public String callExternalApi(MyRequestData requestData) throws Exception {
        //String url = "http://qa-dna-locations-data-service.aws.phenom.local/v1/location/autocomplete";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("api-key", "test");
        ObjectMapper mapper = new ObjectMapper();
        String jsonData = mapper.writeValueAsString(requestData);

        HttpEntity<String> entity = new HttpEntity<String>(jsonData, headers);

        try {
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
            return response.getBody();
        } catch (RestClientResponseException e) {
            throw new Exception("Error calling external API: " + e.getMessage());
        }
    }
}
