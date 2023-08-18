public enum CabinCrewMember {
    CAPTAIN("First"),
    COCAPTAIN("Second"),
    FLIGHTATTENDANT("Third");

    public String name;
    private final String rank;


   CabinCrewMember(String rank) {
       this.rank =rank;
   }

    public String getRank() {
        return rank;
    }
}
