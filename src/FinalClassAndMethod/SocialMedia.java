package FinalClassAndMethod;

class SocialMedia {
    final void login(String username, String password){

    }
}
final class Facebook extends SocialMedia {
    /*
    final void login(String username, String password){
       Ini akan error, karena method login sudah dikasih keyword final, sehingga tidak dapat di override/deklarasi ulang
    }

     */
}
/*
class FakeFacebook extends Facebook{
    Ini akan error, karena class Facebook sudah dikasih keyword final. Sehingga tidak dapat diturunkan
}
 */


