package be.bstorm.demos.interfacesFonctionelles;

public class CommandImplExemple implements Command{
    @Override
    public void execute() {
        System.out.println("Hello world je suis la class impl");
    }
}
