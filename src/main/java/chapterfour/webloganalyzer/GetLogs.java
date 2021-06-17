package chapterfour.webloganalyzer;

public class GetLogs {
    public static void main(String[] args) {
        LogAnalyzer logAnalyzer = new LogAnalyzer();

        logAnalyzer.analyzeHourlyData();
        logAnalyzer.printHourlyCounts();
        System.out.println("number: " + logAnalyzer.numberOfAccesses());
        System.out.println("Busiest hour:" + logAnalyzer.busiestHour());
        System.out.println("Quietest hour:" + logAnalyzer.quietestHour());
        System.out.println("Busiest in 2hour period:" + logAnalyzer.busiestInTwoHours());
    }
}
