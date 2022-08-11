import java.time.LocalTime;

public class TimeToTextConverter {
    public String convertTimeToText(LocalTime timeToConvert) {
        if (timeToConvert.getHour() == 0 && timeToConvert.getMinute() == 0) {
            return "midnight";
        } else if (timeToConvert.getHour() == 12 && timeToConvert.getMinute() == 0){
            return "midday";
        } else {
            return null;
        }

    }
}
