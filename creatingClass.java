public class creatingClass {
    public static class Person{
        private String name;
        private int age;

        public Person(String name,int age){
            this.name=name;
            this.age=age;
        }
        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public void setName(String name){
            this.name=name;
        }
        public void setAge(int age){
            this.age=age;
        }
    }

    public static void main(String[] args){
        Person p1=new Person("Rudraksh",22);
        System.out.println(p1.getName()+" is "+p1.getAge()+" years old.");
        p1.setAge(25);
        System.out.println(p1.getName()+" is now "+p1.getAge()+" years old.");
    }
}
