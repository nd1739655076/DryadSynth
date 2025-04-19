package dispatcher;

import org.antlr.v4.runtime.*;

public class CustomErrorStrategy extends DefaultErrorStrategy {
    @Override
    public void reportError(Parser recognizer, RecognitionException e){
        throw e;
    }
}