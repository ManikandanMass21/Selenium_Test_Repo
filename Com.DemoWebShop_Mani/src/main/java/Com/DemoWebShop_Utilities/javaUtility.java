package Com.DemoWebShop_Utilities;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class javaUtility {
        // Get current date and time
	public static String DateTime() {
        LocalDateTime now = LocalDateTime.now();
        String date = now.toString().replace(".","").replace("_","").replace("-","").replace(":","");
        return date;

    }
}