package comm.practice;

public class testStatic extends Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Product p = null;
         System.out.println("book");
         p = new Book();
         
         /*
         Product p1= new Product();
         Product p2= new Electronics();
         Product p3=new Tv();
         */
         System.out.println("tv");
         p=new Tv();
         

         System.out.println("electronics");
         p=new Electronics();

         System.out.println("book");
         p=new Book();
       /* System.out.println("total item count in product is  : "+p1.getCount());
        System.out.println("total item count in book is  : "+p.getCount());
        System.out.println("total item count in electronics is  : "+p2.getCount());
        System.out.println("total item count in tv is  : "+p3.getCount());
        */
	}

}
