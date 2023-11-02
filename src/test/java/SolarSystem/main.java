package SolarSystem;

public class main {
    public static void main(String[] args) {
        solarSystemBasics solarSys = new solarSystemBasics();
        solarSys.Sun = "1";
        solarSys.Moon = "2";
        solarSys.Planets="2";
        solarSys.Stars="10";

        FeatureSun sun=new FeatureSun();
        sun.name="panther";
        sun.color="black";

        sun.temp="-1223124kelvin";
    }
}