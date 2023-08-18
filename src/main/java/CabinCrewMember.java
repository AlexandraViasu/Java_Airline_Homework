public enum CabinCrewMember {
    CAPTAIN("First", "Ashely"),
    COCAPTAIN("Second", "Olive"),
    FLIGHTATTENDANT("Third", "George");


    public String name;
    private final String rank;


   CabinCrewMember(String rank, String name) {
       this.rank = rank;
       this.name = name;
   }


    public String getRank() {
        return rank;
    }
}
