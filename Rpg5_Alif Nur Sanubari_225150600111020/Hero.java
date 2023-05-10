public class Hero extends Character {
    @Override
    public void move(){
        System.out.println("Hero moving");
    }
    public void move(String direction){
        System.out.println("Hero Moving to the "+direction);
    }
}
