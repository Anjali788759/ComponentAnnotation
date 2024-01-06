package ComponentAnnotation;

import org.springframework.stereotype.Component;


@Component
public class Cricket implements  Game{
    @Override
    public void getGameType() {
        System.out.println("outdoor game");
    }

    @Override
    public void getGameInformation() {
        System.out.println("120 score");
        System.out.println("sachine won the match");
    }
}
