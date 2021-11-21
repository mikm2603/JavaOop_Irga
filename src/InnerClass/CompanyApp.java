package InnerClass;

public class CompanyApp {
    public static void main(String[] args) {
         /*
        Berhubung Employee merupakan inner class dari Company, maka ketika kita membuat object dari Employee maka harus
        membuat class company terlebih dahulu.
        */
        Company company = new Company();
        company.setName("Bakaran Project");
        /*
        Ketika sudah, maka kita memanggil class Employee dengan diawali oleh kelas Company dahulu sebagai outer, lalau di hubungkan
        dengan tanda titik. Contoh : Company.Employee.
        Namun ketika ingin mendeklarasikan new Employee(), kita tidak bisa menggunakan class companynya, contoh : Company.new Employee()
        hal tersebut akan error, kita harus menggunakan object dari class Company yaitu company. Maka dari itu kita harus sudah
        membuat object company terlebih dahulu sebelum membuat class inner.
         */
        Company.Employee employee = company.new Employee();
        employee.setName("Eko");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("PT Sitohung");
        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Rudi");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
