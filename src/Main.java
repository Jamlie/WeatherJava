import com.jam.*;
import com.jam.common.IWeatherDataSubject;
import com.jam.common.WeatherDataObservable;
import com.jam.types.PrecipitationType;
import com.jam.types.TemperatureUnit;
import com.jam.types.WindSpeedMeasurementUnit;
import com.jam.weather_decorators.*;

public class Main {
    public static void main(String[] args) {
        IWeatherDataSubject weatherDataSubject = new WeatherDataSubject();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDataSubject);
        WeatherDataObservable currentConditionsDisplay = new CurrentConditionsDisplay(weatherDataSubject);

        weatherDataSubject.setMeasurements(-5, 90);
        weatherDataSubject.setMeasurements(19, 80);
        weatherDataSubject.setMeasurements(30, 40);

        IWeatherDataSubject precipitationDecorator = new PrecipitationDecorator(PrecipitationType.RAIN);

        StatisticsDisplay statisticsDisplayPrecipitation = new StatisticsDisplay(precipitationDecorator);

        precipitationDecorator.setMeasurements(20, 80);
        precipitationDecorator.setMeasurements(30, 70);
        precipitationDecorator.setMeasurements(40, 60);

        weatherDataSubject.removeObserver(statisticsDisplay);
        precipitationDecorator.removeObserver(statisticsDisplayPrecipitation);

        weatherDataSubject.setMeasurements(21, 90);
        precipitationDecorator.setMeasurements(20, 80);
    }
}
