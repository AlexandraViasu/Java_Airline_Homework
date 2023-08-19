public enum CrewRank {
    CAPTAIN("First"),
    COCAPTAIN("Second"),
    FLIGHTATTENDANT("Third");

    private final String rank;

    CrewRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

}
