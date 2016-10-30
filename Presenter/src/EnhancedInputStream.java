package smoothpresent;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EnhancedInputStream extends DataInputStream {

    public EnhancedInputStream(InputStream in) {
        super(in);
    }

    public int readCmpInt() throws IOException {
        int a = 0;
        int len = read();
        if(len == 0)
            return 0;
        
        int tmp;
        while(len>0){
            tmp = read();
            a=(a<<8)+tmp;
            len--;
        }
        
        return a;
    }
    
    public double readCmpFloat() throws IOException {
        double tmp = (double)readCmpInt();
        int len = read();
        if(len == 0)
            return tmp;
        int pows = -1;
        int c = 0;
        while(len>0){
            c = read();
            for(int i = 0; i < 8; i++){
                if((c&(1<<i))>0)
                    tmp+=Math.pow(2.0, pows);
                pows--;
            }
            len--;
        }
        return tmp;
    }
    
    public String readString() throws IOException {
        int len = readCmpInt();
        StringBuilder sb = new StringBuilder();
        while(len>0){
            sb.append(readChar());
            len--;
        }
        return sb.toString();
    }
}
