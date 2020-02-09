package bg.pragmatic.homework.excel;

import bg.pragmatic.homework.excel.model.Candidate;
import bg.pragmatic.homework.excel.model.Job;
import bg.pragmatic.homework.excel.reader.ReadCandidates;
import bg.pragmatic.homework.excel.reader.ReadJobs;
import bg.pragmatic.homework.excel.writer.WriteEmployees;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String args[]) {
      List<Candidate> candidates = ReadCandidates.readExcelData("C:\\Users\\govch\\Desktop\\candidates.xlsx");
      List<Job> jobs = ReadJobs.readExcelData("C:\\Users\\govch\\Desktop\\job.xlsx");
      WriteEmployees.compareLists(candidates, jobs);
    }
}
