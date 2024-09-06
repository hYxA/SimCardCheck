//package ru.tetrasoft;
//
//import java.io.IOException;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//import java.io.IOException;
//
//public class PhoneDataChecker {
//    public static void main(String[] args) {
//        String excelFilePath = "phones.xlsx";
//        String chromeDriverPath = "path/to/chromedriver";
//        String loginUrl = "https://example.com/login";
//
//        try {
//            // Инициализация компонентов
//            ExcelReaderWriter excel = new ExcelReaderWriter(excelFilePath);
//            WebScraper scraper = new WebScraper(chromeDriverPath);
//
//            // Открытие страницы логина
//            scraper.openLoginPage(loginUrl);
//
//            // Авторизация (если требуется)
//            scraper.login("your_username", "your_password");
//
//            // Обработка каждой строки в Excel
//            int rowCount = excel.getRowCount();
//            for (int i = 0; i < rowCount; i++) {
//                String phoneNumber = excel.getPhoneNumber(i);
//                if (phoneNumber != null) {
//                    String dataBalance = scraper.getDataBalance(phoneNumber);
//                    excel.setDataBalance(i, dataBalance);
//                }
//            }
//
//            // Сохранение изменений в Excel
//            excel.save();
//
//            // Закрытие браузера
//            scraper.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
