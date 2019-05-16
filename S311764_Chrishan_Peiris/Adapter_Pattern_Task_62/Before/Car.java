class SpeedByCountry {
    double speedbycountry;
    double mph = 220;
    public void checkCountry (String country) {


        if (country == "UK") {
            speedbycountry = convertMPHtoKMPH(mph);
        }

        else if (country == "US") {
            speedbycountry = mph;
        }

        System.out.println("The speed of the car is " + speedbycountry + " in the " + country );
        }

        private double convertMPHtoKMPH(double mph) {
            return mph * 1.60934;
        }


    }



public class Car {
    public static void main(String[] args) {
        SpeedByCountry country = new SpeedByCountry();
        country.checkCountry("UK");
    }
}