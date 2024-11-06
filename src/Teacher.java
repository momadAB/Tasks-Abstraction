public class Teacher extends Person {
  private final String school;

  public Teacher(String name, String school) {
    super(name);
    this.school = school;
  }

  @Override
  public void describeRole() {
    System.out.printf("%s teaches at %s.%n", getName(), school);
  }
}
