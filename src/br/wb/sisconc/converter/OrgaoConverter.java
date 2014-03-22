package br.wb.sisconc.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.wb.sisconc.beans.Orgao;
import br.wb.sisconc.dao.OrgaoDAO;

@FacesConverter(forClass=Orgao.class)
public class OrgaoConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		return new OrgaoDAO().buscarPorId(Orgao.class, Integer.parseInt(arg2));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		
		if (arg2 instanceof Orgao){
			Orgao orgao = (Orgao) arg2;
			return String.valueOf(orgao.getCodigo());
		}
		return "";
	}

}
