package org.example.components.info;

import org.hippoecm.hst.core.parameters.Parameter;
import org.onehippo.cms7.essentials.components.info.EssentialsDocumentComponentInfo;

public interface TitleInfo extends EssentialsDocumentComponentInfo{
	
	@Parameter(name = "title", required = true, displayName = "Page Title")
    String getTitle();
}
