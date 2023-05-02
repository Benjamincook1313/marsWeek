public class Main {

  public static void main(String[] args) throws InterruptedException {
//    part 1
    String colonyName = "Joe";
    int shipPopulation = 300;
    double meals = 4000.00;
    boolean landing = landingCheck(12);

// part 2
    meals = meals - (shipPopulation * .75) * 2;
    meals += meals * .5;
    shipPopulation += 5;
    System.out.println("After landing there is " + meals + " meals left for the crew");

//  part 3
    String landingLocation = "The Ocean";

    if(landingLocation.equalsIgnoreCase("the plain")) System.out.println("Bbzzz");
    else System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");

//    landingCheck(12);
  }

  private static boolean landingCheck(int minutesLeft) throws InterruptedException {
    int minute = 0;

    System.out.println("Directions\n");
    while(minute < minutesLeft){
      if(minute % 2 == 0 && minute % 3 == 0) System.out.println("Keep Center");
      else if(minute % 2 == 0) System.out.println("Right");
      else if(minute % 3 == 0) System.out.println("Left");
      else System.out.println("Calculating");
      Thread.sleep(250);
      minute++;
    }
    System.out.println("Landed");

    return false;
  }
}