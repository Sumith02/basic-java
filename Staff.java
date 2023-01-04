import java.util.*;

 class Staff {
	 private String staffId:
	private String name;
	 private long phone;
	 private float salary;
	 public void accept()
	 {
		 Scanner sc new Scanner(System.in);
		 System.out.println("enter the staffId:");
		 staffId = sc.next();
System.out.println("enter name:");
name = sc.next();
System.out.println("enter phone:");
phone = sc.nextLong();
System.out.println("enter salary");
salary = sc.nextFloat();

}
	 public void display()
	 {
		 System.out.println("StaffId:" +staffId);
		 System.out.println("name:" +name);
		 System.out.println("phone:" +phone);
		 System.out.println("salary:" +salary);
	 }
}
 
 class Teaching extends Staff
 {
	 private String domain;
	 private String[] publications;
	 public void accept()
	 {
		 super.accept();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter domain:");
		 domain = sc.next();
		 System.out.println("enter the number of publications");
		 int n = sc.nextInt();
		 publications = new String[n];
		 System.out.println("enter the publications:");
		 for(int i=0; i<n; i++)
		 {
			 publications[i] =sc.next();
			 
		 }
	 }
	 public void display()
	 {
		 super.display();
		 System.out.println("domain" +domain);
		 System.out.println("publications:");
		 for (int i=0; i<publications.length; i++)
		 {
			 System.out.println(publications[i]);
		 }
	 }
 }

  class Technical extends Staff
  {
	  private String[] skills;
	  public void accept()
	  {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter number of skills:");
		  int n = sc.nextInt();
		  skills = new  String[n];
		  System.out.println("enter skills");
		  for(int i=0; i<n; i++) {
			  skills[i] = sc.next();
			  
		  }
	  }
	  public void display()
	  {
		  super.display();
		  System.out.println("skills");
		  for(int i=0; i<skills.length; i++) {
			  System.out.println(skills[i]);
		  }
	  }
	  
  }
  
  class Contract extends Staff
  {
	  private int period;
	  public void accept()
	  {
		  super.accept();
		  Scanner sc  = new Scanner(System.in);
		  period = sc.nextInt();
		  
	  }
	  public void display()
	  {
		  super.display();
		  System.out.println("period" +period);
	  }
  }
  class main
  {
	  public static void main(String[] args)
	  {
		  Teaching teaching =new Teaching();
		  Technical technical = new Technical();
		  Contract contract = new Contract();
		  System.out.println("enter details for teaching staff member");
		  teaching.accept();
		  System.out.println("enter details for technical staff members");
		  technical.accept();
		  System.out.println("enter detaiks for contract staff members");
		  contract.accept();
		  System.out.println("enter details for teaching staff member");
		  teaching.display();
		  System.out.println("enter details for technical staff members");
		  technical.display();
		  System.out.println("enter detaiks for contract staff members");
		  contract.display();
	  }
	  
  }