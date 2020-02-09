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
            int yearsОfЕxperience=0;

            int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
            for (int i = 1; i <= rowCount ; i++) {

                Row row = sheet.getRow(i);

                for (int j = 0; j < row.getLastCellNum(); j++) {
                    firstName= row.getCell(j).getStringCellValue();
                    lastName= row.getCell(j+1).getStringCellValue();
                    age= (int) row.getCell(j+2).getNumericCellValue();
                    mobilePhone= String.valueOf(row.getCell(j+3).getNumericCellValue());
                    profession= row.getCell(j+4).getStringCellValue();
                    category= row.getCell(j+5).getStringCellValue();
                    yearsОfЕxperience = (int) row.getCell(j+6).getNumericCellValue();
                }

                Candidate c = new Candidate(firstName, lastName, age, mobilePhone, profession, category, yearsОfЕxperience);
                candidates.add(c);
            }
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return candidates;
    }
}
