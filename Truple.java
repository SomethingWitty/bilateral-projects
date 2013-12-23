import java.util.*;

public class Truple
{
  private List<String> list;
  private String name;
  private int count;
  private int originalCount;
  public Truple(String name, String partner)
  {
    list = new LinkedList<String>();
    list.add(partner);
    this.name = name;
    this.count = 1;
    this.originalCount = 1;
  }
  public void addPartner(String partner)
  {
    list.add(partner);
    count = count + 1;
    originalCount = originalCount + 1;
  }
  public void removePartner(String partner)
  {
    if(list.contains(partner))
      count = count - 1;
  }
  public boolean contains(String partner)
  {
    return list.contains(partner);
  }

  public String getName()
  {
    return name;
  }
  public int getCount()
  {
    return count;
  }
  public void setCount(int count)
  {
    this.count = count;
  }
  public void resetCount()
  {
    count = originalCount;
  }
}