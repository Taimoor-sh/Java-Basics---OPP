
 class TableTwo {
    int x = 2;
    public static void main(String[] args) {
        TableTwo obj1 = new TableTwo();
        System.out.println("Table of 2 using java is as follows : ");
        for(int i = 1 ; i<=10 ; i++){
          System.out.println(obj1.x + "*" + i + '=' + obj1.x*i);;
        }
    }
  }
  
   class TableFive {
    int x = 5 ;
    public static void main(String[] args) {
      TableFive obj2 = new TableFive();
      System.out.println("Table of 5 using java is as follows :");
      for(int i = 1 ; i<=10 ; i++){
        System.out.println(obj2.x + " * " + i + " = " + obj2.x*i);;
      }
    }
  }

