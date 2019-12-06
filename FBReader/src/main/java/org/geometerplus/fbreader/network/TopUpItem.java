

package org.geometerplus.fbreader.network;

import org.geometerplus.fbreader.network.urlInfo.UrlInfoCollection;

public class TopUpItem extends NetworkItem {
	public TopUpItem(INetworkLink link, UrlInfoCollection<?> urls) {
		super(
			link,
			NetworkLibrary.resource().getResource("topupTitle").getValue(),
			NetworkLibrary.resource().getResource("topupSummary").getValue(),
			urls
		);
	}
}
