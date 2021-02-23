public class Film implements Comparable
{
   protected String Name;
   protected String Age;
   protected int Length;
  
   public Film(String name,String age,int time)
   {
      Name = name; 
      Age = age;
      Length = time;

   }
   public String getName()
   {
     return Name;
    }
    
   public String getAge()
   {
     return Age;
    }
    
   public int getLength()
   {
    return Length;   
   } 
   
  
  
  public void setLength(int length)
   {
    Length = length;   
  }
   
 
   public void setName(String name)
   {
     Name = name;
    }
    
  public int compareTo(Object g) {
      
    if(this.getClass().equals(g.getClass()))
    {
     Film p = (Film)g;   
    if (this.getName().equals(p.getName()))
        return 0;
     else
            return 1;
    }
    else
     return this.getClass().getName().compareTo(g.getClass().getName());
  }
  
  public String toString()
  {
    return (Name+" "+Age+" "+Length);   
  }    
   
}
