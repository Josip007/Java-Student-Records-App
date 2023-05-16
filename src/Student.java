public class Student {
    private String name;
    private String lastName;
    private int yearOfStudy;
    private String indexNumber;
    public Student(String name, String lastName, int yearOfStudy, String indexNumber) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfStudy = yearOfStudy;
        this.indexNumber = indexNumber;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public int getYearOfStudy() {
        return yearOfStudy;
    }
    public String getIndexNumber() {
        return indexNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    public void  setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + name + '\'' +
                ", prezime='" + lastName + '\'' +
                ", godinaStudija=" + yearOfStudy +
                ", brojIndeksa='" + indexNumber + '\'' +
                '}';
    }

}
