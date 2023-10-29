public class Main {

    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();

        weatherSubject.addObserver(new EmailObserver("diana05@mail.ru"));
        weatherSubject.addObserver(new SMSObserver("+7 705 555 55 55"));

        weatherSubject.setWeather("Sunny");
        weatherSubject.setWeather("Rainy");
        weatherSubject.setWeather("Snowy");
    }
}