package org.ead.system.back.domain.Category;

public class Category {

    private String CategoryId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (!CategoryId.equals(category.CategoryId)) return false;
        if (!CategoryName.equals(category.CategoryName)) return false;
        return Description.equals(category.Description);
    }

    @Override
    public int hashCode() {
        int result = CategoryId.hashCode();
        result = 31 * result + CategoryName.hashCode();
        result = 31 * result + Description.hashCode();
        return result;
    }

    private String CategoryName;
    private String Description;

    public Category(String categoryId, String categoryName, String description) {
        CategoryId = categoryId;
        CategoryName = categoryName;
        Description = description;
    }


    public String getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(String categoryId) {
        CategoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }




}
