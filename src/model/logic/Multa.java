package model.logic;

public class Multa {

	private Caracteristica caracteristicas;
	private Ubicacion ubicacion;

	
	/**
	 * Metodo constructor
	 * @param pPropiedades
	 * @param pUbicacion
	 */
	public Multa(Caracteristica pPropiedades, Ubicacion pUbicacion) {
		this.caracteristicas = pPropiedades;
		this.ubicacion = pUbicacion;
    }
    
    public Caracteristica getCaracteristicas()
    {
        return caracteristicas;
    }

    public Ubicacion getUbicacion()
    {
        return ubicacion;
    }

}