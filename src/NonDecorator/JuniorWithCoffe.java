package NonDecorator;

public class JuniorWithCoffe extends DeveloperDecorator {
    public JuniorWithCoffe(Developer developer) {
        super(developer);
    }
    public String RunForCoffe(){
        return ".....Just a minute......";
    }

    @Override
    public String makeJob(){
        return super.makeJob() + RunForCoffe();
    }
}
