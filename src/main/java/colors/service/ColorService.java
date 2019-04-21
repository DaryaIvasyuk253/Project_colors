package colors.service;

public interface ColorService {
    default void define(){
        System.out.println(this.toString());
    }
}
