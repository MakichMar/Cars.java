package cars;

public class Cars {

    static String[] bmw = {"BMW", "X6", "V8", "480HP"};
    static String[] mercedesBenz = {"Mercedes-Benz", "CLs", "V8", "524HP"};
    static String[] audi = {"Audi", "A8", "V8", "420HP"};
    static String[] opel = {"Opel", "Astra-g", "V4", "125HP"};
    static String[] ford = {"Ford", "Mustang GT500", "V8", "660HP"};

    public static void run() {
        System.out.println("Car is running");
    }

    public static void carInfo(String name) {
        if (name == "bmw") {
            for (int i = 0; i < 4; i++) {
                System.out.println(bmw[i]);
            }
        } else if (name == "mercedesBenz") {
            for (int i = 0; i < 4; i++) {
                System.out.println(mercedesBenz[i]);
            }
        } else if (name == "audi") {
            for (int i = 0; i < 4; i++) {
                System.out.println(audi[i]);
            }
        } else if (name == "opel") {
            for (int i = 0; i < 4; i++) {
                System.out.println(opel[i]);
            }
        } else if (name == "bmw") {
            for (int i = 0; i < 4; i++) {
                System.out.println(ford[i]);
            }
        }
    }

    public static void getBrand(String brand) {
        if (brand == "bmw") {
            System.out.println(bmw[0]);
        } else if (brand == "mercedesBenz") {
            System.out.println(mercedesBenz[0]);
        } else if (brand == "audi") {
            System.out.println(audi[0]);
        } else if (brand == "opel") {
            System.out.println(opel[0]);
        } else if (brand == "bmw") {
            System.out.println(ford[0]);
        }
    }

    public static void getModel(String model) {
        if (model == "X6") {
            System.out.println(bmw[1]);
        } else if (model == "CLS") {
            System.out.println(mercedesBenz[1]);
        } else if (model == "audi") {
            System.out.println(audi[1]);
        } else if (model == "opel") {
            System.out.println(opel[1]);
        } else if (model == "bmw") {
            System.out.println(ford[1]);
        }

    }

    public static void getEngine(String engine) {
        if (engine == "bmw") {
            System.out.println(bmw[2]);
        } else if (engine == "mercedesBenz") {
            System.out.println(mercedesBenz[2]);
        } else if (engine == "audi") {
            System.out.println(audi[2]);
        } else if (engine == "opel") {
            System.out.println(opel[2]);
        } else if (engine == "bmw") {
            System.out.println(ford[2]);
        }

    }

    public static void getHorsePower(String HoesePower) {
        if (HoesePower == "bmw") {
            System.out.println(bmw[3]);
        } else if (HoesePower == "mercedesBenz") {
            System.out.println(mercedesBenz[3]);
        } else if (HoesePower == "audi") {
            System.out.println(audi[3]);
        } else if (HoesePower == "opel") {
            System.out.println(opel[3]);
        } else if (HoesePower == "bmw") {
            System.out.println(ford[3]);
        }
    }
}
