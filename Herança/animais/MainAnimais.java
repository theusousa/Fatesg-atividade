package animais;

import java.util.ArrayList;
import java.util.List;

public class MainAnimais {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Rex", 3));
        animais.add(new Gato("Mimi", 2));
        animais.add(new Papagaio("Loro", 5));

        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }
}
