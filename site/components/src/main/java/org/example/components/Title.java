package org.example.components;

import org.example.components.info.TitleInfo;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;
import org.onehippo.cms7.essentials.components.CommonComponent;
//import org.onehippo.cms7.essentials.components.EssentialsDocumentComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Title component
@ParametersInfo(type = TitleInfo.class)
public class Title extends CommonComponent{
	private static Logger log = LoggerFactory.getLogger(Title.class);
	@Override
    public void doBeforeRender(final HstRequest request, final HstResponse response) {
        super.doBeforeRender(request, response);
        TitleInfo paramInfo = getComponentParametersInfo(request);
        String title = paramInfo.getTitle();
        log.debug("Calling Title Component for title:  [{}]", title);
        request.setAttribute(REQUEST_ATTR_PARAM_INFO, paramInfo);
    }
}