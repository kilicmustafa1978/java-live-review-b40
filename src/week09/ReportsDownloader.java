package week09;

import java.util.Arrays;

public class ReportsDownloader {
    public static void main(String[] args) {
        String reports = "CF32;CF11;CF33;CF99";

        String[] reportsArray = reports.split(";");
        System.out.println(reportsArray.length);
        System.out.println(Arrays.toString(reportsArray));

        for (int i = 0; i < reportsArray.length; i++) {
            System.out.println(i+1+". Downloading "+reportsArray[i]);

        }

    }
}
