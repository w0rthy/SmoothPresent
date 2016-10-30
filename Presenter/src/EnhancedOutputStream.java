package smoothpresent;

import java.io.DataOutputStream;
import java.io.OutputStream;

public class EnhancedOutputStream extends DataOutputStream {
    
    public EnhancedOutputStream(OutputStream out) {
        super(out);
    }
    
    public void writeCmpInt(int val) throws Throwable {
        if(val==0){write(0);return;}
	int len = Math.max((int)((Math.log(val)/Math.log(2)))/8+1,1);
	write(len);
	while(len>0){
            len--;
            write(val>>>((len)*8));
	}
    }
    
    public void writeCmpFlt(double val) throws Throwable {
        writeCmpInt((int)val);
        double a = val-(double)(int)val;
        int pow = -1;
        byte[] b = new byte[64];
        int j;
        for(j = 0; a>0 && j < 64; j++){
            b[j] = 0;
            for(int i = 0; i < 8; i++){
                if(Math.pow(2.0, (double)pow)<=a){
                    a-=Math.pow(2.0,(double)pow);
                    b[j]=(byte)(b[j]|(1<<i));
                }
                pow--;
            }
        }
        write(j);
        for(int i = 0; i < j; i++)
            write(b[i]);
    }
    
    public void writeString(String str) throws Throwable {
        writeCmpInt(str.length());
        for(char c : str.toCharArray())
            writeChar(c);
    }
    
}
