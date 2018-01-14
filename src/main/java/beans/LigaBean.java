package beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LigaBean {

	/*This attribute content the year*/
	private String temporada;

	/*This attribute content the teams that are this "liga"*/
	private String equipo;
}
