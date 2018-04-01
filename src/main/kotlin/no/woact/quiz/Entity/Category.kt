import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.validation.constraints.NotNull

// Entity class
@Entity
class Category {

    @Id
    @GeneratedValue
    @NotNull
    var id: Long? = null

    @NotNull
    var title: String? = null

    @NotNull @OneToMany(mappedBy = "Category")
    var questions: ArrayList<Question> = ArrayList()

}