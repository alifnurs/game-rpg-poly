public class Enemy extends Character {
    @Override
    public void move(){
        System.out.println("Enemy moving");
    }
    public void move (int step){
        System.out.println("Enemy move "+step+" step");
    }
}
