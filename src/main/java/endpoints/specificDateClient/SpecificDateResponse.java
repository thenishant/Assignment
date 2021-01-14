package endpoints.specificDateClient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import endpoints.BaseResponse;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpecificDateResponse extends BaseResponse {
    public String getDate() {
        return date;
    }

    public Rates getRates() {
        return rates;
    }

    public String getBase() {
        return base;
    }

    public String getError() {
        return error;
    }

    private String date;
    private Rates rates;
    private String base;
    public String error;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Rates {
        public String getGBP() {
            return GBP;
        }

        public String getCHF() {
            return CHF;
        }

        public String getHRK() {
            return HRK;
        }

        public String getMXN() {
            return MXN;
        }

        public String getLVL() {
            return LVL;
        }

        public String getLTL() {
            return LTL;
        }

        public String getZAR() {
            return ZAR;
        }

        public String getINR() {
            return INR;
        }

        public String getTHB() {
            return THB;
        }

        public String getCNY() {
            return CNY;
        }

        public String getAUD() {
            return AUD;
        }

        public String getKRW() {
            return KRW;
        }

        public String getJPY() {
            return JPY;
        }

        public String getPLN() {
            return PLN;
        }

        public String getIDR() {
            return IDR;
        }

        public String getHUF() {
            return HUF;
        }

        public String getPHP() {
            return PHP;
        }

        public String getTRY() {
            return TRY;
        }

        public String getRUB() {
            return RUB;
        }

        public String getHKD() {
            return HKD;
        }

        public String getDKK() {
            return DKK;
        }

        public String getMYR() {
            return MYR;
        }

        public String getCAD() {
            return CAD;
        }

        public String getUSD() {
            return USD;
        }

        public String getBGN() {
            return BGN;
        }

        public String getEEK() {
            return EEK;
        }

        public String getNOK() {
            return NOK;
        }

        public String getRON() {
            return RON;
        }

        public String getSGD() {
            return SGD;
        }

        public String getCZK() {
            return CZK;
        }

        public String getSEK() {
            return SEK;
        }

        public String getNZD() {
            return NZD;
        }

        public String getBRL() {
            return BRL;
        }

        private String GBP;
        private String CHF;
        private String HRK;
        private String MXN;
        private String LVL;
        private String LTL;
        private String ZAR;
        private String INR;
        private String THB;
        private String CNY;
        private String AUD;
        private String KRW;
        private String JPY;
        private String PLN;
        private String IDR;
        private String HUF;
        private String PHP;
        private String TRY;
        private String RUB;
        private String HKD;
        private String DKK;
        private String MYR;
        private String CAD;
        private String USD;
        private String BGN;
        private String EEK;
        private String NOK;
        private String RON;
        private String SGD;
        private String CZK;
        private String SEK;
        private String NZD;
        private String BRL;
    }

}
