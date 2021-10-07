package EnumClass;

public enum Level {
    /*
        memisahkan option dengan koma, akan tetapi jika sudah terakhir tidak perlu koma
     */

    //Value enum
    Standart("Ini Adalah Standar Level"),
    Premium("Ini Adalah Premium Level"),
    Vip("Ini Adalah Vip Level");

    public String getDescription() {
        return description;
    }

    //Jika dibawahnya ada method maka yang terakhir bisa di kasih ; agar tidak error
    /*
    Ketika kita menambahkan constructor, maka kita harus menggunakannya ketika kita membuat value enum
     */
    private String description;
    Level(String description){
        this.description = description;
    }
}
