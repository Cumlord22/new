package WeatherApps.OpenWeatherMap;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WeatherAPI {
    private String keys;
    private String city;
    private String country;

    Gson gson = new Gson();

    public WeatherAPI(String keys, String city, String country) {
        this.keys = keys;
        this.city = city;
        this.country = country;
    }
    public String getJsonAPI(String link) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        URL url = new URL(link);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = bufferedReader.readLine())!=null){
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }
    public String getLink(){
        String link = "https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+keys;
        return link;
    }
    public WeatherRoot getWeatherData() throws IOException {

        WeatherRoot weatherRoot = gson.fromJson(getJsonAPI(getLink()),WeatherRoot.class);
        return weatherRoot;
    }

    public void main(String[] args) throws IOException {
        WeatherAPI weatherAPI = new WeatherAPI("aec1e529769a76ec5165690f04cf4a13",
                "Ho chi minh city", "VN");
        System.out.println(weatherAPI.getWeatherData().getCoord().getLat());

        System.out.println(weatherAPI.getJsonAPI(weatherAPI.getLink()));
    }
}

