import sailpoint.object.PolicyViolation;
import sailpoint.object.Policy;

import sailpoint.api.SailPointContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PolicyNotificationTemplate  extends GlobalRuleLibrary {

	private static sailpoint.api.SailPointContext context=null;
	private static org.apache.commons.logging.Log log=null;
	private static sailpoint.object.PolicyViolation violation  = null;
	private static sailpoint.object.Policy policy  = null;

	public static void main(String[] args) {

		//Log mylogger = LogFactory.getLog("rule.PolicyNotification");
		//mylogger.debug("Start PolicyNotification");
		//add the following lines to IIQ Log4j properties file to use this logger
		//logger.PolicyNotification.name=rule.PolicyNotification 
		//logger.PolicyNotification.level=debug

		//mylogger.debug("End PolicyNotification");
		//	return Map
	}

}
