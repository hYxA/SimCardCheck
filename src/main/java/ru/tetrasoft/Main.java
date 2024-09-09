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

        MTSWebScraper mtsWebScraper = new MTSWebScraper();

        MTSWebScraper.openLoginPage();

    }
}




