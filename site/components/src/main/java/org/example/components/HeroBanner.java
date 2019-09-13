package org.example.components;

import org.example.components.info.HeroBannerInfo;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;
import org.onehippo.cms7.essentials.components.CommonComponent;
//import org.onehippo.cms7.essentials.components.EssentialsDocumentComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Title component
@ParametersInfo(type = HeroBannerInfo.class)
public class HeroBanner extends CommonComponent {
	private static Logger log = LoggerFactory.getLogger(HeroBanner.class);
	@Override
    public void doBeforeRender(final HstRequest request, final HstResponse response) {
        super.doBeforeRender(request, response);
        HeroBannerInfo paramInfo = getComponentParametersInfo(request);
        String path = paramInfo.getBannerPath();
        log.debug("Calling Hero Banner Component for path:  [{}]", path);
        request.setAttribute(REQUEST_ATTR_PARAM_INFO, paramInfo);
        setContentBean(path, request, response);
        log.debug("After setting the request we can now get the values");
        
    }
}