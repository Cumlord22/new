package WeatherApps.OpenWeatherMap;

public class Sys {
    int timezone;
    char name;
    int id;
    int cod;

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Sys(int timezone, char name, int id, int cod) {
        this.timezone = timezone;
        this.name = name;
        this.id = id;
        this.cod = cod;
    }
}
