package org.icefaces.training.applicant.view.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("wordCapitalization")
public class WordCapitalizationConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
        return fixCapitalization(arg2);
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
        return fixCapitalization((String)arg2);
	}
    
    /**
     * Method to fix the case of the passed String.
     * The first letter of each word is capitalized.
     *
     * @param inString to fix capitalization on
     * @return capitalized result
     */
    private String fixCapitalization(String inString) {
	
		if(inString == null){
			return "";
		}
		
        StringBuffer str = new StringBuffer(inString.trim().toLowerCase());

        if (str.length() == 0) {
            return str.toString();
        }

        Character nextChar;
        int i = 0;
        nextChar = new Character(str.charAt(i));
        while (i < str.length()) {
            str.setCharAt(i++, Character.toUpperCase(nextChar.charValue()));

            if (i == str.length()) {
                return str.toString();
            }

            // Look for whitespace
            nextChar = new Character(str.charAt(i));
            while (i < str.length() - 2 &&
                   !Character.isWhitespace(nextChar.charValue())) {
                nextChar = new Character(str.charAt(++i));
            }

            if (!Character.isWhitespace(nextChar.charValue())) {
                // If not whitespace, we must be at end of string
                return str.toString();
            }

            // Remove all but first whitespace
            nextChar = new Character(str.charAt(++i));
            while (i < str.length() &&
                   Character.isWhitespace(nextChar.charValue())) {
                str.deleteCharAt(i);
                nextChar = new Character(str.charAt(i));
            }
        }

        return str.toString();
    }

}
