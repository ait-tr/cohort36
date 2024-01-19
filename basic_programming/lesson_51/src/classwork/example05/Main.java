package classwork.example05;

public class Main {
    /*
    Example:

    ['John', 'Smith'], 'Phoenix', 'Arizona'

    This example will return the string

    Hello, John Smith! Welcome to Phoenix, Arizona!
     */

    public String sayHello(String [] name, String city, String state){
        StringBuilder sb = new StringBuilder("Hello,");

        for (String s : name) {
            sb.append(" ").append(s);
        }
        return sb.append("! Welcome to ").append(city).append(", ")
                .append(state).append("!").toString();
    }
}
