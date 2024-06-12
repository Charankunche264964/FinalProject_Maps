package Autocomplete.autocomplete.Controller;

import Autocomplete.autocomplete.Model.MyRequestData;
import Autocomplete.autocomplete.Service.AutocompleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
@CrossOrigin(origins="*")
public class AutocompleteController {
    @Autowired
    private AutocompleteService autocompleteService;

    @PostMapping("/data")  // Maps POST requests to /api/v1/data
    public ResponseEntity<String> getData(@RequestBody MyRequestData requestData) throws Exception {
        System.out.println("hi");
        String response = autocompleteService.callExternalApi(requestData);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
