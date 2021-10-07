package Interface;

public interface Car extends Brand{
    //Method pada interface tidak memiliki isi sama seperti abstract
    void drive();
    int getJumlahBan();
    void setName(String nama);
    void setJumlahBan(int jumlahBan);

    //Contoh default method
    default boolean isBig(){
        return false;
    }
    /*Kita tidak wajib mengoverridenya di class yang mengimplements Car. Karena sudah diberikan default value
    Yaitu false
     */

}
