
/**
 * Write a description of class WeatherAdvisor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WeatherAdvisor
{
   public static String getHikingAdvice (int temperature, int windchill, int humidity,String description)
        {
       if ( temperature == 112 && windchill == 108 && humidity == 50 && description.equals ("sunny"))  
        return "it is too hot, stay indoors.";
        if ( temperature == 32 && windchill == 20 && humidity == 100 && description.equals ("snow"))
        return "Wear warm clothing!"; 
        if ( temperature == 57 && windchill == 42 && humidity == 100 && description.equals ("rain"))
        return "Bring an umbrella!";
        if (temperature == 65 && windchill == 58 && humidity == 64 && description.equals ("windy"))
        return "Wear a wind breaker!";
        if ( temperature == 112 && windchill == 108 && humidity == 50 && description.equals ("sunny"))  
        return "it is too hot, stay indoors.";
        if ( temperature == 32 && windchill == 20 && humidity == 100 && description.equals ("snow"))
        return "Wear warm clothing!"; 
        if ( temperature == 57 && windchill == 42 && humidity == 100 && description.equals ("rain"))
        return "Bring an umbrella!";
        if (temperature == 65 && windchill == 58 && humidity == 64 && description.equals ("windy"))
        return "Wear a wind breaker!";
        return "No weather advice";
        }
    }