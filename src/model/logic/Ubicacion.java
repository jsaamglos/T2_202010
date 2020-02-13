package model.logic;

public class Ubicacion 
{
	private String type;
	private Double[] coord;

	public Ubicacion(String pType, Double[] pCoord) {

		type = pType;
		coord = pCoord;

	}

	public String getType()
	{
		return type;
	}

	public Double[] getCoord()
	{
		return coord;
	}

}
