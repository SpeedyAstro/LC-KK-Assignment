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

    public static void main(String[] args) {
        ModifyString obj = new ModifyString();
        System.out.println(obj.modify("papap",new StringBuilder()));
        System.out.println(obj.modify("papap"));
    }
}
