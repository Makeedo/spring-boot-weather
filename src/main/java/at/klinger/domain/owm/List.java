
package at.klinger.domain.owm;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dt",
    "temp",
    "pressure",
    "humidity",
    "weather",
    "speed",
    "deg",
    "clouds"
})
public class List {

    @JsonProperty("dt")
    private Long dt;
    @JsonIgnore
    private Date weatherDate;
    @JsonProperty("temp")
    private Temp temp;
    @JsonProperty("pressure")
    private Float pressure;
    @JsonProperty("humidity")
    private Long humidity;
    @JsonProperty("weather")
    private java.util.List<Weather> weather = null;
    @JsonProperty("speed")
    private Float speed;
    @JsonProperty("deg")
    private Long deg;
    @JsonProperty("clouds")
    private Long clouds;

    @JsonProperty("dt")
    public Long getDt() {
        return dt;
    }

    @JsonProperty("dt")
    public void setDt(Long dt) {
        this.dt = dt;
    }

    @JsonIgnore
    public Date getWeatherDate() {
        if(weatherDate == null){
            setWeatherDate(new Date(getDt()));
        }
        return weatherDate;
    }

    @JsonIgnore
    public void setWeatherDate(Date weatherDate) {
        this.weatherDate = weatherDate;
    }

    @JsonProperty("temp")
    public Temp getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    @JsonProperty("pressure")
    public Float getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("humidity")
    public Long getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Long humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("weather")
    public java.util.List<Weather> getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(java.util.List<Weather> weather) {
        this.weather = weather;
    }

    @JsonProperty("speed")
    public Float getSpeed() {
        return speed;
    }

    @JsonProperty("speed")
    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    @JsonProperty("deg")
    public Long getDeg() {
        return deg;
    }

    @JsonProperty("deg")
    public void setDeg(Long deg) {
        this.deg = deg;
    }

    @JsonProperty("clouds")
    public Long getClouds() {
        return clouds;
    }

    @JsonProperty("clouds")
    public void setClouds(Long clouds) {
        this.clouds = clouds;
    }

}
