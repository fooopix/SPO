package lexer;

import java.util.regex.Pattern;

class Lexeme {
    final String type;
    final Pattern pattern;

    Lexeme(String type, Pattern pattern){
        this.type = type;
        this.pattern = pattern;
    }

    Lexeme(String type, String reg_value) {
        this.type = type;
        this.pattern = Pattern.compile(reg_value);
    }
//jopa
    @Override
    public String toString() {
        return (type + "  @  " + pattern);
    }
/*
    public String getType() {
        return type;
    }

    public Pattern getPattern() {
        return pattern;
    }
*/
}
