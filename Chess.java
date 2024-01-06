package ComponentAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Chess implements  Game{
    @Override
    public void getGameType() {
        System.out.println("indoor game");
    }

    @Override
    public void getGameInformation() {
        System.out.println("chess is good game ");
    }
}
