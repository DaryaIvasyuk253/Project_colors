package colors.start;

import colors.service.ColorService;
import colors.Config;
import colors.service.PinkServiceImpl;
import colors.service.RedServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ColorService green = (ColorService) context.getBean("green");
        green.define();
        ColorService white = (ColorService) context.getBean("white");
        white.define();
        ColorService black = (ColorService) context.getBean("black");
        black.define();
        ColorService blue = (ColorService) context.getBean("blue");
        blue.define();
        ColorService yellow = (ColorService) context.getBean("yellow");
        yellow.define();
        ColorService orange = (ColorService) context.getBean("orange");
        orange.define();
        ColorService plum = (ColorService) context.getBean("plum");
        plum.define();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configur.xml");
        RedServiceImpl redService = applicationContext.getBean("red", RedServiceImpl.class);
        redService.define();
        PinkServiceImpl pinkService = (PinkServiceImpl) applicationContext.getBean("pink");
        pinkService.define();

    }



}
