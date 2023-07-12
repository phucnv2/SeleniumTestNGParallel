package SeleniumTestNGPOM.testcases;

import SeleniumTestNGPOM.common.BaseTest;
import SeleniumTestNGPOM.pages.login.LoginPage;
import drivers.DriverManager;
import helpers.ExcelHelper;
import helpers.PropertiesHelper;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.LogUtils;

public class LoginTest extends BaseTest {
    LoginPage loginPage; // khai báo loginPage từ package pages

//    @Test(priority = 1)
//    public void loginPageEmailInvalid() {
//        loginPage = new LoginPage();
//        loginPage.pageLoginEmailInvalid("adminn@example.com", "123456");
//    }
//    @Test(priority = 2)
//    public void loginPagePasswordInvalid() {
//        loginPage = new LoginPage(driver);
//        loginPage.pageLoginPasswordInvalid("admin@example.com", "12345");
//    }
//    @Test(priority = 3)
//    public void pageLoginEmailAndPasswordInvalid() {
//        loginPage = new LoginPage(driver);
//        loginPage.pageLoginEmailAndPasswordInvalid("adminn@example.com", "12345");
//    }
//    @Test(priority = 4)
//    public void pageLoginEmailNull() {
//        loginPage = new LoginPage(driver);
//        loginPage.pageLoginEmailNull("", "123456");
//    }
//    @Test(priority = 5)
//    public void pageLoginPasswordNull() {
//        loginPage = new LoginPage(driver);
//        loginPage.pageLoginPasswordNull("admin@example.com", "");
//    }
//    @Test(priority = 6)
//    public void pageLoginEmailAndPasswordNull() {
//        loginPage = new LoginPage();
//        loginPage.pageLoginEmaiAndPasswordNull("", "");
//    }
//    @Test(priority = 7)
//    public void loginPageSuccess() {
//        //Khởi tạo đối tượng từ trang login
//        // truyền driver từ BaseTest
//        loginPage = new LoginPage();
//        // gọi hàm login để dùng
//        loginPage.pageLoginSuccess(PropertiesHelper.getValue("email"), PropertiesHelper.getValue("password"));
//    }
    @Test(priority = 7)
    public void loginPageSuccess1() {
        //Khởi tạo đối tượng từ trang login
        // truyền driver từ BaseTest
        LogUtils.info("Phúc");
        loginPage = new LoginPage();
        ExcelHelper excelHelper = new ExcelHelper();
        excelHelper.setExcelFile("src/test/resources/datatest/Crm.xlsx","Login");
        // gọi hàm login để dùng
        loginPage.pageLoginSuccess(excelHelper.getCellData("EMAIL",1), excelHelper.getCellData("PASSWORD",1));
        excelHelper.setCellData("Pass",1,"RESULD");
    }
}
