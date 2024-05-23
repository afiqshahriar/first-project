public class Address {
    String division, district, subDistrict, village, house;
    Address(){};

    Address (String division, String district, String subDistrict, String village, String house){
        this.division = division;
        this.district = district;
        this.subDistrict = subDistrict;
        this.village = village;
        this.house = house;
    }

    public String getDistrict() {
        return district;
    }

    public String getDivision() {
        return division;
    }

    public String getSubDistrict() {
        return subDistrict;
    }

    public String getVillage() {
        return village;
    }

    public String getHouse() {
        return house;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void setSubDistrict(String subDistrict) {
        this.subDistrict = subDistrict;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
