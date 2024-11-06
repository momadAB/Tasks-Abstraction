public class Teacher extends Person {
  private final String school;
  private final String subject;

  public Teacher(String name, String school, String subject) {
    super(name);
    this.school = school;
    this.subject = subject;
  }

  @Override
  public void describeRole() {
    System.out.printf("%s teaches %s at %s.%n", getName(), subject, school);
  }
}
