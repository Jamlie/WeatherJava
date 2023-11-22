import com.jam.*;
import com.jam.common.IWeatherDataSubject;
import com.jam.common.WeatherDataObservable;
import com.jam.types.PrecipitationType;
import com.jam.types.TemperatureUnit;
import com.jam.types.WindSpeedMeasurementUnit;
import com.jam.weather_decorators.PrecipitationDecorator;
import com.jam.weather_decorators.TemperatureUnitsDecorator;
import com.jam.weather_decorators.WeatherDecorator;
import com.jam.weather_decorators.WindSpeedDecorator;

public class Main {
    public static void main(String[] args) {
        IWeatherDataSubject weatherDataSubject = new WeatherDataSubject();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDataSubject);
        WeatherDataObservable currentConditionsDisplay = new CurrentConditionsDisplay(weatherDataSubject);

        weatherDataSubject.setMeasurements(-5, 90);
        weatherDataSubject.setMeasurements(19, 80);
        weatherDataSubject.setMeasurements(30, 40);

        WeatherDecorator p = new PrecipitationDecorator(currentConditionsDisplay, PrecipitationType.RAIN);
        WeatherDecorator t = new TemperatureUnitsDecorator(currentConditionsDisplay, TemperatureUnit.FAHRENHEIT);
        WeatherDecorator w = new WindSpeedDecorator(currentConditionsDisplay, 20, WindSpeedMeasurementUnit.MPH);

        weatherDataSubject.registerObserver(p);
        weatherDataSubject.registerObserver(t);
        weatherDataSubject.registerObserver(w);

        System.out.println("-----------------");
        weatherDataSubject.removeObserver(statisticsDisplay);

        weatherDataSubject.setMeasurements(21, 90);
    }
}
