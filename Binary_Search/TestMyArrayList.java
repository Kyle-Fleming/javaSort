public class TestMyArrayList {
  public static void main(String[] args) {
    // Create a list of circles and rectangles
    MyArrayList<Integer> list1 = new MyArrayList<>();
	
	
	
	
	list1.add(0,Integer.valueOf(3));
    list1.add(1,Integer.valueOf(8));
    list1.add(2,Integer.valueOf(17));
	list1.add(3,Integer.valueOf(6));
    list1.add(4,Integer.valueOf(4));
    list1.add(5,Integer.valueOf(14));
	list1.add(6,Integer.valueOf(1));
    list1.add(7,Integer.valueOf(2));
    list1.add(8,Integer.valueOf(15));
    
    System.out.println("list1 = " + list1);
	list1.sortList();
	System.out.println("list = " + list1);
	
	
    System.out.println("\n find 17 = " + list1.binarySearch(Integer.valueOf(17)));
	System.out.println("\n find 1 = " + list1.binarySearch(Integer.valueOf(1)));
	System.out.println("\n find 4 = " + list1.binarySearch(Integer.valueOf(4)));
	System.out.println("\n find 14 = " + list1.binarySearch(Integer.valueOf(14)));
	
  }
  
}