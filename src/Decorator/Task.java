package Decorator;


public class Task {
    public static void main(String[] args){
        Developer developer = new PhpDevOp();
        System.out.println(developer.makeJob());
    }
}
