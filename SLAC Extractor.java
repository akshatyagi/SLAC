import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.*;
/**
 *
 * @author Akshat 
 */
class Write extends Writer{
    PrintWriter Writer_India = null, Writer_Sri_Lanka = null, Writer_Pakistan = null, Writer_Bangladesh = null, Writer_Bhutan = null, Writer_Maldives = null, Writer_Afghanistan = null,Writer_Nepal = null; 
    String destination_files[] = new String[]{"India.txt", "Srilanka.txt", "Pakistan.txt", "Bangladesh.txt", "Afghanistan.txt", "Nepal.txt","Maldives.txt","Bhutan.txt"};    	
`	Write(){
		try{
			Writer_India = new PrintWriter(destination_files[0], "UTF-8");
            Writer_Sri_Lanka = new PrintWriter(destination_files[1], "UTF-8");
            Writer_Pakistan = new PrintWriter(destination_files[2], "UTF-8");
            Writer_Bangladesh = new PrintWriter(destination_files[3], "UTF-8");
            Writer_Bhutan = new PrintWriter(destination_files[4], "UTF-8");
            Writer_Afghanistan = new PrintWriter(destination_files[5], "UTF-8");
            Writer_Nepal = new PrintWriter(destination_files[6], "UTF-8");
            Writer_Maldives = new PrintWriter(destination_files[7], "UTF-8");
            }catch(FileNotFoundException e){e.printStackTrace();} 
			catch(UnsupportedEncodingException e){e.printStackTrace();} 
		}
        // [1] : Sri Lanka : .sl
        // [2] : Pakistan : .pk
        // [3] : Bangladesh : .bd 
        // [4] : Afghanistan : .af
        // [5] : Nepal : .np
        // [6] : Maldives : .mv
        // [7] : Bhutan : .bt
		//package slac;
		//class Writer{
	public void close(){}
	public void flush(){}
    public void Writer(String Currentline, int index){ 
		switch(index){
            case 0: 
				//  Writer_India.write(Currentline+"\n");            
                break; 
            case 1: Writer_Sri_Lanka.write(Currentline+"\n");break;
            case 2: Writer_Pakistan.write(Currentline+"\n");break;
            case 3: Writer_Bangladesh.write(Currentline+"\n");break;
            case 4: Writer_Afghanistan.write(Currentline+"\n");break;
            case 5: Writer_Nepal.write(Currentline+"\n");break;
            case 6: Writer_Maldives.write(Currentline+"\n");break;
            case 7: Writer_Bhutan.write(Currentline+"\n");break;
        }
    }      
    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
public class SLAC {
    public static void main(String args[]){		
        Write object = new Write();
		// String Source = "E:\\Akshat\\Akshat\\Projects\\SLAC\\Raw Data\\ping-2016-02.txt";
        String Source = "E:\\Akshat\\Akshat\\Projects\\SLAC\\Raw Data\\complete.txt";
        //  String Source = "C:\\Users\\Akshat\\Desktop\\raw data\\complete.txt";
        String countries[]  = new String[]{".in ",".sl ",".pk ",".bd ",".af ",".np ",".mv ",".bt "};
		int limit = 500;
		BufferedReader obj = null;
		try{
			obj = new BufferedReader(new FileReader(Source));
            //   obj = new BufferedReader(new FileReader(file));
		}catch(FileNotFoundException e) {e.printStackTrace();}
		String CurrentLine = null;
        try{
            while((CurrentLine = obj.readLine())!= null){
                for(int i = 0; i<8; i++){
                    if (CurrentLine.contains(countries[i])){
                       // for(int j = 1; j<=limit; j++)
                        object.Writer(CurrentLine, i);    
                    }
                }
            }
		}catch(IOException e){e.printStackTrace();}
    }
}

