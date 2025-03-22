package pe.joedayz;

/**
 * @author josediaz
 **/
public class SoccerPlayer {

  String name;

  public static void main(String[] args) {
    SoccerPlayer p = new SoccerPlayer();
    p.name = "Raul Ruiz Diaz";
    System.out.println(p);

    SoccerPlayer p2 = new SoccerPlayer();
    p2.name = "Raul Ruiz Diaz";
    System.out.println(p2.equals(p)); //los 2 estamos apuntando al mismo objeto?
    System.out.println(p2 == p);  // los 2 estamos apuntando al mismo objeto?
  }
}
