package oops.inheritance.hybrid;

class SolarSystem {
    public void display_solar(){
        System.out.println("Solar System");
    }
}

class Mars extends SolarSystem {
    public void display_mars(){
        System.out.println("Mars");
    }
}

class Earth extends SolarSystem {
    public void display_earth(){
        System.out.println("Earth");
    }
}

class Moon extends Earth {
    public void display_moon(){
        System.out.println("Moon");
    }
}

// Driver class
public class Main {
    public static void main(String[] args) {
        Moon m = new Moon();
        m.display_earth();
        m.display_moon();

        Earth e = new Earth();
        e.display_solar();
        e.display_earth();

        Mars m1 = new Mars();
        m1.display_solar();
        m1.display_mars();

    }
}
