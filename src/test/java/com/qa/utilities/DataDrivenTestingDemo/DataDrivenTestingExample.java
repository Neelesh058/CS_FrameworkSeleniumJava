package com.qa.utilities.DataDrivenTestingDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;

public class DataDrivenTestingExample {

    public static void main(String[] args)  {

        XSSFWorkbook excelworkbook=null;
        XSSFSheet excelsheet;
//        XSSFRow excelrow;
//        XSSFCell excelcell;

       File excelfile=new File("Data/TestData.xlsx");

        FileInputStream fis;
        try {
             fis=new FileInputStream(excelfile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            excelworkbook=new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        excelsheet=excelworkbook.getSheetAt(0);
        int totalRows=excelsheet.getLastRowNum()+1;
        int totalCells=excelsheet.getRow(0).getLastCellNum()  ;

        for(int currentRow=1; currentRow<totalRows;currentRow++)
        {
//            WebDriverManager.chromedriver().setup();
//            WebDriver driver = new ChromeDriver();
//            driver.get("http://www.automationpractice.pl/index.php");
//            driver.manage().window().maximize();
//            driver.findElement(By.linkText("Sign in")).click();
//            driver.findElement(By.id("email")).sendKeys(excelsheet.getRow(currentRow).getCell(0).toString());
//            driver.findElement(By.id("passwd")).sendKeys(excelsheet.getRow(currentRow).getCell(1).toString());
//            driver.findElement(By.id("SubmitLogin")).click();
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

            for(int currentCell=0; currentCell<totalCells; currentCell++)
            {

                System.out.print(excelsheet.getRow(currentRow).getCell(currentCell));
                System.out.print("\t");
            }
           System.out.println("");
//            driver.quit();
        }


    }
}
