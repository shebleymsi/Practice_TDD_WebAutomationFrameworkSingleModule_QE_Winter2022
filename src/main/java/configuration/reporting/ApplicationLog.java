package configuration.reporting;

public class ApplicationLog {
    public static void epicLogger(){
        //TestLogger.log(epic);
        TestLogger.log("Browser is launching");

    }
    public static void epicLogger(String epic){
        TestLogger.log(epic);
        TestLogger.log("launch local browser");
    }










}