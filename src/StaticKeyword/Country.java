package StaticKeyword;

public class Country {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Static inner class
    /*
    yang bisa memakai keyword static cuma inner class, outer class nya tidak bisa.
     */
    public static class City{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
