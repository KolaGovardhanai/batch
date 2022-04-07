class Employee{

      private int id;
      private String name;
      private int age;

   public void setId(int empId){
    id = empId;
    }
     public int getId(){
      return id;
     }
    public void setName(String empName){
    name = empName;
    }
     public String getName(){
      return name;
     }
   public void setAge(int empAge){
    age = empAge;
    }
     public int getAge(){
      return age;
     }
     public static void main(String args[])
      {
    Employee employee = new Employee();
      employee.setId(1);
      employee.setName("abcd");
      employee.setAge(23);
    System.out.println("employee.getId()");
    System.out.println("employee.getName()");
    System.out.println("employee.getAge()");
     }
  }
    


   
   
   