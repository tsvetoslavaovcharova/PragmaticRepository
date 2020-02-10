package bg.pragmatic.homework.excel.reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bg.pragmatic.homework.excel.model.Candidate;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCandidates {

    public static List<Candidate> readExcelData(String fileName) {
        List<Candidate> candidates = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(fileName);

            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);

            String firstName = "";
            String lastName = "";
            int age = 0;
            String mobilePhone = "";
            String profession = "";
            String category = "";
            int yearsОfЕxperience = 0;

            int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
            for (int i = 1; i <= rowCount; i++) {

                Row row = sheet.getRow(i);

                firstName = row.getCell(0).getStringCellValue();
                lastName = row.getCell(1).getStringCellValue();
                age = (int) row.getCell(2).getNumericCellValue();
                mobilePhone = String.valueOf(row.getCell(3).getNumericCellValue());
                profession = row.getCell(4).getStringCellValue();
                category = row.getCell(5).getStringCellValue();
                yearsОfЕxperience = (int) row.getCell(6).getNumericCellValue();

                candidates.add(new Candidate(firstName, lastName, age, mobilePhone, profession, category, yearsОfЕxperience));
            }
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return candidates;
    }
}
