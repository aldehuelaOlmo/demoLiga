package entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "EQUIPO")
public class EquipoEntity {

	/*Identifier*/
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

	/*Name to team*/
	@NotNull
    @Column(name = "CODE", length = 50)
	private String nombre;

//	/*Name to league*/
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "LIGA_ID", foreignKey = @ForeignKey(name = "FK_EQUIPO_LIGA"))
//	private LigaEntity liga;
//
//	/*Name to player*/
//	@OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private JugadorEntity jugador;
}
