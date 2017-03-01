package at.klinger.service;

/**
 * Created by Nico on 27.02.2017.
 */

public interface IWeatherService<T>{

    public T getForecast(String city) throws Exception;

}
