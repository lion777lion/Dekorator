package NonDecorator;

public class ManaXep extends DeveloperDecorator {
    public ManaXep(Developer developer) {
        super(developer);
    }

    public String manageProject(){
        return ".....fucking brain......";
    }
    @Override
    public String makeJob(){
        return super.makeJob() + manageProject();
    }
}
