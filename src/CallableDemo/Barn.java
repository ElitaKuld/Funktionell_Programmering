package CallableDemo;

public class Barn {
    int id;
    String namn;
    String adress;
    int landId;
    int ansvarigFörBarn;

    public Barn(){}

    public Barn(int id, String namn, String adress, int landId, int ansvarigFörBarn) {
        this.id = id;
        this.namn = namn;
        this.adress = adress;
        this.landId = landId;
        this.ansvarigFörBarn = ansvarigFörBarn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getLandId() {
        return landId;
    }

    public void setLandId(int landId) {
        this.landId = landId;
    }

    public int getAnsvarigFörBarn() {
        return ansvarigFörBarn;
    }

    public void setAnsvarigFörBarn(int ansvarigFörBarn) {
        this.ansvarigFörBarn = ansvarigFörBarn;
    }
}