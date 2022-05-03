package br.com.chainofresponsabilitypattern;

public class ChainOfResponsabilityClient {
	
	private static Logger doChaining() {
		
		Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);
		Logger errorLogger = new ErrorLogger(Logger.ERRORINFO);
		consoleLogger.setNextLevelLogger(errorLogger);
		Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
		errorLogger.setNextLevelLogger(debugLogger);
		return consoleLogger;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger chainLogger = doChaining();
		chainLogger.logMessage(Logger.OUTPUTINFO, "Entre com a sequencia de valores ");
		chainLogger.logMessage(Logger.ERRORINFO, "Um erro ocorreu agora");
		chainLogger.logMessage(Logger.DEBUGINFO, "Este foi o erro agora a depuracao");
		

	}

}
