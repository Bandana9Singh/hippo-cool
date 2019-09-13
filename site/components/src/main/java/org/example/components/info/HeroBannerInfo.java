package org.example.components.info;

import org.hippoecm.hst.core.parameters.JcrPath;
import org.hippoecm.hst.core.parameters.Parameter;
//import org.onehippo.cms7.essentials.components.info.EssentialsDocumentComponentInfo;

public interface HeroBannerInfo {
	//@JcrPath is for the navtigation menu
	@Parameter(name = "document1", required = true, displayName = "Banner Document Path")
	@JcrPath(isRelative = true, pickerInitialPath= "cms-pickers/documents-only", pickerSelectableNodeTypes = "hippo:document", pickerConfiguration = "cms-pickers/documents-only")
    String getBannerPath();
}