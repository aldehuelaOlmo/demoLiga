package entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "LIGA")
public class LigaEntity {

	/*Identifier*/
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

	/*This attribute content the year*/
	@NotNull
    @Column(name = "CODE", length = 50)
	private String temporada;

	/*This attribute content the teams that are this "liga"*/
	@OneToMany(mappedBy = "liga", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private EquipoEntity equipo;
}
