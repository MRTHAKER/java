class LogFile{
	int counter=12;
	public class LogFileDetail{
	public void hello(){
	System.out.println("detail:"+counter);
	}
	}
	public static void main(String args[]){
	LogFile log =new LogFile();
	LogFile.LogFileDetail ld = log.new LogFileDetail();
	ld.hello();
	}
}