import java.util.Random;

interface SharedConstants{
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;

    // only variables no methods
}

class Question implements SharedConstants{
    Random rand = new Random();

    int ask(){
        int prob = (int)(100 * rand.nextDouble());
        if (prob < 30) return NO;
        if (prob < 60) return YES;
        if (prob < 75) return LATER;
        if (prob < 98) return SOON;
        else return NEVER;
    }
}

class AskMe implements SharedConstants{
    static void answer(int result){
        switch(result) {
            case NO: System.out.println("No"); break;
            case YES: System.out.println("Yes"); break;
            case MAYBE: System.out.println("Maybe"); break;
            case LATER: System.out.println("Later"); break;
            case SOON: System.out.println("Soon"); break;
            case NEVER: System.out.println("Never"); break;
        }
    }
}
public class o60_varibales_in_interface {
    public static void main(String[] agrs){
        Question q = new Question();
        AskMe.answer(q.ask());
        AskMe.answer(q.ask());
        AskMe.answer(q.ask());
        AskMe.answer(q.ask());
    }
}
