import java.time.LocalDate;
import java.time.DayOfWeek;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dow = date.getDayOfWeek();
        return dow.toString().substring(0,1) + dow.toString().substring(1).toLowerCase();
    }
}
