package test7_13.Sys;

public class isItNum {
    public boolean itnum(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            for (int j=0; j<10; j++){
                if(Math.abs(a)-'0'>= 0 && Math.abs(a)-'0' <= 9){
                    count++;
                    break;
                }
            }
        }
        if(count == s.length()){
            return true;
        }
        return false;
    }
}
