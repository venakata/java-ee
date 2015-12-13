package name.abhijitsarkar.javaee.travel.domain;

import lombok.Builder;
import lombok.Data;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.TimeZone;

/**
 * @author Abhijit Sarkar
 */
@Builder
@Data
public class Airport {
    private String name;
    private String city;
    private String country;

    /* The Federal Aviation Administration identifier is a three- or four-letter alphanumeric code
     * identifying United States airports.
     */
    private String faaCode;
    /*
    * The ICAO (/ˌaɪˌkeɪˈoʊ/, "I-K-O") airport code or location indicator is a four-character alphanumeric code
    * designating aerodromes around the world. These codes are defined by the International Civil Aviation Organization.
    */
    private String icao;
    private ZoneOffset timeZoneOffset;

    public void updateFrom(Airport from) {
        name = from.name;
        city = from.city;
        country = from.country;
        faaCode = from.faaCode;
        icao = from.icao;
        timeZoneOffset = from.timeZoneOffset;
    }
}