package bg.pragmatic.resthomework.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

@RestController
public class DateToDayConverterController {

    @GetMapping("/datetodayconverter")
    public  String convertDate(@RequestParam String date) {
        String[] dateArr = date.split("\\.");
        System.out.println(date);

        for (String date2:
             dateArr) {
            System.out.println(date2);
        }
        LocalDate localDate
                = LocalDate.of(Integer.parseInt(dateArr[2]),
               Integer.parseInt(dateArr[1]), Integer.parseInt(dateArr[0]));
        DayOfWeek dayOfWeek
                = DayOfWeek.from(localDate);
        String dayOfWeekName = dayOfWeek.name();
        return dayOfWeekName;
    }
}
