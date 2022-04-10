package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture 
{
public static void takeLog(String className, String msg)
{
	DOMConfigurator.configure("../YTF1framework/layout.xml");
    Logger log=	Logger.getLogger(className);
    log.info(msg);
}
}
