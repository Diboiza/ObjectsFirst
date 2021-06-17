package chapterfour.webloganalyzer;

/**
 * Read web server data and analyse
 * hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasMoreEntries()) {
            LogEntry entry = reader.nextEntry();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        int hour = 0;
        while (hour < hourCounts.length) {
            System.out.println(hour + ": " + hourCounts[hour]);
            hour++;
        }
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }

    /**
     * Return the number of access recorded in the log file
     */
    public int numberOfAccesses(){
        int num = 0;
        for (int total = 0; total < hourCounts.length; total++)
        {
            num = num + hourCounts[total];
        }
        return num;
    }

    public int busiestHour(){
        int max = hourCounts[0];
        for (int count: hourCounts) {
            if(count > max){
                max = count;
            }
        }
        return max;
    }

    public int quietestHour(){
        int min = hourCounts[0];
        for (int count: hourCounts) {
            if(count < min){
                min = count;
            }
        }
        return min;
    }

    public int busiestInTwoHours(){
        int max = hourCounts[0];
        for (int i = 0; i < hourCounts.length; i= i +2){
            if(hourCounts[i] > max){
                max = hourCounts[i];

            }
        }
        return max;
    }


}
