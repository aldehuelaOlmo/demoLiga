package beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EquipoBean {

	/*Name to team*/
	private String nombre;

	/*Name to liga*/
	private String liga;

	/*Name to player*/
	private String jugador;
}
