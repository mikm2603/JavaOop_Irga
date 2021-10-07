package InnerClass;

//Outer Class
public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Inner class
    public class Employee{
        private String name;

        //Inner class bisa mengakses private member milik outer class, contoh field name pada class Company
        public String getCompany(){
            return Company.this.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
