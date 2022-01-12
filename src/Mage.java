public class Mage {

    public String name;
    public int level;
    public int damage;
    public String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getInfo() {
        return name + ", " + level + ", " + damage + ", " + type;
    }

    public String fight(Mage mage) {
        if (type.equals(mage.type) == true) {
            if (level == mage.level) {
                if (damage == mage.damage)
                    return "draw";
                else {
                    if (damage > mage.damage)
                        return name;
                    else
                        return mage.name;
                }
            }
            else{
                if (level > mage.level)
                    return name;
                else
                    return mage.name;
            }
        }
        else if (type.equals("fire") == true && mage.type.equals("ice") == true)
            return name;
        else if(type.equals("fire") == true && mage.type.equals("earth") == true)
                    return mage.name;
        else if (type.equals("ice") == true && mage.type.equals("earth") == true)
            return name;
        else if (type.equals("ice") == true && mage.type.equals("fire") == true)
            return mage.name;
        else if (type.equals("earth") == true && mage.type.equals("fire") == true)
            return name;
        else
            return mage.name;
    }
}
