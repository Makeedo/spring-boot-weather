package at.klinger.web;

import at.klinger.domain.owm.OWMForecastResponse;
import at.klinger.service.IWeatherService;
import com.github.fedy2.weather.data.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller
public class WeatherController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IWeatherService<Channel> yahooService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "redirect:/forecast/vienna";
    }

    @RequestMapping(value = "/forecast/{city}", method = RequestMethod.GET)
    public String getForecast(Model model, @PathVariable("city") String city) throws Exception {

        Channel yahooResponse = yahooService.getForecast(city);
        model.addAttribute("cityKey", city);
        model.addAttribute("currentWeather", yahooResponse.getItem().getCondition());
        model.addAttribute("forecasts", yahooResponse.getItem().getForecasts());

        return Pages.FORECAST;

    }

    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception e){
        return Pages.ERROR;
    }

}