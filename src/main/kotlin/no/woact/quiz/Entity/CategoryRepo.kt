import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepo : JpaRepository<Category, Long>{

    // findById => Default added
    fun findByCategoryName(categoryName: String?): Category?

}