package DAv.Features.LoginAuth.Domain;

import java.text.SimpleDateFormat;
import java.util.Date;


public class LoginResponse {

    private String token;
    private String tokenStartTime;
    private String tokenTimespan;

    public LoginResponse() {
        super(); //calls any constructors from any class it inhertis from (good practice
    }

    public LoginResponse(String token, String tokenStartTime, String tokenTimespan) {
        this.token = token;
        this.tokenStartTime = tokenStartTime;
        this.tokenTimespan = tokenTimespan;
    }

    public  String getToken(){
        return token;
    }

    public void setToken(String token){
        this.token = token;
    }

    public  String getTokenTimespan(){
        return tokenTimespan;
    }

    public void setTokenTimespan(String tokenTimespan){
        this.tokenTimespan = tokenTimespan;
    }

    public  String getTokenStartTime(){
        return tokenStartTime;
    }

    public void setTokenStartTime(String tokenStartTime){
        this.tokenStartTime = tokenStartTime;
    }

    public String FormatTime(String tokenTimeData){
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("MM/dd/yyyy hh:mm:ss a zzz");

        String responseTime = ft.format(date);
      // System.out.printf(toReturn);
        return responseTime;// ft.format(date));
    }
}