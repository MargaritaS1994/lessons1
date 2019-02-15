/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverWeather;

/**
 *
 * @author user1
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay cuurrentDisplay = new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMeasurements(30, 65, 30.2f);
        weatherData.setMeasurements(20, 75, 29.2f);
        weatherData.setMeasurements(31, 95, 29.2f);
    }
    
}
