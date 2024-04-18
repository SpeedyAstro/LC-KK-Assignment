package StacksAndQueue;

public class DecodeString {
    public String decodeString(String s) {
StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c==']'){
                StringBuilder temp = new StringBuilder();
                while(sb.charAt(sb.length()-1)!='['){
                    temp.insert(0,sb.charAt(sb.length()-1));
                    sb.deleteCharAt(sb.length()-1);
                }
                sb.deleteCharAt(sb.length()-1);
                int k = 0;
                int base = 1;
                while(!sb.isEmpty() && Character.isDigit(sb.charAt(sb.length()-1))){
                    k = k + (sb.charAt(sb.length()-1)-'0')*base;
                    base = base*10;
                    sb.deleteCharAt(sb.length()-1);
                }
                while(k-->0){
                    for(char ch : temp.toString().toCharArray()){
                        sb.append(ch);
                    }
                }
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        DecodeString obj = new DecodeString();
        System.out.println(obj.decodeString("3[a]2[bc]"));
    }
}
