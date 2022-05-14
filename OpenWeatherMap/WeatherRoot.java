package WeatherApps.OpenWeatherMap;

import java.util.List;

public class WeatherRoot {
    private Coord coord;
    private List<Weather> weather;
    public Main main;
    public Sys sys;

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public WeatherRoot(Sys weatherSystem) {
        this.sys = weatherSystem;
    }

    public Clouds clouds;
    public Wind getWind() {
        return wind;
    }
    public List<Weather> getWeather(){
        return weather;
    }
    public void setWeather(List<Weather> weather){
        this.weather = weather;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public WeatherRoot(Clouds clouds) {
        this.clouds = clouds;
    }

    public WeatherRoot(Main weatherTemp) {
        this.main = weatherTemp;
    }

    public WeatherRoot(Coord coord, List<Weather> weather, Main main, Clouds clouds, Wind wind) {
        this.coord = coord;
        this.weather = weather;
        this.main = main;
        this.clouds = clouds;
        this.wind = wind;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public WeatherRoot(Wind wind) {
        this.wind = wind;
    }

    private Wind wind;



    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }



}
