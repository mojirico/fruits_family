import java.util.*;

class Main {

  public static void main(String[] args) {

    Fruits[] apples = { new Apple("red", 100, 5, "fuji"), new Apple("magenda", 150, 2, "tsugaru"),
        new Apple("magenda", 80, 8, "ourin"), new Apple("magenda", 100, 9, "tsugaru"),
        new Apple("red", 200, 4, "fuji"), };

    int appleCount = apples.length;

    Fruits[] bananas = { new Banana("yellow", 50, 5, 3), new Banana("green", 30, 2, 4), new Banana("green", 40, 8, 4),
        new Banana("white", 100, 9, 2), new Banana("yellow", 45, 4, 4), new Banana("yellow", 60, 8, 2), };

    int bananaCount = bananas.length;

    Family[] family = { new Ichiro(0, 0), new Jiro(0, 0), new Saburo(0, 0, 0, 0) };

    Scanner sc = new Scanner(System.in);

    int gameCount = 0;

    while (appleCount > 0 || bananaCount > 0) {

      // ゲームは５回まで
      gameCount++;
      if (gameCount > 5) {
        break;
      }

      System.out.print("Do you want apple or yellow>");
      String fruit = sc.next();
      Fruits data;
      if (fruit.equals("apple")) {
        if (appleCount <= 0) {
          System.out.println("");
          System.out.println("Sorry! apple is sold out.");
          System.out.println("");
          continue;
        }
        data = apples[appleCount - 1];
        appleCount--;

      } else if (fruit.equals("banana")) {
        if (bananaCount <= 0) {
          System.out.println("");
          System.out.println("Sorry! banana is sold out.");
          System.out.println("");
          continue;
        }
        data = bananas[bananaCount - 1];
        bananaCount--;

      } else {
        System.out.println("");
        System.out.println("Sorry! write banana or apple.");
        System.out.println("");
        continue;
      }

      int manpukuCount = 0;
      for (int i = 0; i < family.length; i++) {
        if (family[i].isHungry()) {
          family[i].eat(fruit, data);
          if (!family[i].isHungry()) {
            manpukuCount++;
          }
        } else {
          manpukuCount++;
        }

      }

      if (manpukuCount == family.length) {
        System.out.println("");
        System.out.println(" Game Clear !!!! game count is " + gameCount);
        System.out.println("");
        for (int i = 0; i < family.length; i++) {
          System.out.print(family[i] + " : ");
          System.out.print(family[i].isHappyPercent() + "%\n");
        }
        System.out.println("");
        sc.close();
        return;
      } else {
        for (int i = 0; i < family.length; i++) {
          System.out.print(family[i] + " : ");
        }
        System.out.println("");
      }

    }
    System.out.println("");
    System.out.println("GAME OVER!");
    System.out.println("");
    for (int i = 0; i < family.length; i++) {
      System.out.print(family[i] + " : ");
      System.out.println(family[i].isHungry() ? "hungry." : "not hungry");
    }
    System.out.println("");

    sc.close();

  }
}