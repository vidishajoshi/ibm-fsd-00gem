package comm.practice;

public class Book extends Product {

	private static int item;
	private String name;
	private String author;
	
  public Book() {
	  super();
	  this.author=author;
	  this.name=name;
	 
  }
  
  public void getDetails() {
	  System.out.println("details of books are : Name : "+name+"author : "+author);
	  System.out.println("total item is :" +item);
  }

@Override
public int getCount() {
	// TODO Auto-generated method stub
	return super.getCount();
}


}
