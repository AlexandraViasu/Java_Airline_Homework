public class Pilot extends CabinCrewMember{


    private String licenseNumber;

    public Pilot(String name, String licenseNumber, CrewRank rank) {
        super(name, rank);
        this.licenseNumber = licenseNumber;

    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String fly(){
        return "Weeeeeeeee";
    }

}
