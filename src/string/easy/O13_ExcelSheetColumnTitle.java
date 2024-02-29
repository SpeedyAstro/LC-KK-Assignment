package string.easy;

public class O13_ExcelSheetColumnTitle {
public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            sb.insert(0, (char)('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        if (haystack.contains(needle)) {
            System.out.println(haystack.indexOf(needle));
        }
    }
}
