package ComponentAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Mainapp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Cricket");
        System.out.println("2. Chess");
        System.out.println("3. VideoGame");
        System.out.println("ENTER YOUR CHOICE");
        int choice= scanner.nextInt();

        Game game=null;
        switch (choice){
            case 1:
                game=context.getBean("cricket", Cricket.class);
                break;
            case 2:
                game=context.getBean("chess",Chess.class);
                break;
            case 3:
                game=context.getBean("videoGame",VideoGame.class);
                break;
            default:
                System.out.println("invalide choice");
                break;
        }
        if(game!=null){
            game.getGameType();
            game.getGameInformation();
        }else{
            System.out.println("something worng");
        }
    }
}
