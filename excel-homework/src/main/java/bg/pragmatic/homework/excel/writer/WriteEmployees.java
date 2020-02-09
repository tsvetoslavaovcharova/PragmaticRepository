package bg.pragmatic.homework.excel.writer;

import bg.pragmatic.homework.excel.model.Candidate;
import bg.pragmatic.homework.excel.model.Employee;
import bg.pragmatic.homework.excel.model.Job;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WriteEmployees {

    public static void compareLists(List<Candidate> candidates, List<Job> jobs)  {

        try {

            List<Employee> employees = new ArrayList<>();
            List<Candidate> filtered = new ArrayList<>();
            for (Job job : jobs) {
                String jobName = "";
                filtered =
                        candidates
                                .stream()
                                .filter(p -> p.getCategory().equals(job.getCategory()))
                                .filter(p -> p.getProfession().equals(job.getProfession()))
                                .filter(p -> p.getYearsОfЕxperience() == (job.getYearsОfЕxperience()))
                                .collect(Collectors.toList());
            }
            for (Candidate candidate : filtered) {
                employees.add(new Employee(candidate.getFirstName(), candidate.getLastName(), candidate.getMobilePhone(), candidate.getProfession(), candidate.getCategory(), LocalDate.now(), candidate.getProfession()));
            }

            writeData(employees);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    public static void writeData(List<Employee> employees) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        String[] columns = {"firstName", "lastName", "mobilePhone", "profession", "category", "startedDate", "companyName"};
        CreationHelper createHelper = workbook.getCreationHelper();
        Sheet sheet = workbook.createSheet("Employee");

        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);
        Row headerRow = sheet.createRow(0);

        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }

        CellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        // Create Other rows and cells with employees data
        int rowNum = 1;
        for (Employee employee : employees) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(employee.getFirstName());

            row.createCell(1)
                    .setCellValue(employee.getLastName());

            row.createCell(2)
                    .setCellValue(employee.getMobilePhone());

            row.createCell(3)
                    .setCellValue(employee.getProfession());

            row.createCell(4)
                    .setCellValue(employee.getCategory());

            row.createCell(5)
                    .setCellValue(employee.getStartedDate());

            row.createCell(5)
                    .setCellValue(employee.getStartedDate());

            row.createCell(5)
                    .setCellValue(employee.getCompanyName());
        }

        for (int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        FileOutputStream fileOut = new FileOutputStream("employees.xlsx");
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();
    }
}
