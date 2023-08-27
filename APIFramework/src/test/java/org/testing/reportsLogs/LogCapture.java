package org.testing.reportsLogs;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogCapture {
	public static void takeLogs(String ClassName,String logmsg) {
		DOMConfigurator.configure("../APIFramework/layout.xml");
		Logger L= Logger.getLogger(ClassName);
		L.info(logmsg);
	}

}
