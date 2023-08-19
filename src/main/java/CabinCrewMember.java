public class CabinCrewMember extends CrewMember{


    public CabinCrewMember(String name, CrewRank rank) {
        super(name, rank);
    }

    public String announcement(String announcement){
        return "If we can have your attention for a second..." + announcement;
    }

}
