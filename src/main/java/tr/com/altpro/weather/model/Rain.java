package tr.com.altpro.weather.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Rain {

    @JsonProperty("3h")
    private Integer threeh;
}
