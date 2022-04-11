package storetesting.questions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import storetesting.userinterface.ShippingPage;

public class Answer implements Question<Boolean> {
    private  String question;

    public  Answer(String question){ this.question = question;

    }
    public static Answer toThe(String question){
        return new Answer((question));
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String nameTil = Text.of(ShippingPage.VERIFY_TITLE).viewedBy(actor).asString();

        System.out.println(question);
        System.out.println(nameTil);

        if (question.equals(nameTil)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }



}

