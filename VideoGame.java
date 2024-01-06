package ComponentAnnotation;

import org.springframework.stereotype.Component;

@Component
public class VideoGame implements Game{
    @Override
    public void getGameType() {
        System.out.println("indoor game");
    }

    @Override
    public void getGameInformation() {
        System.out.println("game name is:PUBG");
        System.out.println("single player can play");
    }
}
