
/**
 * Write a description of class WeatherConditionals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WeatherConditionals
{
    public static String getWeatherAdvice(int temperature, String description){
     boolean windy = description.equals ("windy");
     boolean sunny = description.equals ("sunny");
     boolean snow = description.equals ("snow"); 
     if ( temperature == 34 && description.equals ("sunny"))
     return "It's safe to go ouside, 34 degrees and sunny.";
     if ( temperature == 32 && description.equals ("windy"))
     return "Too windy or cold! Enjoy watching the weather through the window.";
     if ( temperature == 33 && description.equals ("snow"))
     return "It’s safe to go outside, 33 degrees and snow.";
     if ( temperature == 30 && description.equals ("snow"))
     return "Too windy or cold! Enjoy watching the weather through the window.";
     if ( temperature == 30 && description.equals ("windy"))
     return "Too windy or cold! Enjoy watching the weather through the window.";
     if (temperature == 101 && description.equals ("rain"))
     return "That cannot be correct.";
     
     return "There is no advice.";
    }
}