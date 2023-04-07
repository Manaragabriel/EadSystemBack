package unit;

import org.ead.system.back.domain.Category.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class CategoryTests {

    @Test
    public void createAnCategoryInstance(){
        final String Id = UUID.randomUUID().toString();
        final String CategoryName = "Front End";
        final String Description = "Description test";

        Category category = new Category(
                Id,
                CategoryName,
                Description

        );
        Assertions.assertEquals( Id,category.getCategoryId());
        Assertions.assertEquals(CategoryName, category.getCategoryName() );
        Assertions.assertEquals( Description,category.getDescription());

    }
}
