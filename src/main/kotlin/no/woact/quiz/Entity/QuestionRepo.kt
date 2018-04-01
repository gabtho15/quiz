import org.springframework.data.jpa.repository.JpaRepository

interface QuestionRepo : JpaRepository<Question, Long> {

    fun findQuestionsByCategoryId(categoryId: Long?): ArrayList<Question>
    fun findQuestionsByCategoryName(categoryName: String): ArrayList<Question>

}