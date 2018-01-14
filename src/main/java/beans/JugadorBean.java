package beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class JugadorBean {

	/*Name to player*/
	private String nombre;

	/*Name to team*/
	private String equipo;
}
