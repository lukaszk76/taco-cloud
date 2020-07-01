package tacos;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {
	@NotNull
    @Size(min=5, message="Nazwa musi składać się z minimum 5 znaków.")
	private String name;
	@Size(min = 1,message = "Musisz wybrać przynjmniej jeden składnik.")
	private List<String> ingredients;
}
