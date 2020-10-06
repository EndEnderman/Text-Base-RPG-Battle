import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random ran = new Random();
    int Slimelv1Hp = 10;
    int Sattacklv1 = 0;
    int SlimeRA = 0;
    int PHitlv1 = 0;
    int PlayerHp = 15;
    int PlayerMPlv1 = 5;
    int Spellc = 0;
    String go = "Game Over";
    System.out.println("Started Game \n \nA Slime appered \n");
    for (int i = 1; i < 21; i++){
      System.out.println("Round: " + i);
      System.out.println("Slime Hp: " + Slimelv1Hp);
      System.out.println("Player Hp: " + PlayerHp);
      System.out.println("Player Mp: " + PlayerMPlv1);
      System.out.print("Your actions: \n1. Hit \n2. Spells \nWhat will you do? ");
      int lols = scan.nextInt();
      if (lols == 1){
        PHitlv1 = ran.nextInt(5);
        Slimelv1Hp = Slimelv1Hp - PHitlv1;
        System.out.println("You hit the Slime and losed " + PHitlv1 + " Hp and now have" + Slimelv1Hp + " Hp");
      }
      else if (lols == 2 && PlayerMPlv1 != 0){
        System.out.print("Spells: \n1. Fire \n2. Water \nWhat you will do? ");
        Spellc = scan.nextInt();
        if (Spellc == 1 && PlayerMPlv1 > 3){
          Slimelv1Hp = Slimelv1Hp - 5;
          System.out.println("You Casted Fire to the Slime and it losed 5 Hp");
          PlayerMPlv1 = PlayerMPlv1 - 3;
        }
        else if (Spellc == 2 && PlayerMPlv1 > 1){
          Slimelv1Hp = Slimelv1Hp + 5;
          System.out.println("You Casted Water to the Slime and gained 5 Hp");
          PlayerMPlv1 = PlayerMPlv1 - 1;
        }
        else if (Spellc == 3 && PlayerMPlv1 == 5){
          System.out.println("You decide to use the hack spell and got caught using so this program will stop running and the Slime will stay live ever and ever");
          System.exit(0);
        }
        else{
          System.out.println("You don't have mp so you deicde to hit the Slime");
          PHitlv1 = ran.nextInt(5);
          Slimelv1Hp = Slimelv1Hp - PHitlv1;
          System.out.println("You hit the Slime and losed " + PHitlv1 + " Hp so it has now " + Slimelv1Hp + " Hp");
        }
      }
      else{
        System.out.println("That is not a action so you deicde to hit the Slime");
        PHitlv1 = ran.nextInt(5);
        Slimelv1Hp = Slimelv1Hp - PHitlv1;
        System.out.println("You hit the Slime and losed " + PHitlv1 + " Hp so it has now " + Slimelv1Hp + " Hp");
      }
      if (Slimelv1Hp < 0){
        System.out.println("The Slime has been killed, Good Job");
        System.out.println(go);
        System.exit(0);
      }
      SlimeRA = ran.nextInt(2);
      if (SlimeRA == 0 || SlimeRA == 1){
        Sattacklv1 = ran.nextInt(5);
        PlayerHp = PlayerHp - Sattacklv1;
        System.out.println("The Slime deicde to hit you and you losed " + Sattacklv1 + " Hp");
      }
      else{
        Slimelv1Hp = Slimelv1Hp + 4;
        System.out.println("The Slime deicde to heal it self so it gained 4 HP");
      } 
      if (PlayerHp < 0){
        System.out.println("You are dead no big suprise");
        System.out.println(go);
        System.exit(0);
      }
      System.out.println("");
    } 
  }
}