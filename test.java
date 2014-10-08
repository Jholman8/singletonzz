public class LogManager
 {
	private java.io.PrintStream m_out;

	private LogManager( PrintStream out ) 
	{
	 m_out = out;
	}

	public void log( String msg ) 
	{
	 m_out.println( msg );
	}
	static private LogManager sm_instance;
	static public LogManager getInstance()
	{
	 if ( sm_instance == null )
		sm_instance = new LogManager( System.out );
	 return sm_instance;
	}
 }

LogManager.getInstance().log( "LOG MESSAGE" );
