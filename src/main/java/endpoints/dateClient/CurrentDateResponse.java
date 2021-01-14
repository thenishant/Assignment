package endpoints.dateClient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import endpoints.BaseResponse;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentDateResponse extends BaseResponse {
    public String base;
    public Rates rates;
    public String date;
    public String error;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Rates {
        public String GBP;
        public String HKD;
        public String IDR;
        public String ILS;
        public String DKK;
        public String INR;
        public String CHF;
        public String MXN;
        public String CZK;
        public String SGD;
        public String THB;
        public String HRK;
        public String MYR;
        public String NOK;
        public String CNY;
        public String BGN;
        public String PHP;
        public String SEK;
        public String PLN;
        public String ZAR;
        public String CAD;
        public String ISK;
        public String BRL;
        public String RON;
        public String NZD;
        public String TRY;
        public String JPY;
        public String RUB;
        public String KRW;
        public String USD;
        public String HUF;
        public String AUD;
        public String EUR;
        public String LVL;
    }

}
