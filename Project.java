public class Project
{
  private String one;
  private String two;
  public Project(String one, String two)
  {
    this.one = one;
    this.two = two;
  }
  public boolean contains(String employee)
  {
    if(one.equals(employee) || two.equals(employee))
      return true;
    return false;
  }
  public String getOne()
  {
    return one;
  }
  public String getTwo()
  {
    return two;
  }
  public String toString()
  {
    return one + ", " + two;
  }
}