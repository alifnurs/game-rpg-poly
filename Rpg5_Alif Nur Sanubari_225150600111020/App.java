public class App {
    public static void main(String[] args) {
        System.out.println("\nAlif Nur Sanubari (225150600111020)\n");

        //Static polymorphism pada class Hero dan static polymorphism pada class Enemy
        Hero hero = new Hero();
        hero.move();
        hero.move("left");
        Enemy enemy = new Enemy();
        enemy.move();
        enemy.move(3);
        System.out.println("");
        
        //Dynamic polymorphism sebuah referensi dari class Character ke objek class: Hero, Enemy, Witch, dan Fighter
        Character character = new Character();
        character.move();
        character = new Hero();
        character.move();
        character = new Enemy();
        character.move();
        character = new Fighter();
        character.move();
        character = new Witch();
        character.move();
        System.out.println("");

        //Dynamic polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter
        Character character2 = new Witch();
        character2.move();
        Character ch = (Fighter) character2;
        ch.move();
        


        
        
        
    }    
}
