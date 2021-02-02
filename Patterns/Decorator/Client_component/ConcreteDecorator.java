package Patterns.Decorator.Client_component;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("Add decorator operation 1");
        super.operation();
        System.out.println("Add decorator operation 2");
    }
}