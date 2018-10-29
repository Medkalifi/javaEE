package mesBeans;

import javax.servlet.jsp.tagext.TagData;
import javax.servlet.jsp.tagext.TagExtraInfo;
import javax.servlet.jsp.tagext.VariableInfo;

public class BonjourTagExtrainfo  extends TagExtraInfo{
	public VariableInfo[] getVariableInfo(TagData arg0) { 
		return new VariableInfo[] { 
			new VariableInfo ("prenom","java.lang.String",true,VariableInfo.NESTED), new VariableInfo 
			("classeTag","java.lang.String",true,VariableInfo.NESTED) 
			}; }

}
