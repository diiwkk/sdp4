public class SMSObserver implements Observer {

    private String phone;

    public SMSObserver(String phone) {
        this.phone = phone;
    }

    @Override
    public void update(Observable observable) {
        System.out.println("Sending SMS to " + phone + " with weather: " + ((WeatherSubject) observable).getWeather());
    }
}