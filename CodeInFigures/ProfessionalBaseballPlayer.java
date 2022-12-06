public class ProfessionalBaseballPlayer extends BaseballPlayer
{
   double salary;

   public ProfessionalBaseballPlayer(int id, double avg) {
      super(id, avg);
   }

   public ProfessionalBaseballPlayer() {
      super();
   }

   public static void showOrigins()
   {
      BaseballPlayer.showOrigins();
      System.out.println("The first professional " +
              "major league baseball game was played in 1871");
   }
}



