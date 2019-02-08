package NonDecorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new ManaXep(new JuniorWithCoffe(new TesterPhpDeveloper(new PhpDevOp())));
        System.out.println(developer.makeJob());
    }
}