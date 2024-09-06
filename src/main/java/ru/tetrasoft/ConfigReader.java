package ru.tetrasoft;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConfigReader {

    public String MegafonLogin;
    public String MegafonPassword;

    public String MTSLogin;
    public String MTSPassword;

    public String Tele2Login;
    public String Tele2Password;

    public ConfigReader(String filePath) {
        readValuesFromFile(filePath);
    }

    private void readValuesFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            int lineNumber = 0;

            while ((currentLine = reader.readLine()) != null) {
                lineNumber++;
                switch (lineNumber) {
                    case 2:
                        MegafonLogin = currentLine;
                        break;
                    case 3:
                        MegafonPassword = currentLine;
                        break;
                    case 7:
                        Tele2Login = currentLine;
                        break;
                    case 8:
                        Tele2Password = currentLine;
                        break;
                    case 12:
                        MTSLogin = currentLine;
                        break;
                    case 13:
                        MTSPassword = currentLine;
                        break;
                    default:
                        break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Геттеры для доступа к значениям
    public String getMegafonLogin() {
        return MegafonLogin;
    }

    public String getMegafonPassword() {
        return MegafonPassword;
    }

    public String getMTSLogin() {
        return MTSLogin;
    }

    public String getMTSPassword() {
        return MTSPassword;
    }

    public String getTele2Login() {
        return Tele2Login;
    }

    public String getTele2Password() {
        return Tele2Password;
    }
}