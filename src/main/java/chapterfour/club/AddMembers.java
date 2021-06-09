package chapterfour.club;

public class AddMembers {

    public static void main(String[] args) {
        Membership bongani = new Membership("Bongani", 6, 1990);
        Membership dani = new Membership("Dani",6,1990);
        Membership tester = new Membership("Tester",6,1990);
        Membership jan = new Membership("Jan", 1, 1989);

        Club club = new Club();

        club.join(bongani);
        club.join(dani);
        club.join(tester);
        club.join(jan);

        int noOfMembers = club.joinedInMonth(1);
        System.out.println(noOfMembers);

       int noOfRemoved = club.purge(0,1990).size();
        System.out.println(noOfRemoved);
    }
}
