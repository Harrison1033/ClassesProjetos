package teste;

import java.util.List;

//Métodos Genéricos
public class ClasseQuatro {
    public static void main(String[] args) {
        List<Car> carList = criandoArryComObjeto(new Car("fusca"));
        System.out.println(carList);
    }

    private static <T> List<T> criandoArryComObjeto(T t) {
        return List.of(t);
    }
    public static class Car {
        private final String name;

        public Car(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Car{" + "name='" + name + '\'' + '}';
        }
    }
}
