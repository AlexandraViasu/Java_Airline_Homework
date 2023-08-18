public class Pilot extends CabinCrewMember{

    private String name;
    private CabinCrewMember rank;
    private String licenseNumber;

    public Pilot(String name, String licenseNumber, CabinCrewMember rank) {
        super(CabinCrewMember.rank());
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rank = CabinCrewMember;
    }
}
