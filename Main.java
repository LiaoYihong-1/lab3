package lab3;

public class Main {
    public static void main(String [] args){
        CR ChristopherRobin=new CR("ChristopherRobin",30,Sex.MALE);
        Person Tom=new Person("Tom",22,Sex.MALE);
        Person Martha=new Person("Martha",25,Sex.FEMALE);
        Place river=new Place("river");
        Place rockbeach=new Place("rockbeach");

        rockbeach.membercome(ChristopherRobin);
        ChristopherRobin.changeStatus(Status.WAITING);
        ChristopherRobin.detailmove();
        rockbeach.membercome(Martha);
        Martha.changeStatus(Status.WAITING);
        Martha.detailmove();
        rockbeach.membercome(Tom);

        rockbeach.meet();
        rockbeach.moveto(river);

        ChristopherRobin.changeStatus(Status.WALKING);
        Martha.changeStatus(Status.WALKING);
        Tom.changeStatus(Status.WALKING);
        ChristopherRobin.setDestname(river.placename);
        Martha.setDestname(river.placename);
        Tom.setDestname(river.placename);
        Tom.detailmove();
        ChristopherRobin.detailmove();
        Martha.detailmove();

        rockbeach.arriveat(river);

        ChristopherRobin.changeStatus(Status.STANDINGBYRIVER);
        Martha.changeStatus(Status.STANDINGBYRIVER);
        Martha.changeStatus(Status.STANDINGBYRIVER);
        ChristopherRobin.detailmove();
        ChristopherRobin.say("\"Guess what,I once fell from a tree and fell into a bush.The i pulled out all the thorns frome me for week\"\n");
        Tom.say("\"Must be hurt\"\n");
    }
}
