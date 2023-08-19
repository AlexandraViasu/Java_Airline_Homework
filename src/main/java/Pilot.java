public class Pilot extends CabinCrewMember{


    private String licenseNumber;

    public Pilot(String name, String licenseNumber, CabinCrewMember rank) {
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
