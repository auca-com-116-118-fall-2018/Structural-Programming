public class Main {

    public static void main(String[] args) {
        int birthRateSeconds = 7;
        int deathRateSeconds = 13;
        int newImmigrantSeconds = 45;

        int currentPopulation = 312032486;
        int secondsInYears1 = 24 * 60 * 60 * 365;
        int secondsInYears2 = 2 * 24 * 60 * 60 * 365;
        int secondsInYears3 = 3 * 24 * 60 * 60 * 365;
        int secondsInYears4 = 4 * 24 * 60 * 60 * 365;
        int secondsInYears5 = 5 * 24 * 60 * 60 * 365;

        int births1 = secondsInYears1 / birthRateSeconds;
        int births2 = secondsInYears2 / birthRateSeconds;
        int births3 = secondsInYears3 / birthRateSeconds;
        int births4 = secondsInYears4 / birthRateSeconds;
        int births5 = secondsInYears5 / birthRateSeconds;

        int deaths1 = secondsInYears1 / deathRateSeconds;
        int deaths2 = secondsInYears2 / deathRateSeconds;
        int deaths3 = secondsInYears3 / deathRateSeconds;
        int deaths4 = secondsInYears4 / deathRateSeconds;
        int deaths5 = secondsInYears5 / deathRateSeconds;

        int immigrants1 = secondsInYears1 / newImmigrantSeconds;
        int immigrants2 = secondsInYears2 / newImmigrantSeconds;
        int immigrants3 = secondsInYears3 / newImmigrantSeconds;
        int immigrants4 = secondsInYears4 / newImmigrantSeconds;
        int immigrants5 = secondsInYears5 / newImmigrantSeconds;

        int a = (currentPopulation + immigrants1 + births1 - deaths1);
        int b = (currentPopulation + immigrants2 + births2 - deaths2);
        int c = (currentPopulation + immigrants3 + births3 - deaths3);
        int d = (currentPopulation + immigrants4 + births4 - deaths4);
        int e = (currentPopulation + immigrants5 + births5 - deaths5);

        System.out.println("Year 1 = " + a);
        System.out.println("Year 2 = " + b);
        System.out.println("Year 3 = " + c);
        System.out.println("Year 4 = " + d);
        System.out.println("Year 5 = " + e);
    }
}