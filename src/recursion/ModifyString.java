package recursion;

public class ModifyString {
    public String modify(String s,StringBuilder sb) {
        if(s.length()==0){
            return sb.toString();
        }
        if(s.charAt(0)=='a'){
            modify(s.substring(1),sb);
        }else{
            modify(s.substring(1),sb.append(s.charAt(0)));
        }
        return sb.toString();
    }
    public String modify(String s) {
        if(s.length()==0){
            return "";
        }
        if(s.charAt(0)=='a'){
            return modify(s.substring(1));
        }
        return s.charAt(0)+modify(s.substring(1));
    }
    public String removeSubstring(String s,String sub) {
        if(s.length()==0){
            return "";
        }
        if(s.startsWith(sub)){
            return removeSubstring(s.substring(sub.length()),sub);
        }
        return s.charAt(0)+removeSubstring(s.substring(1),sub); 
    }

    public static void main(String[] args) {
        ModifyString obj = new ModifyString();
        System.out.println(obj.modify("paaaaaaaaapap",new StringBuilder()));
        System.out.println(obj.modify("papap"));
    }
}
