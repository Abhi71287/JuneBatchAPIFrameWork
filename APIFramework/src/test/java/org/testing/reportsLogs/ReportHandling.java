package org.testing.reportsLogs;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportHandling {
	
	public static ExtentReports takeReport(String Path) {
		ExtentReports reports = new ExtentReports(Path,false);
		return reports;
	}

}
