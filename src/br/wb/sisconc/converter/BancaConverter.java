package br.wb.sisconc.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.wb.sisconc.beans.Banca;
import br.wb.sisconc.dao.BancaDAO;

@FacesConverter(forClass=Banca.class)
public class BancaConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		return new BancaDAO().buscarPorId(Banca.class, Integer.parseInt(arg2));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if(arg2 instanceof Banca){
			Banca banca = (Banca) arg2;	
			return String.valueOf(banca.getCodigo());
		}
		return "";
	}
	
}
