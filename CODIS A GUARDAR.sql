-- SQL ===========================================================================================

-- crear columna ROLE --------------------------------------------
ALTER TABLE PED_REQUERIMENT ADD (REQ_ROLE_FINALIZA NUMBER);
ALTER TABLE PED_REQUERIMENT ADD CONSTRAINT PED_REQUERIMENT_ROLE_FIN_FK FOREIGN KEY (REQ_ROLE_FINALIZA) REFERENCES PED_ROLE (ROL_ID) ENABLE;

@JoinColumn(name = "DIL_ROLE_CREADOR", referencedColumnName = "ROL_ID")
@OneToOne(optional = true)
private Role roleCreador;


