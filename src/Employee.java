public class Employee {

        private String fullName;
        private String position;
        private String email;
        private int phone;
        private int age;

        public Employee(String fullName, String position, String email, int phone, int age){
                this.fullName = fullName;
                this.position = position;
                this.email = email;
                this.phone = phone;
                this.age = age;
        }

        public String getFullName(){
                return fullName;
        }

        public  String getPosition(){
                return position;
        }

        public  String getEmail(){
                return email;
        }

        public int getPhone(){
                return phone;
        }

        public int getAge(){
                return age;
        }

        public void setFullName(String fullName){
                this.fullName = fullName;
        }

        public void setPosition(String position){
                this.position = position;
        }

        public void  setEmail(String email){
                this.email = email;
        }

        public void  setPhone(int phone){
                this.phone = phone;
        }

        public void setAge(int age){
                this.age = age;
        }
}
