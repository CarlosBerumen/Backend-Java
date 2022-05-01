package harrypotter.practicaharry;

public class characters {
    private String name;
    private String house;
    private String gender;
    private String boggart;
    private String patronus;

    public characters(){
    }

    public characters(String name, String house, String gender, String boggart, String patronus) {
        this.name = name;
        this.house = house;
        this.gender = gender;
        this.boggart = boggart;
        this.patronus = patronus;
    }
    public String getName() {  return name;  }
    public String getHouse() {  return house;  }
    public String getGender() {  return gender;  }
    public String getBoggart() {  return boggart;  }
    public String getPatronus() {  return patronus;  }

    public boolean setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
            return true;
        }
            return false;
    }

    public boolean setHouse(String house){
        if (!house.isEmpty()){
            this.house = house;
            return true;
        }
            return false;
    }

    public boolean setGender(String gender){
        if (gender.isEmpty()){
            this.gender = gender;
            return true;
        }
            return false;
    }

    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }
            return false;
    }

    public boolean setPatronus(String patronus){
        if (!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }
            return false;
    }

    String showMessage() {
        return "Name: " + name +
                "\nHouse: " + house +
                "\nGender: " + gender +
                "\nBoggart: " + boggart +
                "\nPatronus: " + patronus;
    }

}
