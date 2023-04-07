package org.ead.system.back.domain.Course;

public class Course {

    private String CourseName;
    private String ShortDescription;
    private String LongDescription;
    private Double Price;
    private Boolean IsActive;
    public Course(String courseId, String courseName, String shortDescription, String longDescription, Double price, Boolean isActive) {
        CourseId = courseId;
        CourseName = courseName;
        ShortDescription = shortDescription;
        LongDescription = longDescription;
        Price = price;
        IsActive = isActive;
    }

    public String getCourseId() {
        return CourseId;
    }

    public void setCourseId(String courseId) {
        CourseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getShortDescription() {
        return ShortDescription;
    }

    public void setShortDescription(String shortDescription) {
        ShortDescription = shortDescription;
    }

    public String getLongDescription() {
        return LongDescription;
    }

    public void setLongDescription(String longDescription) {
        LongDescription = longDescription;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Boolean getActive() {
        return IsActive;
    }

    public void setActive(Boolean active) {
        IsActive = active;
    }

    private String CourseId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (!CourseId.equals(course.CourseId)) return false;
        if (!CourseName.equals(course.CourseName)) return false;
        if (!ShortDescription.equals(course.ShortDescription)) return false;
        if (!LongDescription.equals(course.LongDescription)) return false;
        if (!Price.equals(course.Price)) return false;
        return IsActive.equals(course.IsActive);
    }

    @Override
    public int hashCode() {
        int result = CourseId.hashCode();
        result = 31 * result + CourseName.hashCode();
        result = 31 * result + ShortDescription.hashCode();
        result = 31 * result + LongDescription.hashCode();
        result = 31 * result + Price.hashCode();
        result = 31 * result + IsActive.hashCode();
        return result;
    }



}
