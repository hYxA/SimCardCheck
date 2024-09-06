package ru.tetrasoft;

public class Main {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\admin\\Desktop\\Test Java\\Megafon MTS Tele2.txt";
        ConfigReader configReader = new ConfigReader(filePath);

        String MTSLogin = configReader.getMTSLogin();
        String MTSPassword = configReader.getMTSPassword();

        System.out.println("MegafonLogin: " + configReader.MegafonLogin);
        System.out.println("MegafonPass: " + configReader.MegafonPassword);
        System.out.println("MTSLogin: " + configReader.MTSLogin);
        System.out.println("MTSPassword: " + configReader.MTSPassword);
        System.out.println("Tele2Login: " + configReader.Tele2Login);
        System.out.println("Tele2Password: " + configReader.Tele2Password);

        ConfigReader configReader1 = new ConfigReader(filePath);

        MTSWebScraper mtsWebScraper = new MTSWebScraper()

          // Передаем значения другим классам
//        AnotherClass anotherClass = new AnotherClass(config.getFirstValue(), config.getSecondValue());
//        anotherClass.printValues();
    }
}

//class AnotherClass {
//    private String value1;
//    private String value2;
//
//    public AnotherClass(String value1, String value2) {
//        this.value1 = value1;
//        this.value2 = value2;
//    }
//
//    public void printValues() {
//        System.out.println("Значение 1: " + value1);
//        System.out.println("Значение 2: " + value2);
//    }



