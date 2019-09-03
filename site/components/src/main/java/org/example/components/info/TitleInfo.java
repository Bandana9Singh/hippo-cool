package org.example.components.info;

import org.hippoecm.hst.core.parameters.Parameter;
//import org.onehippo.cms7.essentials.components.info.EssentialsDocumentComponentInfo;

public interface TitleInfo {
	
	@Parameter(name = "title", required = true, displayName = "Page Title")
    String getTitle();
	
	@Parameter(name = "pageNumber", defaultValue = "1", displayName = "Page Number")
	int getPageNumber();
}
