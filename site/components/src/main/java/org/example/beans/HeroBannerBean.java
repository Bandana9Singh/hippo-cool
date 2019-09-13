package org.example.beans;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;

@HippoEssentialsGenerated(internalName = "hippocool:herobanner")
@Node(jcrType = "hippocool:herobanner")
public class HeroBannerBean extends BaseDocument {
	
	@HippoEssentialsGenerated(internalName = "hippocool:title")
	public String getTitle() {
		return getSingleProperty("hippocool:title");
	}
	
	@HippoEssentialsGenerated(internalName = "hippocool:content")
	public HippoHtml getContent() {
		return getHippoHtml("hippocool:content");
	}
	
	@HippoEssentialsGenerated(internalName = "hippocool:image")
	public HippoGalleryImageSet getImage() {
		return getLinkedBean("hippocool:image", HippoGalleryImageSet.class);
	}
	
	@HippoEssentialsGenerated(internalName = "hippocool:link")
	public HippoBean getLink() {
		return getLinkedBean("hippocool:link", HippoBean.class);
	}
}
