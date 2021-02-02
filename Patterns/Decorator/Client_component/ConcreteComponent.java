package Patterns.Decorator.Client_component;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("This is Concrete Component");
    }
}