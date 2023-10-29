public class EmailObserver implements Observer {

    private String email;

    public EmailObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(Observable observable) {
        System.out.println("Sending email to " + email + " with weather: " + ((WeatherSubject) observable).getWeather());
    }
}
