package Autocomplete.autocomplete.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class MyRequestData {
    private String refNum;
    private String location;
    private String source;
    private List<String> boundaryCountry;
    private int size;
}
