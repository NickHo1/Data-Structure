package com.he;

public class Student {
  private String name;

  public Student() {
  }

  public Student(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

//检查传入的对象是否与此对象相同
  @Override
  public boolean equals(Object obj) {
    //如果对象与此对象是同一个对象，则返回true
    if (this == obj)
      return true;
    //如果传入的对象为null，则返回false
    if (obj == null)
      return false;
    //如果传入的对象的类不是与此对象相同的类，则返回false
    if (getClass() != obj.getClass())
      return false;
    //将other设置为传入的对象
    Student other = (Student) obj;
    //如果此对象的名称为null，而other对象的名称不为null，则返回false
    if (name == null) {
      if (other.name != null)
        return false;
    //如果此对象的名称不为null，而other对象的名称为null，则返回false
    } else if (!name.equals(other.name))
      return false;
    //如果此对象的名称不为null，而other对象的名称不为null，则返回false
    return true;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + "]";
  }
}