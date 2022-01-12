public class Programmer {

    static final String LVL1 = "intern";
    static final String LVL2 = "junior";
    static final String LVL3 = "middle";
    static final String LVL4 = "senior";
    static final String LVL5 = "lead";

    private String name;
    private String company;
    private String position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = LVL1;
    }

    public String getPosition() {
        return position;
    }

    public void work() {
        if (position.equals(LVL1) == true)
            position = LVL2;
        else if (position.equals(LVL2) == true)
            position = LVL3;
        else if (position.equals(LVL3) == true)
            position = LVL4;
        else if (position.equals(LVL4) == true)
            position = LVL5;
    }
}
