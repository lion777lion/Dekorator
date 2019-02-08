package NonDecorator;

public class TesterPhpDeveloper extends DeveloperDecorator {
    public TesterPhpDeveloper(Developer developer) {
        super(developer);
    }

    public String madeCodeTest(){
        return ".....testing code.....";

    }
    @Override
    public String makeJob(){
        return super.makeJob() + madeCodeTest();
    }
}
