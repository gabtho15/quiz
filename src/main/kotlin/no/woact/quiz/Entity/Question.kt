import javax.persistence.*
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

// Entity class
@Entity
class Question {

    @Id
    @GeneratedValue
    @NotNull
    var id: Long? = null

    @NotNull
    var questionTitle: String? = null

    @NotEmpty
    var alternatives: ArrayList<String> = ArrayList()

    @NotNull
    var correctAlternative: Int? = null

    @ManyToOne
    var category: Category? = null


}