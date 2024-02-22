package string.easy;

public class O3_GoalParserInterpretation {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
