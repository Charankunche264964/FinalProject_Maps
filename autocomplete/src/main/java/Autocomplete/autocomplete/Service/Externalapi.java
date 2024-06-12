package Autocomplete.autocomplete.Service;

import Autocomplete.autocomplete.Model.MyRequestData;

public interface Externalapi {
    public String callExternalApi(MyRequestData requestData) throws Exception;
}
