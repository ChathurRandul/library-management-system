package util;

public class Category {
    private String category;

    public Category() {
    }

    public Category(String category) {
        this.setCategory(category);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category='" + getCategory() + '\'' +
                '}';
    }
}
