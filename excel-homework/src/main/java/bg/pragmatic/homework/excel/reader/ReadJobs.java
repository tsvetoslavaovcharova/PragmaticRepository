package bg.pragmatic.homework.excel.reader;

import bg.pragmatic.homework.excel.model.Candidate;
import bg.pragmatic.homework.excel.model.Job;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadJobs {

    public static List<Job> readExcelData(String fileName) {
        List<Job> jobs = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(fileName);

            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);

            String profession = "";
            String category = "";
            int yearsОfЕxperience = 0;
            String name = "";

            int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
            for (int i = 1; i <= rowCount; i++) {
                Row row = sheet.getRow(i);
                profession = row.getCell(0).getStringCellValue();
                category = row.getCell(1).getStringCellValue();
                yearsОfЕxperience = (int) row.getCell(2).getNumericCellValue();
                name = row.getCell(3).getStringCellValue();

                jobs.add(new Job(profession, category, yearsОfЕxperience, name));
            }
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return jobs;
    }

}
